package org.zlex.spring.domain;

import java.io.Serializable;

public class Person implements Serializable {

	    private int id;  
	    private String name;  
	    private boolean status;  
	  
	    public Person() {  
	        // do nothing  
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}
	    
	    
}
