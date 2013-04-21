package silicon.cms.common.factory;

import java.util.List;

import silicon.cms.common.dao.SubCategoryDAO;
import silicon.cms.common.entity.SubCategoryEntity;

public class ImpSubCategoryDAO implements SubCategoryDAO 
{
	public ImpSubCategoryDAO()
	{
		
	}
	
	public ImpSubCategoryDAO(String m_category)
	{
		
	}
	
	@Override
	public void save(SubCategoryEntity m_subcategory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SubCategoryEntity> query(String m_sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(SubCategoryEntity m_category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(SubCategoryEntity m_category) {
		// TODO Auto-generated method stub
		
	}

}
