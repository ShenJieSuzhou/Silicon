package silicon.ark.security.dao;

import silicon.ark.security.entity.UserEntity;

public interface UserDAO {
	
	public void update(UserEntity m_UserEntity);
	
	public boolean IsExist(String m_user, String m_pwd);
	
	public UserEntity getUserEntity(String m_loginName);
	
	public UserEntity getUserEntityByID(String m_userID);
}
