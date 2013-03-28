package silicon.cms.common.factory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import silicon.ark.dao.DataBaseConn;
import silicon.cms.common.dao.CategoryDAO;
import silicon.cms.common.entity.CategoryEntity;

public class ImpCategoryDAO implements CategoryDAO
{

	public ImpCategoryDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(CategoryEntity m_category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(CategoryEntity m_category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CategoryEntity m_category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CategoryEntity> query(String m_sql) {
		// TODO Auto-generated method stub
		List<CategoryEntity> _list = new ArrayList<CategoryEntity>();
		try {
			Connection _conn = DataBaseConn.getConnection();
			Statement _statement = _conn.createStatement();
			ResultSet _rs = _statement.executeQuery("select　* from ST_CATEGORY");
			while(_rs.next())
			{
				CategoryEntity m_category = new CategoryEntity();
				m_category.setId(_rs.getString("CATEGORY_NAME"));
				_list.add(m_category);
			}
			_rs.close();
			_conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return _list;
	}
	
}
