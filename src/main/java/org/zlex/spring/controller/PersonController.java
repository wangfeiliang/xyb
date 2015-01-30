package org.zlex.spring.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zlex.spring.domain.Person;

@Controller
//@ResponseBody  @RequestBody 用具體對象和Map都可以。List也行
public class PersonController {
	  /** 
     * 查询个人信息 
     *  
     * @param id 
     * @return 
     * restful式风格
     */  
    @RequestMapping(value = "/person/profile/{id}/{name}/{status}/json.do", method = RequestMethod.GET)
    @ResponseBody
    public  Person porfile(@PathVariable int id, @PathVariable String name,  
            @PathVariable boolean status) {  
    	Person p=new Person();
    	p.setId(id);
    	p.setName(name);
    	p.setStatus(status);
        return p;  
        
    }  
  
    /** 
     * 登录 
     *  
     * @param person 
     * @return 
     */  
    @RequestMapping(value = "/person/login/json.do", method = RequestMethod.POST)  
    @ResponseBody 
    public  Person login(@RequestBody Person person) {  
    	
    	System.out.println("person.id="+person.getId()+"  person.name="+person.getName()+"  person.status="+person.isStatus());
    	
        return person;  
    }  
    
    @RequestMapping(value = "/person/login/jsonTwo.do", method = RequestMethod.POST)  
    @ResponseBody 
    public  Map loginTwo(@RequestBody Map person) {  
    	
    	System.out.println("person.id==============="+person.get("id")+"  person.name="+person.get("name")+"  person.status="+person.get("status")+"person.newData=="+person.get("newData"));
    	
        return person;  
    }  
    
    
    
    @ExceptionHandler(RuntimeException.class)  
    public @ResponseBody  
    Map<String,Object> runtimeExceptionHandler(RuntimeException runtimeException) {  
        Map model = new TreeMap();  
        model.put("status", false);  
        return model;  
    }  
    
    
    
}  