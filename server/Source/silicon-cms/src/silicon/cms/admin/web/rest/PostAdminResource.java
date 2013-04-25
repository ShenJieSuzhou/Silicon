package silicon.cms.admin.web.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import silicon.ark.rest.AbstractResource;
import silicon.ark.security.Membership;
import silicon.cms.common.entity.GoodsEntity;

@Path("admin/post")
public class PostAdminResource extends AbstractResource
{
	@GET
	@Path("/")
	public Response loadPost(
			@QueryParam("categoryId") String m_categoryId,
			@QueryParam("pageIndex") @DefaultValue("0") String m_pageIndex,
			@QueryParam("pageSize") @DefaultValue("20") String m_pageSize
			)
	{
		
		List<GoodsEntity> _goods = null;
		return null;
	}
	
	@GET
	@Path("/{id}")
	public Response getPost(@PathParam("id") String m_id)
	{
		return null;
	}
	
	@POST
	@Path("/")
	public Response savePost(@FormParam("post") String m_postJSONString) throws JSONException
	{
		JSONObject postJSON = new JSONObject(m_postJSONString);
		GoodsEntity post = new GoodsEntity();
		post.setPublisher(Membership.getInstance().getCurrentUser().getUserRole());
		
		_parsePostFromJSON(postJSON, post);
		
		String _postCategoryId=post.getCategoryId();
	
		if(_postCategoryId.equals(Membership.getInstance().getCurrentUser().getUserRole()))
		{
			//PostAdminManager.getInstance().savePost(post);
		}
		if("Administrator".equals( Membership.getInstance().getCurrentUser().getUserRole() ))
		{
			//PostAdminManager.getInstance().savePost(post);
		}
		
		JSONObject jsonResult = _generateSimplePostJSON(post);
		return responseWithJSONObject(jsonResult);
	}
	
	@PUT
	@Path("/{id}")
	public Response updatePost(@PathParam("id") String m_id,
			@FormParam("post") String m_postJSONString)
	{
		return null;
	}
	
	@DELETE
	@Path("/{id}")
	public Response deletePost(@PathParam("id") String m_id)
	{
		return null;
	}
	
	private void _parsePostFromJSON(JSONObject postJSON, GoodsEntity post)
			throws JSONException
	{
		post.setTitle(postJSON.getString("title"));
		post.setContentText(postJSON.getString("contentText"));
		post.setSummary(postJSON.getString("summary"));
		post.setCategoryId(postJSON.getString("categoryId"));
		post.setPrice(postJSON.getString("price"));
		if (postJSON.getString("subcategoryId") != "null")
		{
			post.setSubcategoryId(postJSON.getString("subcategoryId"));
		}
		else
		{
			post.setSubcategoryId(null);
		}
	}
	
	private JSONObject _generateSimplePostJSON(GoodsEntity post)
			throws JSONException
	{
		JSONObject jsonResult = new JSONObject();
		jsonResult.put("id", post.getId());
		jsonResult.put("publisher", post.getPublisher());
		jsonResult.put("createTime", post.getCreateTime().getTime());
		jsonResult.put("updateTime", post.getUpdateTime().getTime());
		return jsonResult;
	}
	
}
