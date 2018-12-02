package com.flysnow.usermanage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.UserPermission;
import com.flysnow.usermanage.dao.UserPermissionDao;

/**
 * @description 用户登录权限数据层测试
 * @author huangyongsheng
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class UserPermissionDaoTest {

	@Autowired
	private UserPermissionDao userPermissionDao;

 	@Test
	public void testInsert() {
		UserPermission userPermission = new UserPermission();
		userPermissionDao.insert(userPermission);
	}

	@Test
	public void testDelete() {
		UserPermission userPermission = new UserPermission();
		userPermissionDao.delete(userPermission);
	}

	@Test
	public void testUpdate() {
		UserPermission userPermission = new UserPermission();
		userPermissionDao.update(userPermission);
	}

	@Test
	public void testGet() {
		UserPermission userPermission = new UserPermission();
		userPermissionDao.get(userPermission);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		userPermissionDao.getListForPage(map, 1, 10);
	}

	@Test
	public void testGetList() {
		UserPermission userPermission = new UserPermission();
		userPermissionDao.getList(userPermission);
	}
}