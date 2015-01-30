package org.zlex.spring;

import org.junit.runner.RunWith;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

//maven单元测试，此时读取的配置文件是先读取src/test/resources中的文件，如果该目录下没有配置文件，则读取src/main/resources下的配置文件。
//用maven test命令也是如此。src/test/resources有配置文件就代替src/main/resource下的文件。
@ContextConfiguration(locations="classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class AbstractTestCase  extends AbstractTransactionalDataSourceSpringContextTests{

}
