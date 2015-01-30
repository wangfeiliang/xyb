package org.zlex.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zlex.spring.dao.MenuDao;
import org.zlex.spring.domain.Menu;
import org.zlex.spring.service.MenuService;
@Service("menuService")
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao menuDao;
	@Override
	public List<Menu> getMenuListByParentId(int parentId) {
		return menuDao.getMenuListByParentId(parentId);
	}

}
