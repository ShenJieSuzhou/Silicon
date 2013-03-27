package silicon.ark.dao;

import silicon.ark.entity.StandardEntity;

public abstract class StandardEntityDAO<T extends StandardEntity>
{
	//public Connection _conn = null;
	//private Class<T> _entityClass = null;
	
	/*public StandardEntityDAO(Connection m_Conn)
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
	}*/
	
	public StandardEntityDAO()
	{
		
	}
	
	public abstract void select(T entity);
	
	public abstract void delete(T entity);
	
	public abstract void update(T entity);
	
	public abstract void save(T entity);
}
