package silicon.ark.service;

import javax.servlet.ServletContextEvent;
import silicon.common.SCEnvironment;
import silicon.common.SCLog;
import silicon.common.SCRuntimeException;

public class ArkService {
	
	public ArkService()
	{
		System.out.println("\n");
		setState(ArkState.INITIALIZING);
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
		if(_state != ArkState.INITIALIZING && _state != ArkState.STOPPED)
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
		
		System.out.print("Ark start");
		setState(ArkState.RUNNING);
	}
	
	//方舟停止
	public void stop()
	{
		setState(ArkState.STOPPING);
		setState(ArkState.STOPPED);
		
		SCLog.info(" :)  bye bye! ");
		System.out.print("Ark stop");
	}
	
	private ArkState _state = null;
	public void setState(ArkState m_state)
	{
		if(null ==_state)
		{
			_state = m_state;
		}
		
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
