package silicon.common.util;

public class StringUtil {
	
	public static boolean isNullOrEmpty(String m_str)
	{
		return m_str == null  || m_str.trim() == "";
	}
	
	public static boolean notNullOrEmpty(String m_str)
	{
		return !isNullOrEmpty(m_str);
	}
}
