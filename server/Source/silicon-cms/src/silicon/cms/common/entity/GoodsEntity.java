package silicon.cms.common.entity;
import silicon.ark.entity.StandardEntity;

public class GoodsEntity extends StandardEntity
{
	private String _title = null;
	private String _summary = null;
	private String _price = null;
	private String _photoURL = null;
	private String _publisher = null;
	private String _text = null;
	private String _categoryId = null;
	private String _subcategoryId = null;
	
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
	
	public String getPrice()
	{
		return _price;
	}
	
	public void setPrice(String m_price)
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
	
	public String getPublisher()
	{
		return _publisher;
	}
	
	public void setPublisher(String m_publisher)
	{
		_publisher = m_publisher;
	}
	
	public String getContentText()
	{
		return _text;
	}
	
	public void setContentText(String m_text)
	{
		_text = m_text;
	}
	
	public void setCategoryId(String m_categordId)
	{
		_categoryId = m_categordId;
	}
	
	public String getCategoryId()
	{
		return _categoryId;
	}
	
	public void setSubcategoryId(String m_subcategoryId)
	{
		_subcategoryId = m_subcategoryId;
	}
	
	public String getSubcategoryId()
	{
		return _subcategoryId;
	}
}
