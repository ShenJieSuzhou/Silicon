package silicon.cms.common.factory;

import silicon.cms.common.dao.CategoryDAO;

public class DAOFactory {
	
	public static CategoryDAO getCategoryInstance()
	{
		return new ImpCategoryDAO();
	}

}
