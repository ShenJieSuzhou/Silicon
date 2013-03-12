package silicon.common;

public class SCException extends Exception
{
	private static final long serialVersionUID = -708415921223330690L;
	
	public SCException()
	{
		super();
	}
	
	public SCException(String m_message)
	{
		super(m_message);
	}
	
	public SCException(Throwable m_cause)
	{
		super(m_cause);
	}
	
	public SCException(String m_message, Throwable m_cause)
	{
		super(m_message, m_cause);
	}
}
