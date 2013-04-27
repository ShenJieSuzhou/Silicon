package silicon.cms.common.factory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import silicon.ark.security.dao.UserDAO;
import silicon.ark.security.entity.UserEntity;
import silicon.common.SCLog;
import silicon.common.util.StringUtil;
import silicon.ark.dao.DataBaseConn;

public class ImpUserDAO implements UserDAO
{	
	private static Connection _conn = null;
	private static String _prefix = null;
	
	public ImpUserDAO(){
		// TODO Auto-generated constructor stub
		_prefix = "select * from st_user where ";
	}
	
	@Override
	public void update(UserEntity m_UserEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean IsExist(String m_user, String m_pwd) {
		// TODO Auto-generated method stub
		try {
			_conn = DataBaseConn.getConnection();
			if(_conn == null)
			{
				SCLog.info("Connection 连接字串为空");
				return false;
			}
			
			Statement _statement = _conn.createStatement();
			String _sql = _prefix + "login_name = " + m_user;
			ResultSet _rst = _statement.executeQuery(_sql);
			if(null == _rst)
			{
				return false;
			}
			
			String _pass = _rst.getObject("login_pass").toString();
			if(_pass.equals(m_pwd))
			{
				_rst.close();
				return true;
			}
			else
			{
				_rst.close();
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@SuppressWarnings("null")
	@Override
	public UserEntity getUserEntity(String m_loginName) {
		// TODO Auto-generated method stub
		if(StringUtil.isNullOrEmpty(m_loginName))
		{
			return null;
		}
		
		try {
			_conn = DataBaseConn.getConnection();
			Statement _statement = _conn.createStatement();
			String _sql = _prefix + "login_name = " + "'" + m_loginName +"'";
			ResultSet _rst = _statement.executeQuery(_sql);
			if(_rst!= null)
			{
				UserEntity _UserEntity = new UserEntity();
				_rst.next();
				_UserEntity.setId(_rst.getString("user_id"));
				_UserEntity.setLoginName(_rst.getString("login_name"));
				_UserEntity.setPassWd(_rst.getString("login_pass"));
				_UserEntity.setUserRole(_rst.getString("ST_USER_GROUP_USER_ID"));
				_rst.close();
				return _UserEntity;
			}
			else
			{
				SCLog.info("数据不唯一");
				_rst.close();
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public UserEntity getUserEntityByID(String m_userID) {
		// TODO Auto-generated method stub
		if(StringUtil.isNullOrEmpty(m_userID))
		{
			return null;
		}
		
		UserEntity _UserEntity = new UserEntity();
		try {
			_conn = DataBaseConn.getConnection();
			Statement _statement = _conn.createStatement();
			String _sql = _prefix + "USER_ID = " + "'" + m_userID + "'";
			ResultSet _rst = _statement.executeQuery(_sql);
			if(_rst != null)
			{
				
				_rst.next();
				_UserEntity.setId(_rst.getString("user_id"));
				_UserEntity.setLoginName(_rst.getString("login_name"));
				_UserEntity.setPassWd(_rst.getString("login_pass"));
				_UserEntity.setUserRole(_rst.getString("ST_USER_GROUP_USER_ID"));
				_rst.close();
			}
			else
			{
				SCLog.info("数据不唯一");
				_rst.close();
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return _UserEntity;
	}

}
