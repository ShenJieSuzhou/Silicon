package silicon.cms.common.serialization;

import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import silicon.cms.common.entity.CategoryEntity;

public class CategoryJSONSerializer {
	
	public static JSONObject toSimpleObject(CategoryEntity m_category)
	{
		if(m_category == null)
		{
			return null;
		}

		JSONObject _json = new JSONObject();
		try {
			_json.put("id", m_category.getId());
			_json.put("name", m_category.getCategoryName());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return _json;
	}
	
	public static JSONArray toSimpleArray(List<CategoryEntity> m_category)
	{
		if(m_category == null)
		{
			return null;
		}
		
		JSONArray _jsonArray = new JSONArray();
		for(CategoryEntity _category : m_category)
		{
			_jsonArray.put(toSimpleObject(_category));
		}
		return _jsonArray;
	}

}
