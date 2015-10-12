package demo;

import java.util.HashMap;
import java.util.Map;

import com.jfinal.core.Controller;

public class HelloController extends Controller{
	
	public void  index(){
		String  str =  getPara("msg");
		
		System.out.println("---str----"+str);
		
		renderText("Hello,JFinal World");
		
		Map map = new HashMap();
		
		map.put("id", "13344");
		map.put("name","Àî»ª");
		
		this.renderJson(map);
	}

	public void  queryList(){
		renderText("render to  method  queryList");
	}
}
