package silicon.ark.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import silicon.ark.service.ArkService;

public class AppContextListener implements ServletContextListener
{

	@Override
	public void contextDestroyed(ServletContextEvent m_event) {
		// TODO Auto-generated method stub
		System.out.print("stop ok");
		ArkService.getInstance().stop();
	}

	@Override
	public void contextInitialized(ServletContextEvent m_event) {
		// TODO Auto-generated method stub
		System.out.print("start ....");
		ArkService.getInstance().start(m_event.getServletContext().getRealPath("/WEB-INF/silicon"), 
				m_event.getServletContext().getContextPath());
	}

}
