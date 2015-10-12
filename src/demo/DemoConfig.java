package demo;


import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.Controller;
import com.jfinal.log.Logger;

public class DemoConfig extends JFinalConfig{
	
	private static Logger  log = Logger.getLogger(DemoConfig.class);

	@Override
	public void configConstant(Constants me) {
		// TODO Auto-generated method stub
		me.setDevMode(true);
	}
	@Override
	public void configRoute(Routes me) {
		// TODO Auto-generated method stub
		log.info("configRoute   start1111");
		Class  cls =  null;
		try {
			cls = Class.forName("demo.HelloController");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		me.add("/api",cls);
		me.add("/pk/queryList", HelloController.class);
		
		log.info("configRoute   end");
	}
	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
	}

	@Override
	public void configInterceptor(Interceptors arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configPlugin(Plugins arg0) {
		// TODO Auto-generated method stub
		
	}


	
	
	

}
