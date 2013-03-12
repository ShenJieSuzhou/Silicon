package silicon.ark.service;

public class ArkService {
	
	public ArkService()
	{
		System.out.println("\n");
		setState(ArkState.INITIALIZING);
	}
	
	private static ArkService _silicon = null;
	public ArkService getInstance()
	{
		if(_silicon == null)
		{
			_silicon = new ArkService();
		}
		
		return _silicon;
	}
	
	//方舟启动
	public void start()
	{
		
	}
	
	//方舟停止
	public void stop()
	{
		
	}
	
	private ArkState _state = null;
	public void setState(ArkState m_state)
	{
		if(null ==_state)
		{
			_state = m_state;
		}
		
		//打印日志消息 
	}
	
	public ArkState getState()
	{
		return _state;
	}
}
