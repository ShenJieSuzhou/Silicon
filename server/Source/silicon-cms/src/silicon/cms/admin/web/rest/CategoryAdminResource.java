package silicon.cms.admin.web.rest;

import java.util.List;

import silicon.ark.rest.AbstractResource;
import silicon.cms.admin.service.CategoryAdminManager;
import silicon.cms.common.entity.CategoryEntity;
import silicon.cms.common.entity.SubCategoryEntity;
import silicon.cms.common.serialization.CategoryJSONSerializer;
import silicon.cms.common.serialization.SubcategoryJSONserializer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Path("admin/category")
public class CategoryAdminResource extends AbstractResource
{
	@GET
	@Path("/")
	public Response LoadMyCategory() throws JSONException
	{
		List<CategoryEntity> _categoryList = CategoryAdminManager.getInstance().loadMyCategory();
		JSONArray _result = CategoryJSONSerializer.toSimpleArray(_categoryList);
		
		for(int i = 0 ;i < _result.length(); i++)
		{
			JSONObject _jsonObject = (JSONObject)_result.get(i);
			List<SubCategoryEntity> _subcategoryEntity = CategoryAdminManager.getInstance().loadMySubCategory(_jsonObject.getString("id"));
			_jsonObject.put("subcategories", SubcategoryJSONserializer.toSimpleArray(_subcategoryEntity));
		}
		
		return responseWithJSONArray(_result);
	}
}
