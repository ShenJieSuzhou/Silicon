package silicon.cms.common.factory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import silicon.ark.dao.DataBaseConn;
import silicon.cms.common.dao.PostDAO;
import silicon.cms.common.entity.GoodsEntity;
import silicon.common.SCLog;

public class ImpPostDAO implements PostDAO
{
	public ImpPostDAO()
	{
		
	}

	@Override
	public void savePost(GoodsEntity m_post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GoodsEntity selectById(String m_postId) {
		// TODO Auto-generated method stub
		String _sql = "select * from st_goods where ST_CATEGORY_GOOD_ID = " + "'" + m_postId + "'";
		GoodsEntity _goods = new GoodsEntity();
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
			_goods.setId(_rs.getString("GOODS_ID"));
			_goods.setTitle(_rs.getString("TITLE"));
			_goods.setSummary(_rs.getString("SUMMARY"));
			_goods.setPrice(_rs.getString("PRICE"));
			_goods.setPhotoURL(_rs.getString("PHOTO_URL"));
			_goods.setPublisher(_rs.getString("PUBLISHER"));
			_goods.setTitle(_rs.getString("CONTEXT"));
			_goods.setCategoryId(_rs.getString("ST_CATEGORY_GOOD_ID"));
			_goods.setSubcategoryId(_rs.getString("ST_SUBCATEGORY_ID"));
			_goods.setOrderId(_rs.getString("ST_ORDER_INFO_GOODS_ID"));
			_goods.setCreateTime(_rs.getDate("CREATE_TIME"));
			_goods.setUpdateTime(_rs.getTimestamp("UPDATE_TIME"));
			_rs.close();
			DataBaseConn.closeConn();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return _goods;
	}

	@Override
	public List<GoodsEntity> query(String m_sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(GoodsEntity m_post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String m_id) {
		// TODO Auto-generated method stub
		
	}

}
