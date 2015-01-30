/**
 * 2010-1-23
 */
package org.zlex.spring.dao;

import org.zlex.spring.domain.Account;

/**
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public interface AccountDao {

	/**
	 * 读取用户信息
	 * 
	 * @param username
	 * @return
	 */
	Account read(String username);

	Account read(int id);  
}
