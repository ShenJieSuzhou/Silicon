package silicon.cms.runtime.service;

import silicon.cms.common.dao.PostDAO;
import silicon.cms.common.factory.DAOFactory;

public class PostRuntimeManager {
	
	public PostRuntimeManager()
	{
		
	}
	
	private static PostRuntimeManager _instance = null;
	public static PostRuntimeManager getInstance()
	{
		if(_instance == null)
		{
			_instance = new PostRuntimeManager();
		}
		
		return _instance;
	}
	
	public static PostDAO _PostDAO = null;
	public static PostDAO getPostDAO()
	{
		if(_PostDAO == null)
		{
			_PostDAO = DAOFactory.getPostInstance();
		}
		
		return _PostDAO;
	}
}
