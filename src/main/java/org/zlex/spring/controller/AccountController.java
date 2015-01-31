/**
 * 2010-1-23
 */
package org.zlex.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.zlex.spring.domain.Account;
import org.zlex.spring.service.AccountService;

/**
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
@Controller
@SessionAttributes("msg")
// 此时就是多方法控制器。@RequestMapping 要不在类上，要不在方法上。
public class AccountController {

	@Resource
	private AccountService accountServiceTwo;

	@RequestMapping(value="/account.do",method = RequestMethod.GET)
	public ModelAndView hello(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("usname")  String uname, @RequestParam("psword") String pword,Map<String,Object> modelMap) throws Exception {
		System.out.println(request.getParameter("usname"));
		System.out.println("uname=" + uname + "  pword=" + pword);
	   Map<String,Object> modelMap2=new HashMap<String,Object>();
		modelMap.put("msg", uname);   
		try {
				/*String username = ServletRequestUtils.getRequiredStringParameter(
						request, "username");
				String password = ServletRequestUtils.getRequiredStringParameter(
						request, "password");
				System.out.println(accountServiceTwo.verify(username, password));*/
		} catch (Exception e) {
			e.printStackTrace();
		}  
		//new ModelAndView("accountNew") 如果方法参数中没有modelMap，则必须放到ModelAndView中。
        return  new ModelAndView("accountNew",modelMap); 
	}

	
	@RequestMapping(value="/accountTwo.do",method = RequestMethod.POST)
	public ModelAndView helloTwo(HttpServletRequest request, HttpServletResponse response,Account account) throws Exception {
	        System.out.println(account);
		    System.out.println("account.username="+account.getUsername()+" account.password="+account.getPassword());
        return  new ModelAndView("accountNew"); 
	}
	
	
	@RequestMapping(params = "method=login")
	public void login() {
		System.out.println("执行 login() 方法");
	}

	@RequestMapping(params = "method=logout")
	public void logout() {
		System.out.println("执行 logout() 方法");
	}

	//@RequestMapping(method = RequestMethod.GET)
	public void ab() {
		System.out.println("执行 ab() 方法");
	}

	//@RequestMapping("/a.do")
	public void a() {
		System.out.println("执行 a() 方法");
	}

	//@RequestMapping("/b.do")
	public void b(HttpServletRequest request, HttpServletResponse response)
			throws ServletRequestBindingException {
		System.out.println("执行 b() 方法");
		System.out.println("name="
				+ ServletRequestUtils.getRequiredStringParameter(request,
						"name"));
	}
}
