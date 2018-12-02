package com.flysnow.usermanage.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.MenuPermission;
import com.flysnow.usermanage.service.MenuPermissionService;

/**
 * @description 菜单权限逻辑层测试
 * @author huangyongsheng	 
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class MenuPermissionServiceTest {
 
	@Autowired
	private MenuPermissionService menuPermissionService;

 	@Test
	public void testInsert() {
		MenuPermission menuPermission = new MenuPermission();
		menuPermissionService.insert(menuPermission);
	}

	@Test
	public void testDelete() {
		MenuPermission menuPermission = new MenuPermission();
		menuPermissionService.delete(menuPermission);
	}

	@Test
	public void testUpdate() {
		MenuPermission menuPermission = new MenuPermission();
		menuPermissionService.update(menuPermission);
	}

	@Test
	public void testGet() {
		MenuPermission menuPermission = new MenuPermission();
		menuPermissionService.get(menuPermission);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		menuPermissionService.getListForPage(map, 1, 10, "");
	}

	@Test
	public void testGetList() {
		MenuPermission menuPermission = new MenuPermission();
		menuPermissionService.getList(menuPermission);
	}
 
}