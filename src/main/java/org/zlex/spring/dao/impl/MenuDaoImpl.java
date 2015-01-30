package org.zlex.spring.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.zlex.spring.dao.MenuDao;
import org.zlex.spring.domain.Menu;
@Repository
public class MenuDaoImpl implements MenuDao {

	@Autowired  
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Menu> getMenuListByParentId(int parentId) {
		String sql = "SELECT * From menu WHERE parentId = ?";  
      //  return  jdbcTemplate.queryForList(sql,new Object[] { parentId }, Menu.class);
		return jdbcTemplate.query(sql, new Object[]{parentId}, new BeanPropertyRowMapper(Menu.class));
	}
}
