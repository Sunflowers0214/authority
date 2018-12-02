package com.flysnow.usermanage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.UserRole;
import com.flysnow.usermanage.dao.UserRoleDao;

/**
 * @description 用户角色数据层测试
 * @author huangyongsheng
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class UserRoleDaoTest {

	@Autowired
	private UserRoleDao userRoleDao;

 	@Test
	public void testInsert() {
		UserRole userRole = new UserRole();
		userRoleDao.insert(userRole);
	}

	@Test
	public void testDelete() {
		UserRole userRole = new UserRole();
		userRoleDao.delete(userRole);
	}

	@Test
	public void testUpdate() {
		UserRole userRole = new UserRole();
		userRoleDao.update(userRole);
	}

	@Test
	public void testGet() {
		UserRole userRole = new UserRole();
		userRoleDao.get(userRole);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		userRoleDao.getListForPage(map, 1, 10);
	}

	@Test
	public void testGetList() {
		UserRole userRole = new UserRole();
		userRoleDao.getList(userRole);
	}
}