package silicon.cms.common.serialization;

import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import silicon.cms.common.entity.SubCategoryEntity;

public class SubcategoryJSONserializer {
	
	public static JSONObject toSimpleObject(SubCategoryEntity m_subcategory)
	{
		if(m_subcategory == null)
		{
			return null;
		}
		
		JSONObject _json = new JSONObject();
		try {
			_json.put("id", m_subcategory.getId());
			_json.put("name", m_subcategory.getSubCategoryName());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static JSONArray toSimpleArray(List<SubCategoryEntity> m_subcategory)
	{
		if(m_subcategory == null)
		{
			return null;
		}
		
		JSONArray _jsonArray = new JSONArray();
		for(SubCategoryEntity _subcategory : m_subcategory)
		{
			_jsonArray.put(toSimpleObject(_subcategory));
		}
		return _jsonArray;
	}

}
