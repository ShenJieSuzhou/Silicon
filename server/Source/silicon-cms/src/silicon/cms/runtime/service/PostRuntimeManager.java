package silicon.cms.runtime.service;

import java.util.List;
import silicon.cms.common.dao.PostDAO;
import silicon.cms.common.entity.GoodsEntity;
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
	
	public GoodsEntity getGoods(String m_postId)
	{
		return getPostDAO().selectById(m_postId);
	}
	
	public GoodsEntity getGoods(String m_postId, String m_categoryId)
	{
		GoodsEntity _goods = getGoods(m_postId);
		String _categoryId = _goods.getCategoryId();
		if(!_categoryId.equals(m_categoryId))
		{
			return null;
		}
		return _goods;
	}
	
	public List<GoodsEntity> loadLatestPostsByCategory(String m_categoryId, boolean m_hasPhoto, String m_extra, int m_count)
	{
		if(m_count == Integer.MAX_VALUE)
		{
			return null;
		}
	
		String _sql = "select TOP(" + String.valueOf(m_count) + ") from st_goods where " + 
		"ST_CATEGORY_GOOD_ID = " + "'" + m_categoryId + "'" +
		"and " + (m_hasPhoto ? " (photoURL is not null) and " : "") +
		"order by createTime desc";
		
		List<GoodsEntity> _list = getPostDAO().query(_sql);
		return _list;
	}
	
	public List<GoodsEntity> loadTopPostsByCategory()
	{
		return null;
	}
	
	public List<GoodsEntity> loadLastPostsBySubCategory(String m_subcategoryId, boolean m_hasPhoto, String m_extra, int m_count)
	{
		if(m_count == Integer.MAX_VALUE)
		{
			return null;
		}
	
		String _sql = "select TOP(" + String.valueOf(m_count) + ") from st_goods where " + 
		"ST_SUBCATEGORY_ID = " + "'" + m_subcategoryId + "'" +
		"and " + (m_hasPhoto ? " (photoURL is not null) and " : "") +
		"order by createTime desc";
		
		List<GoodsEntity> _list = getPostDAO().query(_sql);
		return _list;
	}
		
	public List<GoodsEntity> loadAllPosts(int pageIndex, int pageSize)
	{
		int _cursor = pageIndex * pageSize;
		int _offset = pageSize;
		String _sql = "select * from st_goods limit "  +String.valueOf(_cursor) + "," + String.valueOf(_offset);
		List<GoodsEntity> _list = getPostDAO().query(_sql);
		return _list;
	}  
	
	
}
