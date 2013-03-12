package silicon.common;

import java.util.ArrayList;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;

public class SCList <T extends SCObject> extends ArrayList<T>
{
	private static final long serialVersionUID = -5300996043923151566L;
	
	public SCList()
	{
		super();
	}
	
	public SCList(int m_initialCapacity)
	{
		super(m_initialCapacity);
	}
	
	public JSONArray toJSONArray() throws JSONException
	{
		JSONArray _array = new JSONArray(this);
		return _array;
	}
}
