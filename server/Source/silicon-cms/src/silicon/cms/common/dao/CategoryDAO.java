package silicon.cms.common.dao;

import java.util.List;

import silicon.cms.common.entity.CategoryEntity;

public interface CategoryDAO
{
	public void save(CategoryEntity m_category);
	
	public void update(CategoryEntity m_category);
	
	public void delete(CategoryEntity m_category);
	
	public List<CategoryEntity> query(String m_sql);
}
