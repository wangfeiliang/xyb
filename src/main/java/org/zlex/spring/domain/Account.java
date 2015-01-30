/**
 * 2010-1-23
 */
package org.zlex.spring.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -533698031946372178L;

	private int id;
	private String username;
	private String password;

	private Date birthday;
	private String email;
	
	public Account() {
		super();
	}

	/**
	 * @param username
	 * @param password
	 */
	public Account(String username, String password) {
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
