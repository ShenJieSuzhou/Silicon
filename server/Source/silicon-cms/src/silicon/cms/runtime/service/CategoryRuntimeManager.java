package silicon.cms.runtime.service;

import silicon.cms.common.dao.CategoryDAO;
import silicon.cms.common.dao.SubCategoryDAO;
import silicon.cms.common.entity.CategoryEntity;
import silicon.cms.common.entity.SubCategoryEntity;
import silicon.cms.common.factory.DAOFactory;

public class CategoryRuntimeManager {
	
	private CategoryRuntimeManager()
	{
		
	}
	
	private static CategoryRuntimeManager _instance = null;
	public static CategoryRuntimeManager getInstance()
	{
		if(_instance == null)
		{
			_instance = new CategoryRuntimeManager();
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
	
	private SubCategoryDAO _subCategoryDAO = null;
	public SubCategoryDAO getSubCategoryDAO()
	{
		if(_subCategoryDAO == null)
		{
			_subCategoryDAO = DAOFactory.getSubCategoryDAO();
		}
		
		return _subCategoryDAO;
	}
	
	public CategoryEntity getCategory(String m_categoryId)
	{
		return getCategoryDAO().queryEntityById(m_categoryId);
	}
	
	public SubCategoryEntity getSubCategory(String m_subCategoryId)
	{
		//String _sql = "select * from st_subcategory where ST_CATEGORY_CATEGORY_ID = " + "'" + m_subCategoryId + "'";
		return null;
	}
	
}
