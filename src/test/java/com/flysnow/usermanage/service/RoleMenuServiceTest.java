package com.flysnow.usermanage.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.RoleMenu;
import com.flysnow.usermanage.service.RoleMenuService;

/**
 * @description 角色菜单逻辑层测试
 * @author huangyongsheng	 
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class RoleMenuServiceTest {
 
	@Autowired
	private RoleMenuService roleMenuService;

 	@Test
	public void testInsert() {
		RoleMenu roleMenu = new RoleMenu();
		roleMenuService.insert(roleMenu);
	}

	@Test
	public void testDelete() {
		RoleMenu roleMenu = new RoleMenu();
		roleMenuService.delete(roleMenu);
	}

	@Test
	public void testUpdate() {
		RoleMenu roleMenu = new RoleMenu();
		roleMenuService.update(roleMenu);
	}

	@Test
	public void testGet() {
		RoleMenu roleMenu = new RoleMenu();
		roleMenuService.get(roleMenu);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		roleMenuService.getListForPage(map, 1, 10, "");
	}

	@Test
	public void testGetList() {
		RoleMenu roleMenu = new RoleMenu();
		roleMenuService.getList(roleMenu);
	}
 
}