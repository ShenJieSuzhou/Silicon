package silicon.cms.common.entity;

import silicon.ark.entity.StandardEntity;

public class SubCategoryEntity extends StandardEntity
{
	private String _subCategoryName = null;
	public String getSubCategoryName()
	{
		return _subCategoryName;
	}
	
	public void setSubCategoryName(String m_subCategoryName)
	{
		_subCategoryName = m_subCategoryName;
	}
}
