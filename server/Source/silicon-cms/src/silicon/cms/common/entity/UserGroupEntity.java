package silicon.cms.common.entity;

import silicon.ark.entity.StandardEntity;

public class UserGroupEntity extends StandardEntity
{
	private String _userGroupName = null;
	
	public String getUserGroupName()
	{
		return _userGroupName;
	}
	
	public void SetUserGroupName(String m_userGroupName)
	{
		_userGroupName = m_userGroupName;
	}
}
