package silicon.ark.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import silicon.ark.service.ArkService;

public class AppContextListener implements ServletContextListener
{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.print("stop ok");
		ArkService.getInstance().start();
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.print("start ....");
		ArkService.getInstance().stop();
	}

}
