package silicon.common;

import org.apache.log4j.Logger;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.json.JSONException;

public class SCLog {
	private static final Logger _logger = Logger.getLogger(SCLog.class);
	
	public static void info(String m_message)
	{
		_logger.info(m_message);
	}
	
	public static void debug(String m_message)
	{
		_logger.debug(m_message);
	}
	
	public static void trace(String m_message)
	{
		_logger.trace(m_message);
	}
	
	public static void trace(JSONObject m_json)
	{
		try
		{
			trace(m_json.toString(4));
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void trace(SCObject m_scObject)
	{
		trace(m_scObject.toString(true));
	}
	
	public static void warn(String m_message)
	{
		_logger.warn(m_message);
	}
	
	public static void error(String m_message)
	{
		_logger.error(m_message);
	}
	
	public static void error(Exception m_scException)
	{
		_logger.error(m_scException.toString());
	}
}
