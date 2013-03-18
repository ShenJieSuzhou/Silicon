package silicon.ark.entity;

import java.util.*;

public class StandardEntity extends Entity
{
	private Date _createTime;
	private Date _updateTime;
	
	public void setCreateTime(Date m_createTime)
	{
		_createTime = m_createTime;
	}
	
	public Date getCreateTime()
	{
		return _createTime;
	}
	
	public void setUpdateTime(Date m_updateTime)
	{
		_updateTime = m_updateTime;
	}
	
	public Date getUpdateTime()
	{
		return _updateTime;
	}
	
}
