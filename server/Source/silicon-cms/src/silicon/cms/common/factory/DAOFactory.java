package silicon.cms.common.factory;

import silicon.ark.security.dao.UserDAO;
import silicon.cms.common.dao.CategoryDAO;

public class DAOFactory {
	
	public static CategoryDAO getCategoryInstance()
	{
		return new ImpCategoryDAO();
	}
	
	public static UserDAO getUserInstance()
	{
		return new ImpUserDAO();
	}

}
