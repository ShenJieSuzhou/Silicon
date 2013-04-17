package silicon.ark.security.entity;

import silicon.ark.entity.StandardEntity;
public class UserEntity extends StandardEntity
{
	private String _loginName = null;
	private String _passwd = null;
	private String _userRole = null;
	
	public String getLoginName()
	{
		return _loginName;
	}
	
	public void setLoginName(String m_name)
	{
		_loginName = m_name;
	}
	
	public String getPassWd()
	{
		return _passwd;
	}
	
	public void setPassWd(String m_passwd)
	{
		_passwd = m_passwd;
	}
	
	public String getUserRole()
	{
		return _userRole;
	}
	
	public void setUserRole(String m_userRole)
	{
		_userRole = m_userRole;
	}
	
}
