package com.flysnow.usermanage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.RoleMenu;
import com.flysnow.usermanage.dao.RoleMenuDao;

/**
 * @description 角色菜单数据层测试
 * @author huangyongsheng
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class RoleMenuDaoTest {

	@Autowired
	private RoleMenuDao roleMenuDao;

 	@Test
	public void testInsert() {
		RoleMenu roleMenu = new RoleMenu();
		roleMenuDao.insert(roleMenu);
	}

	@Test
	public void testDelete() {
		RoleMenu roleMenu = new RoleMenu();
		roleMenuDao.delete(roleMenu);
	}

	@Test
	public void testUpdate() {
		RoleMenu roleMenu = new RoleMenu();
		roleMenuDao.update(roleMenu);
	}

	@Test
	public void testGet() {
		RoleMenu roleMenu = new RoleMenu();
		roleMenuDao.get(roleMenu);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		roleMenuDao.getListForPage(map, 1, 10);
	}

	@Test
	public void testGetList() {
		RoleMenu roleMenu = new RoleMenu();
		roleMenuDao.getList(roleMenu);
	}
}