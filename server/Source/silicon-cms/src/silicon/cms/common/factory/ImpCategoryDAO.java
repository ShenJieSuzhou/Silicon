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
import silicon.common.SCLog;

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
			if(_conn == null)
			{
				//SCLog.info("获取数据库连接失败： 连接为空   ：（");
				return null;
			}
			Statement _statement = _conn.createStatement();
			String _sql = "select * from st_category";
			ResultSet _rs = _statement.executeQuery(_sql);
			while(_rs.next())
			{
				CategoryEntity m_category = new CategoryEntity();
				m_category.setCategoryName(_rs.getString("CATEGORY_NAME"));
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
