package silicon.common;

import silicon.common.util.FileSystemUtil;
import silicon.common.util.PathUtil;
import java.io.File;

public class SCEnvironment {
	
	private static String _rootPhysicalPath = null;
	public static String GetRootPhysicalPath()
	{
		return _rootPhysicalPath;
	}
	
	public static void SetRootPhysicalPath(String m_path)
	{
		if(FileSystemUtil.hasFile(m_path))
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
	
	private static String _sharePath = null;

	//尚未完成函数
	public static String GetPhysicalPath(String m_relativePath)
	{
		return "";
	}
	
	public static String GetPhysicalFile(String m_relativePath)
	{
		return "";
	}
	
	public static String GetSharedPath()
	{
		if(_sharePath == null)
		{
			_sharePath = System.getenv("SC_SHARED");
			if(_sharePath == null)
			{
				throw new SCRuntimeException("没有在操作系统中为环境变量设定“" + _sharePath+ "”并指向共享变量");
			}
			
			if(!FileSystemUtil.hasDirectory(_sharePath))
			{
				throw new SCRuntimeException("当前环境变量SC_SHARED所指向的目录不存在");
			}
		}
		
		return _sharePath;
	}
	
	public static String GetSharedPath(String m_relativePath)
	{
		String _path = PathUtil.combineFilePath(_sharePath, m_relativePath);
		return _path;
	}
	
	public static File GetSharedFile(String m_relativePath)
	{
		String _path = GetSharedPath(m_relativePath);
		return new File(_path);
	}
	

}
