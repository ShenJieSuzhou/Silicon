package silicon.security.web.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import silicon.ark.security.Membership;
import silicon.ark.security.MembershipUser;
import silicon.common.SCLog;

public class SecurityFilter implements Filter
{
	public String _loginPath = null;

	@Override
	public void init(FilterConfig m_conf) throws ServletException {
		_loginPath = m_conf.getInitParameter("loginPath");
	}
	
	@Override
	public void doFilter(ServletRequest m_request, ServletResponse m_response,
			FilterChain m_chain) throws IOException, ServletException {
				if(m_request instanceof HttpServletRequest)
		{
			HttpServletRequest request = (HttpServletRequest)m_request;
			HttpServletResponse response = (HttpServletResponse)m_response;
			String path = request.getRequestURI().substring(request.getContextPath().length());
			URL url = new URL(request.getRequestURL().toString());
			String fileName = url.getFile().toLowerCase();
			
			if(!fileName.endsWith(".css") && 
				!fileName.endsWith(".js") && 
				!fileName.endsWith(".png") &&
				!fileName.endsWith(".jpg"))
			{
				if(path.equals(_loginPath) || path.indexOf("/api/0/admin/upload") != -1)
				{
					m_chain.doFilter(request, response);
					return;
				}
				else
				{
					HttpSession _session = request.getSession(false);
					if(_session != null)
					{
						Object _user = _session.getAttribute("membership.currentUser");
						if(_user != null)
						{
							Membership.getInstance().setCurrentUser((MembershipUser)_user);
							m_chain.doFilter(request, response);
							return;
						}
					}
					
					if((path.indexOf("/api/") == -1) && path.endsWith("/") || path.endsWith("jsp"))
					{
						response.setCharacterEncoding("UTF-8");
						response.setContentType("text/html; charset=UTF-8");
						PrintWriter out = response.getWriter();
						String uri = request.getContextPath() + _loginPath + "?RedirectURI=" + path; 
						out.println("<html><head><title>正在跳转至登陆页面...</title><meta http-equiv='refresh' content='0; url=" + uri + "' /></head><body></body></html>");
						out.close();
						return;
					}
					else
					{
						response.setStatus(403);
						return;
					}
				}
				
			}
			else
			{
				m_chain.doFilter(request, response);
				return;
			}
		}
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
}
