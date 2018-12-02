package com.flysnow.usermanage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.Role;
import com.flysnow.usermanage.dao.RoleDao;

/**
 * @description 角色数据层测试
 * @author huangyongsheng
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class RoleDaoTest {

	@Autowired
	private RoleDao roleDao;

 	@Test
	public void testInsert() {
		Role role = new Role();
		roleDao.insert(role);
	}

	@Test
	public void testDelete() {
		Role role = new Role();
		roleDao.delete(role);
	}

	@Test
	public void testUpdate() {
		Role role = new Role();
		roleDao.update(role);
	}

	@Test
	public void testGet() {
		Role role = new Role();
		roleDao.get(role);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		roleDao.getListForPage(map, 1, 10);
	}

	@Test
	public void testGetList() {
		Role role = new Role();
		roleDao.getList(role);
	}
}