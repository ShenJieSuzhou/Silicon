package silicon.cms.common.entity;

import java.util.Date;

import silicon.ark.entity.StandardEntity;

public class OrderEntity extends StandardEntity
{
	private String _userID = null;
	private Date _date;
	private int _totalPrice = 0;
	
	public String getUserID()
	{
		return _userID;
	}
	
	public void setUserID(String m_userID)
	{
		_userID = m_userID;
	}
	
	public Date getDate()
	{
		return _date;
	}
	
	public void setDate(Date m_date)
	{
		_date = m_date;
	}
	
	public int getTotalPrice()
	{
		return _totalPrice;
	}
	
	public void setTotalPrice(int m_totalPrice)
	{
		_totalPrice = m_totalPrice;
	}
	
}
