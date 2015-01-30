package org.zlex.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zlex.spring.domain.User;

@Controller
public class RedisControllr {
     
	  @Autowired
	  private RedisTemplate<String,Object> redisTemplate;
	 @RequestMapping(value="/saveData.do",method=RequestMethod.GET)
	   public void  saveData(HttpServletRequest request){
		    System.out.println(redisTemplate);
		   // redisTemplate.opsForValue().set("re", "OK!");
		    System.out.println("foo value =="+redisTemplate.opsForValue().get("re"));
		    
		    User user=new User();
		    user.setId("1");
		    user.setName("nihaoa");
		    
		   // redisTemplate.opsForHash().put(user.getObjectKey(), user.getKey(), user);
		    
		  // redisTemplate.opsForHash().delete(user.getObjectKey(), user.getKey());//刪除
	      User getUser=  (User) redisTemplate.opsForHash().get(user.getObjectKey(), user.getKey());  
		    
		//  System.out.println("get redis is "+getUser.getId()+"   "+getUser.getName());
	   }
	 
	 
}
