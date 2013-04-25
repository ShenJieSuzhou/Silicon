package silicon.cms.common.factory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import silicon.ark.dao.DataBaseConn;
import silicon.cms.common.dao.SubCategoryDAO;
import silicon.cms.common.entity.SubCategoryEntity;
import silicon.common.SCLog;

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
		List<SubCategoryEntity> _list = new ArrayList<SubCategoryEntity>();
		try {
			Connection _conn = DataBaseConn.getConnection();
			if(_conn == null)
			{
				SCLog.info("SubCategoryEntity 获取数据库连接失败： 连接为空   ：（");
				return null;
			}
			Statement _statement = _conn.createStatement();
			ResultSet _rs = _statement.executeQuery(m_sql);
			while(_rs.next())
			{
				SubCategoryEntity m_subcategory = new SubCategoryEntity();
				m_subcategory.setId(_rs.getString("ID"));
				m_subcategory.setSubCategoryName(_rs.getString("SUCATEGORY_NAME"));
				m_subcategory.setSubCategoryRef(_rs.getString("ST_CATEGORY_CATEGORY_ID"));
				_list.add(m_subcategory);
			}
			_rs.close();
			DataBaseConn.closeConn();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return _list;
	}

	@Override
	public void update(SubCategoryEntity m_category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(SubCategoryEntity m_category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SubCategoryEntity queryEntityById(String m_subCategoryId) {
		// TODO Auto-generated method stub
		String _sql = "select * from st_category where category_id = " + "'" + m_subCategoryId + "'";
		SubCategoryEntity _subcategory = new SubCategoryEntity();
		try {
			Connection _conn = DataBaseConn.getConnection();
			if(_conn == null)
			{
				SCLog.info("获取数据库连接失败： 连接为空   T_T");
				return null;
			}
			Statement _statement = _conn.createStatement();
			ResultSet _rs = _statement.executeQuery(_sql);
			if(_rs == null)
				return null;
			
			_rs.next();
			_subcategory.setId(_rs.getString("ID"));
			_subcategory.setSubCategoryName(_rs.getString("SUCATEGORY_NAME"));
			_rs.close();
			DataBaseConn.closeConn();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return _subcategory;
	}

}
