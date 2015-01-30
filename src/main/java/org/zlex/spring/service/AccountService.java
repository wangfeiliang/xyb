/**
 * 2010-1-23
 */
package org.zlex.spring.service;

import org.springframework.transaction.annotation.Transactional;
import org.zlex.spring.domain.Account;

/**
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public interface AccountService {

	/**
	 * 验证用户身份
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	boolean verify(String username, String password);
	@Transactional(readOnly = true)
	public Account read(String username, String password) ;
	@Transactional(readOnly = true)
	public Account read(int id);

}
