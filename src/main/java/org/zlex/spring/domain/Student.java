package org.zlex.spring.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="students")
public class Student {

	 private String id;
	 private String classid;
	 private int age;
	 private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
