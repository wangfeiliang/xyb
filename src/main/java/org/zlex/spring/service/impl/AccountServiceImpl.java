/**
 * 2010-1-23
 */
package org.zlex.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zlex.spring.dao.AccountDao;
import org.zlex.spring.domain.Account;
import org.zlex.spring.service.AccountService;

/**
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.zlex.spring.service.AccountService#verify(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean verify(String username, String password) {

		Account account = accountDao.read(username);

		if (password.equals(account.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Account read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account read(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
