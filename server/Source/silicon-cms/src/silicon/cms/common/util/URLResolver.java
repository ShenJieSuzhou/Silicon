package silicon.cms.common.util;

import silicon.common.util.PathUtil;
import silicon.common.SCEnvironment;

public class URLResolver {
	
	public static String getPostLink(String m_id, String m_category)
	{
		return PathUtil.CombineURLPath(SCEnvironment.GetWebContextPath(), m_id, m_category, "html");
	}
	
	public static String getAbsolutePostLink(String m_id, String m_category)
	{
		return "www.sheldon'sFlower.com" + getPostLink(m_id, m_category);
	}
}
