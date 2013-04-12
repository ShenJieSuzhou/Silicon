package silicon.security.web.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.Response;

import silicon.ark.rest.AbstractResource;
import silicon.common.util.StringUtil;

@Path("security")
public class SecurityResource extends AbstractResource
{
	@POST
	@Path("login")
	public Response login(@FormParam("loginName") String m_loginName,
			@FormParam("passWord") String m_password,
			@FormParam("redirectURL") String m_redirectURL)
	{
		if(StringUtil.notNullOrEmpty(m_loginName) && StringUtil.notNullOrEmpty(m_password))
		{
			
		}
		
		return responseForbidden();
	}
	
}
