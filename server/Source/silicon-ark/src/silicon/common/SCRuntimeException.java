package silicon.common;

public class SCRuntimeException extends RuntimeException
{
	private static final long serialVersionUID = 4930256894928345504L;
		
	public SCRuntimeException(){
		
	}
	
	public SCRuntimeException(String m_message)
	{
		super(m_message);
	}
	
	public SCRuntimeException(Throwable m_cause)
	{
		super(m_cause);
	}
	
	public SCRuntimeException(String m_message, Throwable m_cause)
	{
		super(m_message, m_cause);
	}

}
