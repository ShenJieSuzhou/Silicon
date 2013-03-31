package silicon.common.util;

import java.io.File;

public class PathUtil {

	public static String CombineURLPath(String...m_path)
	{
		String _path = "";
		for(int i = 0; i < m_path.length; i++)
		{
			if(m_path[i] != null)
			{
				if(_path.endsWith("/") && m_path[i].startsWith("/"))
				{
					//?逻辑
					_path += m_path[i].substring(1);
				}
				else if(!_path.endsWith("/") && !m_path[i].startsWith("/"))
				{
					_path += "/" + m_path[i];
				}
				else
				{
					_path += m_path[i];
				}
			}
		}
		return _path;
	}
	
	public static String CombineFilePath(String...m_path)
	{
		String _path = null;
        StringBuilder _builder = new StringBuilder();
        String _result = null;
        boolean isDir = false;

        for (int i = 0; i < m_path.length; i++)
        {
            if (StringUtil.isNullOrEmpty(m_path[i]))
            {
                continue;
            }

            _path = m_path[i].trim().replace("\\", File.separator);

            if (_path.endsWith(File.separator))
            {
                isDir = true;
            }
            else
            {
                isDir = false;
            }

            if (i != 0)
            {
	            while (_path.startsWith(File.separator))
	            {
	            	_path = _path.substring(1);
	            }
            }

            while (_path.endsWith(File.separator))
            {
            	_path = _path.substring(0, _path.length() - 1);
            }

            if (!_path.equals(""))
            {
                _builder.append(_path);

                if (!_path.endsWith(File.separator) && !isDir)
                {
                    _builder.append(File.separator);
                }
            }
        }

        _result = _builder.toString();

        if (_result.endsWith(File.separator) && !isDir)
        {
            return _result.substring(0, _result.length() - 1);
        }
        return _result;
	}
}
