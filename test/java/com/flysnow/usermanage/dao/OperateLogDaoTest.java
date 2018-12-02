package com.flysnow.usermanage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.OperateLog;
import com.flysnow.usermanage.dao.OperateLogDao;

/**
 * @description 操作日志数据层测试
 * @author huangyongsheng
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class OperateLogDaoTest {

	@Autowired
	private OperateLogDao operateLogDao;

 	@Test
	public void testInsert() {
		OperateLog operateLog = new OperateLog();
		operateLogDao.insert(operateLog);
	}

	@Test
	public void testDelete() {
		OperateLog operateLog = new OperateLog();
		operateLogDao.delete(operateLog);
	}

	@Test
	public void testUpdate() {
		OperateLog operateLog = new OperateLog();
		operateLogDao.update(operateLog);
	}

	@Test
	public void testGet() {
		OperateLog operateLog = new OperateLog();
		operateLogDao.get(operateLog);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		operateLogDao.getListForPage(map, 1, 10);
	}

	@Test
	public void testGetList() {
		OperateLog operateLog = new OperateLog();
		operateLogDao.getList(operateLog);
	}
}