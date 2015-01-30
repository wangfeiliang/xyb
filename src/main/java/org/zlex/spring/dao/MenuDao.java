package org.zlex.spring.dao;

import java.util.List;

import org.zlex.spring.domain.Menu;

public interface MenuDao {
	  public List<Menu> getMenuListByParentId(int parentId);
}
