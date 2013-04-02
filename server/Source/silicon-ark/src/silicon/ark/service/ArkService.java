package silicon.ark.service;

import silicon.common.SCEnvironment;
import silicon.common.SCLog;

public class ArkService {
	
	public ArkService()
	{
		System.out.println("\n");
		setState(ArkState.INITIALIZED);
	}
	
	private static ArkService _silicon = null;
	public static ArkService getInstance()
	{
		if(_silicon == null)
		{
			_silicon = new ArkService();
		}
		
		return _silicon;
	}
	
	//方舟启动
	public void start(String m_rootPhysicalPath, String m_rootWebPath)
	{
		if(_state != ArkState.INITIALIZED && _state != ArkState.STOPPED)
		{
			return;
		}
		
		SCEnvironment.SetRootPhysicalPath(m_rootPhysicalPath);
		SCEnvironment.SetWebContextPath(m_rootWebPath);
		SCEnvironment.GetSharedPath();
		
		setState(ArkState.STARTING);
		
		SCLog.info("Hello from jie Shen<sendshenjieamail@gmail.com>" + " :p ");
		
		/*try
		{
			loadSettings();			
			initHibernate();
		}
		catch (Exception e)
		{
			setState(ArkState.ERROR);
			throw new SCRuntimeException("Silicon 方舟启动失败。请参考:r\n" + e, e);
		}*/
		
		setState(ArkState.RUNNING);
	}
	
	//方舟停止
	public void stop()
	{
		setState(ArkState.STOPPED);
		
		SCLog.info(" :)  bye bye! ");
	}
	
	private ArkState _state = null;
	public void setState(ArkState m_state)
	{
		_state = m_state;
		
		SCLog.info("Silicon 平台已切换至<"+ _state +">状态");
	}
	
	public ArkState getState()
	{
		return _state;
	}
	
	/*
	private void loadSettings()
	{
		
	}
	
	private void iniHibernate()
	{
		
	}*/
}
