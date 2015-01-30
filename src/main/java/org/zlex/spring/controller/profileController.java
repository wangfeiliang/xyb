package org.zlex.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.zlex.spring.domain.Account;
import org.zlex.spring.service.AccountService;
@Controller
public class profileController {

	@Resource
	private AccountService  accountServiceTwo;
	@RequestMapping(value="/profile.do",method = RequestMethod.GET)
	public ModelAndView helloTwo(HttpServletRequest request, HttpServletResponse response,Account account) throws Exception {
	  
		System.out.println("springmvc中的具体请求。");
		account=accountServiceTwo.read(2);
		Map<String ,Object> map=new HashMap<String ,Object>();
		map.put("account", account);
		map.put("username", account.getUsername());
        return  new ModelAndView("profile",map); 
	}
	
	@RequestMapping(value="/profileException.do",method = RequestMethod.GET)
	public ModelAndView helloException(HttpServletRequest request, HttpServletResponse response,Account account) throws Exception {
		//throw new RuntimeException();
		return new ModelAndView("hello");
	}
}
