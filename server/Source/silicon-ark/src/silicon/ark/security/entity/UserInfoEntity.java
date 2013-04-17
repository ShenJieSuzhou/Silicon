package silicon.ark.security.entity;

public class UserInfoEntity {
	private String _name = null;
	private String _loginName = null;
	private	String _loginPass = null;
	private String _phone = null;
	private String _email = null;
	private String _address = null;
	
	public String getName()
	{
		return _name;
	}
	
	public void setName(String m_name)
	{
		_name = m_name;
	}
	
	public String getLoginName()
	{
		return _loginName;
	}
	
	public void setLoginName(String m_loginName)
	{
		_loginName = m_loginName;
	}
	
	public String getLoginPass()
	{
		return _loginPass;
	}

	public void setLoginPass(String m_loginPass)
	{
		_loginPass = m_loginPass;
	}
	
	public String getPhone()
	{
		return _phone;
	}
	
	public void setPhone(String m_phone)
	{
		_phone = m_phone;
	}
	
	public String getEmail()
	{
		return _email;
	}
	
	public void setEmail(String m_email)
	{
		_email = m_email;
	}
	
	public String getAddress()
	{
		return _address;
	}
	
	public void setAddress(String m_address)
	{
		_address = m_address;
	}
	
}
