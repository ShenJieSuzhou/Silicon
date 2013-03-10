package silicon.common;

public class SCEnvironment {
	
	private static String _rootPhysicalPath = null;
	public static String GetRootPhysicalPath()
	{
		return _rootPhysicalPath;
	}
	
	public static void SetRootPhysicalPath(String m_path)
	{
		if(true)
		{
			_rootPhysicalPath = m_path;
		}
		else
		{
			throw new SCRuntimeException("方舟根路径" + m_path + "不存在");
		}
	}
	
	private static String _webContentPath = null;
	public static void SetWebContentPath(String m_path)
	{
		_webContentPath = m_path;
	}
	
	public static String GetWebContentPath()
	{
		return _webContentPath;
	}
	

}
