package org.zlex.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zlex.spring.dao.AccountDao;
import org.zlex.spring.domain.Account;
import org.zlex.spring.service.AccountService;

@Service("accountServiceTwo")
@Transactional
public class AccountTwoServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;
	@Override
	public boolean verify(String username, String password) {
		
		return true;
	}
	@Override
	public Account read(int id) {
		// TODO Auto-generated method stub
		 return accountDao.read(id);
	}
	@Override
	public Account read(String username, String password) {
		  Account account = accountDao.read(username);  
		  
	        if (!password.equals(account.getPassword())) {  
	            account = null;  
	        }  
	        return account;  
	}

}
