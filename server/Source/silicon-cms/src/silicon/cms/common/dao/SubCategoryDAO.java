package silicon.cms.common.dao;

import java.util.List;
import silicon.cms.common.entity.SubCategoryEntity;

public interface SubCategoryDAO {
	
	public void save(SubCategoryEntity m_subcategory);
	
	public void update(SubCategoryEntity m_category);
	
	public void delete(SubCategoryEntity m_category);
	
	public List<SubCategoryEntity> query(String m_sql);
	
	public SubCategoryEntity queryEntityById(String m_subCategoryId);
}
