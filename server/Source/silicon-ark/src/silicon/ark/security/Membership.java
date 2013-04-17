package silicon.ark.security;

import silicon.ark.security.entity.UserEntity;
import silicon.ark.security.dao.UserDAO;
import silicon.cms.common.factory.DAOFactory;
import silicon.common.SCLog;

public class Membership {
	
	private static UserDAO _UserDAO = null;
	public Membership()
	{
		_UserDAO = DAOFactory.getUserInstance();
	}
	
	private static Membership _instance = null;
	public static Membership getInstance()
	{
		if(_instance == null)
		{
			_instance = new Membership();
		}
		
		return _instance;
	}
	
	public static UserDAO getUserEntity()
	{
		return _UserDAO;
	}
	
	private ThreadLocal<MembershipUser> _currentUser = new ThreadLocal<MembershipUser>();
	public void setCurrentUser(MembershipUser m_User)
	{
		_currentUser.set(m_User);
	}
	
	public MembershipUser getCurrentUser()
	{
		return _currentUser.get();
	}
	
	public static String validateUser(String m_loginName, String m_loginPass)
	{
		UserEntity _userEntity = getUserEntityByLoginName(m_loginName);
		if(_userEntity != null && _userEntity.getPassWd().equals(m_loginPass))
		{
			return _userEntity.getId();
		}
		else
		{
			return null;
		}
	}
	
	public static MembershipUser getUserById(String m_userID)
	{
		UserEntity _userEntity = getUserEntity().getUserEntityByID(m_userID);
		if(_userEntity != null)
		{
			MembershipUser _user = MembershipUser.createFromSCObject(_userEntity);
			return _user;
		}
		else
		{
			return null;	
		}
	}

	public static UserEntity getUserEntityByLoginName(String m_loginName)
	{
		UserEntity _UserEntity = getUserEntity().getUserEntity(m_loginName);
		if(_UserEntity == null)
		{
			SCLog.info("UserEntity 数据项为空");
		}
		
		return _UserEntity;
	}
}
