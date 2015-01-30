package org.zlex.spring;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.zlex.spring.dao.AccountDao;
import org.zlex.spring.domain.Account;

public class AccountDaoTest extends AbstractTestCase {

	@Autowired  
    private AccountDao accountDao;
	
	@Test  
    public void test() {  
      
        Account account = accountDao.read("snowolf");  
  
         System.out.println(account.getEmail());
        // 校验  
        assertNotNull(account);  
    } 
}
