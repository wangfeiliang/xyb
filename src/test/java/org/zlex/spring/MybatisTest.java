package org.zlex.spring;



import javax.annotation.Resource;

import org.junit.Test;
import org.zlex.spring.dao.UserMapper;
import org.zlex.spring.domain.Account;

public class MybatisTest extends AbstractTestCase{

	@Resource
	private UserMapper userMapper;
	@Test
	 public void getAccount(){
		 Account account=new Account();
		 account.setUsername("snowolf");
		 System.out.println(userMapper.selectAccount(account));
	 }
}
