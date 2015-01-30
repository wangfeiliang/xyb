package org.zlex.spring;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.zlex.spring.dao.AccountDao;
import org.zlex.spring.domain.Account;

public class AccountDaoTestTwo extends AbstractTestCase {

	@Autowired
	private AccountDao accountDao;
	
	@Test  
    public void testById() {  
      
        Account account = accountDao.read(2);
  
         System.out.println(account.getUsername());
        // 校验  
        assertNotNull(account);  
    } 
}
