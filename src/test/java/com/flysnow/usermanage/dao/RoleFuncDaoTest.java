package com.flysnow.usermanage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.RoleFunc;
import com.flysnow.usermanage.dao.RoleFuncDao;

/**
 * @description 角色功能数据层测试
 * @author huangyongsheng
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class RoleFuncDaoTest {

	@Autowired
	private RoleFuncDao roleFuncDao;

 	@Test
	public void testInsert() {
		RoleFunc roleFunc = new RoleFunc();
		roleFuncDao.insert(roleFunc);
	}

	@Test
	public void testDelete() {
		RoleFunc roleFunc = new RoleFunc();
		roleFuncDao.delete(roleFunc);
	}

	@Test
	public void testUpdate() {
		RoleFunc roleFunc = new RoleFunc();
		roleFuncDao.update(roleFunc);
	}

	@Test
	public void testGet() {
		RoleFunc roleFunc = new RoleFunc();
		roleFuncDao.get(roleFunc);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		roleFuncDao.getListForPage(map, 1, 10);
	}

	@Test
	public void testGetList() {
		RoleFunc roleFunc = new RoleFunc();
		roleFuncDao.getList(roleFunc);
	}
}