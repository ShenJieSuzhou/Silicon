package silicon.ark.security;

import silicon.ark.security.entity.UserEntity;
import silicon.common.SCObject;

public class MembershipUser extends SCObject
{
	private static final long serialVersionUID = 1L;
	
	public static MembershipUser createFromSCObject(UserEntity m_userEntity)
	{
		MembershipUser _user = new MembershipUser();
		_user.set("userid", m_userEntity.getId());
		_user.set("login_name", m_userEntity.getLoginName());
		_user.set("login_pass", m_userEntity.getPassWd());
		_user.set("user_role", m_userEntity.getUserRole());
		return _user;
	}
	
	public String getId()
	{
		return getString("userid");
	}

	public String getUserName()
	{
		return getString("login_name");
	}
	
	public String getLoginName()
	{
		return getString("login_pass");
	}
	
	public String getUserRole()
	{
		if("STUG0000000000000000000000000003".equals(getString("user_role")))
		{
			return "administor";
		}
		return null;
	}
	
	public boolean isAdministator()
	{
		return "STUG0000000000000000000000000003".equals(getUserRole());
	}
}
