package silicon.cms.admin.service;

import java.util.List;
import silicon.cms.common.dao.PostDAO;
import silicon.cms.common.entity.GoodsEntity;
import silicon.cms.runtime.service.PostRuntimeManager;

public class PostAdminManager {
	public PostAdminManager()
	{
		
	}
	
	private static PostAdminManager _instance = null;
	public static PostAdminManager getInstance()
	{
		if(_instance == null)
		{
			_instance = new PostAdminManager();
		}
		return _instance;
	}
	
	private PostDAO _PostDAO = null;
	public PostDAO getPostDAO()
	{
		if(_PostDAO == null)
		{
			PostRuntimeManager.getInstance();
			_PostDAO = PostRuntimeManager.getPostDAO();
		}	
		return _PostDAO;
	}
	
	public GoodsEntity getPostById(String m_id)
	{
		GoodsEntity entity = getPostDAO().selectById(m_id);
		return entity;
	}
	
	public List<GoodsEntity> loadPostsByCategory(String m_categoryId, int p_pageIndex, int p_pageSize)
	{
		String _sql = null;
		
		if(p_pageIndex < 0)
		{
			return null;
		}

		_sql += " where ST_CATEGORY_GOOD_ID = " + "'" + m_categoryId + "'";
		
		List<GoodsEntity> poList = getPostDAO().query(_sql);
		return poList;
	}
	
	public GoodsEntity savePost(GoodsEntity m_post)
	{
		getPostDAO().savePost(m_post);
		return m_post;
	}

	public GoodsEntity updatePost(GoodsEntity m_post)
	{
		getPostDAO().update(m_post);
		return m_post;
	}
	
	public void deletePost(String m_postId)
	{
		getPostDAO().deleteById(m_postId);
	}
}
