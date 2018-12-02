package com.flysnow.usermanage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.Dict;
import com.flysnow.usermanage.dao.DictDao;

/**
 * @description 字典数据层测试
 * @author huangyongsheng
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class DictDaoTest {

	@Autowired
	private DictDao dictDao;

 	@Test
	public void testInsert() {
		Dict dict = new Dict();
		dictDao.insert(dict);
	}

	@Test
	public void testDelete() {
		Dict dict = new Dict();
		dictDao.delete(dict);
	}

	@Test
	public void testUpdate() {
		Dict dict = new Dict();
		dictDao.update(dict);
	}

	@Test
	public void testGet() {
		Dict dict = new Dict();
		dictDao.get(dict);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		dictDao.getListForPage(map, 1, 10);
	}

	@Test
	public void testGetList() {
		Dict dict = new Dict();
		dictDao.getList(dict);
	}
}