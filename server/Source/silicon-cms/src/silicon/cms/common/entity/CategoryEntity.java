package silicon.cms.common.entity;

import silicon.ark.entity.StandardEntity;

public class CategoryEntity extends StandardEntity
{
	private String _categoryName = null;
	public String getCategoryName()
	{
		return _categoryName;
	}
	
	public void setCategoryName(String m_categoryName)
	{
		_categoryName = m_categoryName;
	}
	
	/*private String _categoryId = null;
	public String getCategoryId()
	{
		return _categoryId;
	}
	
	public void setCategoryId(String m_categoryId)
	{
		_categoryId = m_categoryId;
	}*/	
}
