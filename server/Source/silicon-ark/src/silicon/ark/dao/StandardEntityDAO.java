package silicon.ark.dao;
import java.sql.*;
import java.lang.reflect.ParameterizedType;

import silicon.ark.entity.StandardEntity;

public abstract class StandardEntityDAO<T extends StandardEntity>
{
	public Connection _conn = null;
	private Class<T> _entityClass = null;
	
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
	
	@SuppressWarnings("unchecked")
	public Class<T> getEntityClass()
	{
		if(_entityClass == null)
		{
			_entityClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		}
		return _entityClass;
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
