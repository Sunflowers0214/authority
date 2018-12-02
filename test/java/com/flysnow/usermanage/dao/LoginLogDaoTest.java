package com.flysnow.usermanage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.LoginLog;
import com.flysnow.usermanage.dao.LoginLogDao;

/**
 * @description 登录日志数据层测试
 * @author huangyongsheng
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class LoginLogDaoTest {

	@Autowired
	private LoginLogDao loginLogDao;

 	@Test
	public void testInsert() {
		LoginLog loginLog = new LoginLog();
		loginLogDao.insert(loginLog);
	}

	@Test
	public void testDelete() {
		LoginLog loginLog = new LoginLog();
		loginLogDao.delete(loginLog);
	}

	@Test
	public void testUpdate() {
		LoginLog loginLog = new LoginLog();
		loginLogDao.update(loginLog);
	}

	@Test
	public void testGet() {
		LoginLog loginLog = new LoginLog();
		loginLogDao.get(loginLog);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		loginLogDao.getListForPage(map, 1, 10);
	}

	@Test
	public void testGetList() {
		LoginLog loginLog = new LoginLog();
		loginLogDao.getList(loginLog);
	}
}