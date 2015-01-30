package org.zlex.spring.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.zlex.spring.dao.AccountDao;
import org.zlex.spring.domain.Account;

//@Repository 为了验证@Autowired 按照类型匹配
public class AccountDaoImplnew implements AccountDao {

	@Override
	public Account read(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
