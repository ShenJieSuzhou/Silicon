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
		if(FileSystemUtil.hasDirectory(m_path))
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
	
	
	public static String GetPhysicalPath(String m_relativePath)
	{
		return PathUtil.CombineFilePath(SCEnvironment.GetRootPhysicalPath(), m_relativePath);
	}
	
	public static File GetPhysicalFile(String m_relativePath)
	{
		return new File(SCEnvironment.GetPhysicalPath(m_relativePath));
	}
	
	private static String _sharedPath = null;
	public static String GetSharedPath()
	{
		if (_sharedPath == null)
		{
			_sharedPath = System.getenv("SC_SHARED");
			if (_sharedPath == null)
			{
				throw new SCRuntimeException("管理员必须在操作系统中设定环境变量“SC_SHARED”，并指向平台共享目录。");
			}
			if (!FileSystemUtil.hasDirectory(_sharedPath))
			{
				throw new SCRuntimeException("当前环境变量“SC_SHARED”所指向的“" + _sharedPath +"”目录不存在。");
			}
		}
		
		return _sharedPath;
	}
	
	public static String GetSharedPath(String m_relativePath)
	{
		String path = PathUtil.CombineFilePath(_sharedPath, m_relativePath);
		return path;
	}
	
	public static File getSharedFile(String p_relativePath)
	{
		String path = GetSharedPath(p_relativePath);
		return new File(path);
	}	

}
