package silicon.security.web.rest;

import javax.servlet.http.HttpSession;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.Response;

import silicon.ark.rest.AbstractResource;
import silicon.common.util.StringUtil;
import silicon.ark.security.Membership;
import silicon.ark.security.MembershipUser;

@Path("security")
public class SecurityResource extends AbstractResource
{
	@POST
	@Path("validate")
	public Response validateUser(
			@FormParam("loginName") String m_loginName,
			@FormParam("loginPassword") String m_password
			)
	{
		Membership.getInstance();
		if(Membership.validateUser(m_loginName, m_password) != null)
		{
			return responseOK();
		}
		else
		{
			return responseForbidden();
		}
	}
	
	@POST
	@Path("login")
	public Response login(@FormParam("loginName") String m_loginName,
			@FormParam("passWord") String m_password,
			@FormParam("redirectURL") String m_redirectURL)
	{
		if(StringUtil.notNullOrEmpty(m_loginName) && StringUtil.notNullOrEmpty(m_password))
		{
			Membership.getInstance();
			String _userId = Membership.validateUser(m_loginName, m_password);
			if(_userId != null)
			{
				Membership.getInstance();
				MembershipUser _user = Membership.getUserById(_userId);
				if(_user != null)
				{
					HttpSession _session = getRequest().getSession(true);
					_session.setAttribute("membership.currentUser", _user);
					if(m_redirectURL != null)
					{
						String _message = "<html><head><title>登陆成功，正在跳转...</title><meta http-equiv='refresh' content='0; url=" + m_redirectURL + "' /></head><body></body></html>";
						return responseWithHTML(_message);
					}
					else
					{
						return responseNotFound();
					}				
				}
			}
		}
		
		return responseForbidden();
	}
	
}
