package org.zlex.spring.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.zlex.spring.domain.Student;

@Controller
public class MongoController {
	@Resource
	private MongoTemplate mongoTemplate;
	
	@RequestMapping(value="/mongo.do",method=RequestMethod.GET)
	private ModelAndView saveMon(){
		
		Student student=new Student();
		student.setClassid("3");
		student.setAge(25);
		student.setName("wangfeiliang");
		mongoTemplate.insert(student);
		return new ModelAndView();
	}
	
	
	@RequestMapping(value="/getMongo.do",method=RequestMethod.GET)
	private ModelAndView getMon(){
		try {
			    Query query=new Query();
			    Criteria criteria=Criteria.where("classid").is("3");
			    query.addCriteria(criteria);
			    List<Student> students= mongoTemplate.find(query, Student.class);
			    Student student=new Student();
			    if(students!=null&&students.size()>0){
			    	for(int i=0;i<students.size();i++){
			    		student=students.get(i);
			    		System.out.println("student.name="+student.getName()+" student.age="+student.getAge());
			    	}
			    }
			  
		} catch (Exception e) {
			   e.printStackTrace();
		}
	   
		return new ModelAndView();
		
	}
	
} 
