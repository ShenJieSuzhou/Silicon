package silicon.cms.admin.service;

import java.util.List;

import silicon.cms.common.dao.CategoryDAO;
import silicon.cms.common.dao.SubCategoryDAO;
import silicon.cms.common.entity.CategoryEntity;
import silicon.cms.common.entity.SubCategoryEntity;
import silicon.cms.common.factory.DAOFactory;

public class CategoryAdminManager {
	
	private CategoryAdminManager()
	{
	
	}
	
	private static CategoryAdminManager _instance = null;
	public static CategoryAdminManager getInstance()
	{
		if(_instance == null)
		{
			_instance = new CategoryAdminManager();
		}
		return _instance;
	}
	
	private CategoryDAO _categoryDAO = null;
	public CategoryDAO getCategoryDAO()
	{
		if(_categoryDAO == null)
		{
			_categoryDAO = DAOFactory.getCategoryInstance();
		}
		return _categoryDAO;
	}
	
	private SubCategoryDAO _subcategoryDAO = null;
	public SubCategoryDAO getSubCategoryDAO()
	{
		if(_subcategoryDAO == null)
		{
			_subcategoryDAO = DAOFactory.getSubCategoryDAO();
		}
		return _subcategoryDAO;
	}
	
	public List<CategoryEntity> loadMyCategory()
	{
		String _sql = "select * from st_category";
		return getCategoryDAO().query(_sql);
	}
	
	public List<SubCategoryEntity> loadMySubCategory(String m_categoryId)
	{
		String _sql = "select * from st_subcategory where ST_CATEGORY_CATEGORY_ID = " + "'" + m_categoryId + "'";
		
		return getSubCategoryDAO().query(_sql);
	}	
}
