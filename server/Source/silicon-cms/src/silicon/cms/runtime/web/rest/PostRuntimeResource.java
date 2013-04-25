package silicon.cms.runtime.web.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import silicon.ark.rest.AbstractResource;

@Path("runtime/post")
public class PostRuntimeResource extends AbstractResource
{
	@POST
	@Path("/{postId}/view")
	public Response hitPost()
	{
		return null;
	}
}
