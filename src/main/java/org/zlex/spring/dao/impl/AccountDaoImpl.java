/**
 * 2010-1-23
 */
package org.zlex.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.zlex.spring.dao.AccountDao;
import org.zlex.spring.domain.Account;

/**
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
//注解@Repository明确这个类是用于持久层的实现类，注意这样的注解不能用于接口，仅适用于实现类
//不再需要继承JdbcDaoSupport类，其而代之的是直接注入JdbcTemplate类！
@Repository
public class AccountDaoImpl  implements AccountDao {

	@Autowired  
    private JdbcTemplate jdbcTemplate;
	/* (non-Javadoc)
	 * @see org.zlex.spring.dao.AccountDao#read(java.lang.String)
	 */
	@Override
	public Account read(String username) {
		String sql = "SELECT * From account WHERE username = ?";  
        return (Account) jdbcTemplate.queryForObject(sql,  
                new Object[] { username }, accountRowMap);  
	}

	@Override
	public Account read(int id) {
		String sql = "SELECT * From account WHERE id = ?";  
        return (Account) jdbcTemplate.queryForObject(sql, new Object[] { id },  
                accountRowMap);  
	}

	protected RowMapper accountRowMap = new RowMapper() {  
        @Override  
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {  
            Account account = new Account();  
            account.setId(rs.getInt("id"));  
            account.setUsername(rs.getString("username"));  
            account.setPassword(rs.getString("password"));  
            account.setBirthday(rs.getDate("birthday"));  
            account.setEmail(rs.getString("email"));  
            return account;  
        }  
    }; 
}
