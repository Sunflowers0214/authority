package com.flysnow.usermanage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.Menu;
import com.flysnow.usermanage.dao.MenuDao;

/**
 * @description 菜单数据层测试
 * @author huangyongsheng
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class MenuDaoTest {

	@Autowired
	private MenuDao menuDao;

 	@Test
	public void testInsert() {
		Menu menu = new Menu();
		menuDao.insert(menu);
	}

	@Test
	public void testDelete() {
		Menu menu = new Menu();
		menuDao.delete(menu);
	}

	@Test
	public void testUpdate() {
		Menu menu = new Menu();
		menuDao.update(menu);
	}

	@Test
	public void testGet() {
		Menu menu = new Menu();
		menuDao.get(menu);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		menuDao.getListForPage(map, 1, 10);
	}

	@Test
	public void testGetList() {
		Menu menu = new Menu();
		menuDao.getList(menu);
	}
}