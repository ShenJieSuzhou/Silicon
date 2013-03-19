package silicon.ark.dao;
import java.sql.*;

import silicon.ark.entity.StandardEntity;

public class StandardEntityDAO<T extends StandardEntity>
{
	public Connection _conn = null;
	
	public StandardEntityDAO()
	{
		
	}
	
	public StandardEntityDAO(Connection m_Conn)
	{
		_conn = m_Conn;
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
		if(_conn == null)
		{
			_conn = DataBaseConn.getConnection();
		}
		
		return _conn;
	}
	
	public void close() throws SQLException
	{
		if(!_conn.isClosed() && _conn != null)
		{
			_conn.close();
		}
	}
	
	public void select()
	{
		
	}
	
	public void delete()
	{
		
	}
	
	public void update()
	{
		
	}
	
	public void save()
	{
		
	}
	
	
	
	
}
