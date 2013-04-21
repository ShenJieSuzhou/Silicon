package silicon.cms.admin.web.rest;

import java.util.List;

import silicon.ark.rest.AbstractResource;
import silicon.cms.common.entity.CategoryEntity;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("admin/category")
public class CategoryAdminResource extends AbstractResource
{
	@GET
	@Path("/")
	public Response LoadMyCategory()
	{
		//List<CategoryEntity> _categoryList =  
		return null;
	}
}
