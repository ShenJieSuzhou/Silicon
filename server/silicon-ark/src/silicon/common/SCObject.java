package silicon.common;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import org.codehaus.jettison.json.*;
import silicon.common.serialization.IJSONObjectSerializable;

public class SCObject implements Serializable, IJSONObjectSerializable
{
	private static final long serialVersionUID = 1845227058568133177L;
	public static final String META_TYPE = "SCObject";
	
	private Map<String, SCObject> _map = null;
	public SCObject(Map<String, SCObject> m_Map)
	{
		_map = m_Map;
	}
	
	public SCObject(JSONObject m_json) throws JSONException
	{
		this(false);
		
		Iterator<?> keyIter = m_json.keys();
		Object key = null;
		while((key = keyIter.next()) != null)
		{
			_map.put(key.toString(), m_json.get(key.toString()));
		}
	}
	
	public SCObject(SCObject m_object)
	{
		_map = m_object._map;
	}
	
	public SCObject(boolean m_current)
	{
		if(m_current)
		{
			_map = new ConcurrentHashMap<String, SCObject>();
		}
		else
		{
			_map = new HashMap<String, SCObject>();
		}
	}
	
	public SCObject()
	{
		this(false);
	}
	
	public String getMetaType()
	{
		return META_TYPE;
	}
	
	public boolean containsKey(String m_key)
	{
		return _map.containsKey(m_key);
	}
	
	public String getString(String m_key)
	{
		Object obj = _map.get(m_key);
		return obj != null ? obj.toString() : null;
	}
	
	public boolean getBoolean(String m_key)
	{
		Object obj = _map.get(m_key);
		return obj != null ? (Boolean) obj : false;
	}
	
	public short getShort(String m_key)
	{
		Object obj = _map.get(m_key);
		return obj != null ? (Short) obj : 0;
	}
	
	public int getInt(String m_key)
	{
		Object obj = _map.get(m_key);
		return obj != null ? (Integer) obj : 0;
	}
	
	public long getLong(String p_key)
	{
		Object obj = _map.get(p_key);
		return obj != null ? (Long) obj : 0;
	}

	public double getDouble(String p_key)
	{
		Object obj = _map.get(p_key);
		return obj != null ? (Double) obj : 0;
	}

	public Date getDate(String p_key)
	{
		Object obj = _map.get(p_key);
		return obj != null ? (Date) obj : null;
	}

	public SCObject getSCObject(String p_key)
	{
		Object obj = _map.get(p_key);
		return obj != null ? (SCObject) obj : null;
	}
	
	
	@Override
	public JSONObject toJSONObject() throws JSONException {
		// TODO Auto-generated method stub
		JSONObject m_json = new JSONObject();
		Set<String> keys = _map.keySet();
		for(String key : keys)
		{
			Object obj = _map.get(key);
			if(obj instanceof List<?>)
			{
				JSONArray m_array = new JSONArray();
				List<?> lists = (List<?>)obj;
				for(Object listItem : lists)
				{
					if(listItem instanceof SCObject)
					{
						m_array.put(((SCObject)listItem).toJSONObject());
					}
					else
					{
						m_array.put(listItem);
					}
				}
				m_json.putOpt(key, m_array);
			}
			else
			{
				if(obj instanceof Date)
				{
					Date m_date = (Date)obj;
					m_json.put(key, m_date);
				}
				else
				{
					m_json.put(key, obj);
				}
			}
		}
		return m_json;
	}
	
	public String toString(boolean m_prettyPrint)
	{
		try
		{
			return toJSONObject().toString(m_prettyPrint ? 4 : 0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "";
		}
	}
	
	public String toString()
	{
		return toString(false);
	}

}
