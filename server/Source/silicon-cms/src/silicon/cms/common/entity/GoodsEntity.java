package silicon.cms.common.entity;

import silicon.ark.entity.StandardEntity;

public class GoodsEntity extends StandardEntity
{
	private String _title = null;
	private String _summary = null;
	private int _price = 0;
	private String _photoURL = null;
	
	public String getTitle()
	{
		return _title;
	}
	
	public void setTitle(String m_title)
	{
		_title = m_title;
	}
	
	public String getSummary()
	{
		return _summary;
	}
	
	public void setSummary(String m_summary)
	{
		_summary = m_summary;
	}
	
	public int getPrice()
	{
		return _price;
	}
	
	public void setPrice(int m_price)
	{
		_price = m_price;
	}
	
	public String getPhotoURL()
	{
		return _photoURL;
	}
	
	public void setPhotoURL(String m_photoURL)
	{
		_photoURL = m_photoURL;
	}
	
}
