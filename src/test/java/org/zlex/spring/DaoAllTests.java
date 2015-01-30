package org.zlex.spring;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)//集合测试
@SuiteClasses( { AccountDaoTest.class,AccountDaoTestTwo.class}) //集合，包括AccountDaoTest类，多个测试类可使用逗号分隔！
//这个测试类可用于Dao层集合测试，与Spring无关
public class DaoAllTests {

}
