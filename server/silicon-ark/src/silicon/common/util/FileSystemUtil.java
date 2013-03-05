package silicon.common.util;

import java.io.File;

public class FileSystemUtil {
	
	public static boolean hasFile(String m_file)
	{
		File file = new File(m_file);
		return file.exists() && file.isFile();
	}
	
	public static boolean hasDirectory(String m_file)
	{
		File file = new File(m_file);
		return file.isDirectory();
	}
	
	public static boolean canDelete(String m_file)
	{
		if(!StringUtil.notNullOrEmpty(m_file))
			return false;
			
		File file = new File(m_file);
			
		if(!file.isFile() || !file.exists())
		{
			return false;
		}
		
		return delete(file);
	}
	
	public static boolean delete(File m_file)
	{
		if(!m_file.isDirectory())
		{
			m_file.delete();
			return true;
		}
			
		File[] files = m_file.listFiles();
		for(File f : files)
		{
			f.delete();
		}	
		
		return true;
	}

}
