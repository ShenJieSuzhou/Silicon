package silicon.ark.entity;

public abstract class Entity {
	
	private String _id = null;
	public void setId(String m_id)
	{
		_id = m_id;
	}
	
	public String getId()
	{
		return _id;
	}
}
