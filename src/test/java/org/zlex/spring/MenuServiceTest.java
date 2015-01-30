package org.zlex.spring;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.zlex.spring.domain.Menu;
import org.zlex.spring.service.MenuService;


public class MenuServiceTest extends AbstractTestCase {

	@Autowired
	private MenuService menuService;
	
	@Test
	public void test(){
		List<Menu> menus=menuService.getMenuListByParentId(0);
		for(Menu menu:menus){
			System.out.println(menu.getText());
		}
	}
	
}
