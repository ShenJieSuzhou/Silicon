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
	
	
}
