package com.flysnow.usermanage.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.Menu;
import com.flysnow.usermanage.service.MenuService;

/**
 * @description 菜单逻辑层测试
 * @author huangyongsheng	 
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class MenuServiceTest {
 
	@Autowired
	private MenuService menuService;

 	@Test
	public void testInsert() {
		Menu menu = new Menu();
		menuService.insert(menu);
	}

	@Test
	public void testDelete() {
		Menu menu = new Menu();
		menuService.delete(menu);
	}

	@Test
	public void testUpdate() {
		Menu menu = new Menu();
		menuService.update(menu);
	}

	@Test
	public void testGet() {
		Menu menu = new Menu();
		menuService.get(menu);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		menuService.getListForPage(map, 1, 10, "");
	}

	@Test
	public void testGetList() {
		Menu menu = new Menu();
		menuService.getList(menu);
	}
 
}