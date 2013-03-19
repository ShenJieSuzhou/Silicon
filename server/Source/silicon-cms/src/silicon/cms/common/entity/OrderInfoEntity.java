package silicon.cms.common.entity;

import silicon.ark.entity.StandardEntity;

public class OrderInfoEntity extends StandardEntity
{
	private String _goodID = null;
	private int _sum = 0;
	private int _price = 0;
	
	public String getGoodID()
	{
		return _goodID;
	}
	
	public void setGoodID(String m_goodID)
	{
		_goodID = m_goodID;
	}
	
	public int getSum()
	{
		return _sum;
	}
	
	public void setSum(int m_sum)
	{
		_sum = m_sum;
	}
	
	public int getPrice()
	{
		return _price;
	}
	
	public void setPrice(int m_price)
	{
		_price = m_price;
	}
	
	
}
