package silicon.cms.common.factory;

import silicon.ark.security.dao.UserDAO;
import silicon.cms.common.dao.CategoryDAO;
import silicon.cms.common.dao.PostDAO;
import silicon.cms.common.dao.SubCategoryDAO;

public class DAOFactory {
	
	public static CategoryDAO getCategoryInstance()
	{
		return new ImpCategoryDAO();
	}
	
	public static UserDAO getUserInstance()
	{
		return new ImpUserDAO();
	}
	
	public static SubCategoryDAO getSubCategoryDAO()
	{
		return new ImpSubCategoryDAO();
	}
	
	public static SubCategoryDAO getSubCategoryDAO(String m_categoryName)
	{
		return new ImpSubCategoryDAO(m_categoryName);
	}
	
	public static PostDAO getPostInstance()
	{
		return new ImpPostDAO();
	}
	

}
