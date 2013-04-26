package silicon.cms.common.dao;

import java.util.List;

import silicon.cms.common.entity.GoodsEntity;

public interface PostDAO {
	
	public GoodsEntity savePost(GoodsEntity m_post);
	
	public void update(GoodsEntity m_post);
	
	public void deleteById(String m_postId);
	
	public GoodsEntity selectById(String m_postId);
	
	public GoodsEntity selectByPostId(String m_postId, GoodsEntity _goods);
	
	public List<GoodsEntity> query(String m_sql);
}
