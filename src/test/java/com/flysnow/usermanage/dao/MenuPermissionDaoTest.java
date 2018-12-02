package com.flysnow.usermanage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.MenuPermission;
import com.flysnow.usermanage.dao.MenuPermissionDao;

/**
 * @description 菜单权限数据层测试
 * @author huangyongsheng
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class MenuPermissionDaoTest {

	@Autowired
	private MenuPermissionDao menuPermissionDao;

 	@Test
	public void testInsert() {
		MenuPermission menuPermission = new MenuPermission();
		menuPermissionDao.insert(menuPermission);
	}

	@Test
	public void testDelete() {
		MenuPermission menuPermission = new MenuPermission();
		menuPermissionDao.delete(menuPermission);
	}

	@Test
	public void testUpdate() {
		MenuPermission menuPermission = new MenuPermission();
		menuPermissionDao.update(menuPermission);
	}

	@Test
	public void testGet() {
		MenuPermission menuPermission = new MenuPermission();
		menuPermissionDao.get(menuPermission);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		menuPermissionDao.getListForPage(map, 1, 10);
	}

	@Test
	public void testGetList() {
		MenuPermission menuPermission = new MenuPermission();
		menuPermissionDao.getList(menuPermission);
	}
}