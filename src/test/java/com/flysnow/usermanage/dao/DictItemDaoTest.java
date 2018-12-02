package com.flysnow.usermanage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.DictItem;
import com.flysnow.usermanage.dao.DictItemDao;

/**
 * @description 字典选项数据层测试
 * @author huangyongsheng
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class DictItemDaoTest {

	@Autowired
	private DictItemDao dictItemDao;

 	@Test
	public void testInsert() {
		DictItem dictItem = new DictItem();
		dictItemDao.insert(dictItem);
	}

	@Test
	public void testDelete() {
		DictItem dictItem = new DictItem();
		dictItemDao.delete(dictItem);
	}

	@Test
	public void testUpdate() {
		DictItem dictItem = new DictItem();
		dictItemDao.update(dictItem);
	}

	@Test
	public void testGet() {
		DictItem dictItem = new DictItem();
		dictItemDao.get(dictItem);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		dictItemDao.getListForPage(map, 1, 10);
	}

	@Test
	public void testGetList() {
		DictItem dictItem = new DictItem();
		dictItemDao.getList(dictItem);
	}
}