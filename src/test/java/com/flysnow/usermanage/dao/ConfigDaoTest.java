package com.flysnow.usermanage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.Config;
import com.flysnow.usermanage.dao.ConfigDao;

/**
 * @description 全局参数数据层测试
 * @author huangyongsheng
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class ConfigDaoTest {

	@Autowired
	private ConfigDao configDao;

 	@Test
	public void testInsert() {
		Config config = new Config();
		configDao.insert(config);
	}

	@Test
	public void testDelete() {
		Config config = new Config();
		configDao.delete(config);
	}

	@Test
	public void testUpdate() {
		Config config = new Config();
		configDao.update(config);
	}

	@Test
	public void testGet() {
		Config config = new Config();
		configDao.get(config);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		configDao.getListForPage(map, 1, 10);
	}

	@Test
	public void testGetList() {
		Config config = new Config();
		configDao.getList(config);
	}
}