package com.pb.test;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pro/db")
public class ProDbTest {

	@RequestMapping(value = "/show/", method = RequestMethod.GET)
	public ModelAndView account(Map<String, Object> model,HttpServletRequest request , HttpServletResponse response) throws Exception {
		//读取application.properties配置文件
		ResourceBundle resource=ResourceBundle.getBundle("application");
		String dbName=resource.getString("jdbc.username");
		String dbPass=resource.getString("jdbc.password");
		/*
		 * 调用maven的隐式属性
		 * Maven提供了三个隐式的属性env、project、settings，分别用于引用环境变量、pom信息、settings信息。 
		 */
		String pathShow=resource.getString("path.show");
		String groupId=resource.getString("groupId");
		String partifactId=resource.getString("partifactId");
		String basedir=resource.getString("basedir");
		//settings.xmlli里面的属性
		String mirrors=resource.getString("mirrors");
		String projectDirectory=resource.getString("projectDirectory");
		
		  Map<String,Object> map= new HashMap<String,Object>();
		  map.put("dbName", dbName);
		  map.put("dbPass", dbPass);
		  map.put("pathShow", pathShow);
		  map.put("groupId", groupId);
		  map.put("partifactId", partifactId);
		  map.put("basedir", basedir);
		  map.put("mirrors", mirrors);
		  map.put("projectDirectory", projectDirectory);
		  
		  System.out.println(map.get("mirrors"));
		  System.out.println("这是develop分支新增加的");
		  System.out.println("这是release分支新增加的");
		  
		  
		  
		  return new ModelAndView("/member/set/showDb", map);
	}
}
