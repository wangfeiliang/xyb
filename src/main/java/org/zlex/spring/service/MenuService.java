package org.zlex.spring.service;

import java.util.List;

import org.zlex.spring.domain.Menu;

public interface MenuService {

	 public List<Menu> getMenuListByParentId(int parentId);
}
