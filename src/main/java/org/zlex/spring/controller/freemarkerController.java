package org.zlex.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class freemarkerController {

	@RequestMapping(value="/freemarker.do",method = RequestMethod.GET)
	public String helloTwo(HttpServletRequest request, HttpServletResponse response,ModelMap model) throws Exception {
	    model.put("name", "王飞亮");
	    return "invite-sms";
	}
}
   