package silicon.ark.dao;

import java.sql.*;

public class DataBaseConn {
	
	public static String _url = null;
	public static String _driver = null;
	public static String _user = null;
	public static String _passwd = null;
	public static Connection _conn = null;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		if(_conn == null)
		{
			init();
		}		
		return _conn;
	}
	
	public static void init() throws ClassNotFoundException, SQLException
	{
		Class.forName(_driver);
		_conn = DriverManager.getConnection(_url, _user, _passwd);
	}
	
	public DataBaseConn()
	{
		_driver = "com.mysql.jdbc.Driver";
		_url = "jdbc:mysql://127.0.0.1:3306/silicon";
		_user = "root";
		_passwd = "admin";
	}
	
	/*
	public void setDriver(String m_driver)
	{
		_driver = m_driver;
	}
	
	public void setUrl(String m_url)
	{
		_url = m_url;
	}
	
	public void setUser(String m_user)
	{
		_user = m_user;
	}
	
	public void setPassWd(String m_passwd)
	{
		_passwd = m_passwd;
	}
	
	public String getUrl()
	{
		return _url;
	}
	
	public String getDriver()
	{
		return _driver;
	}
	
	public String getUser()
	{
		return _user;
	}
	
	public String getPassWd()
	{
		return _passwd;
	}*/

}
