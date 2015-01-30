package org.zlex.spring.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zlex.spring.domain.Menu;
import org.zlex.spring.service.MenuService;

@Controller
@RequestMapping("menu")
public class MenuController {

	 @Autowired
	 private MenuService menuService;
	 
	    @RequestMapping(value="/menu.json",method = RequestMethod.GET)
	    @ResponseBody
		public Map<String,Object> hello(HttpServletRequest request, 
	       HttpServletResponse response,Map<String,Object> model) throws Exception {
	    	try{
	    		 List<Menu> menus= menuService.getMenuListByParentId(0);
	    		 model.put("id", 1);
	    		 model.put("text", "目录");
		      //   model.put("children", menus);
		        //System.out.println(JSONObject.fromObject(model));
	    	}catch(Exception e){
	    		 e.printStackTrace();
	    	}
	             return  model;
		}
	 
	 /* public Map<String,Object> getValues(Map model){
		  model.get("children");
		  return "";
	  }*/  
	    
}
