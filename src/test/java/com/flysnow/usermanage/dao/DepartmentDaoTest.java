package com.flysnow.usermanage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.Department;
import com.flysnow.usermanage.dao.DepartmentDao;

/**
 * @description 部门数据层测试
 * @author huangyongsheng
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class DepartmentDaoTest {

	@Autowired
	private DepartmentDao departmentDao;

 	@Test
	public void testInsert() {
		Department department = new Department();
		departmentDao.insert(department);
	}

	@Test
	public void testDelete() {
		Department department = new Department();
		departmentDao.delete(department);
	}

	@Test
	public void testUpdate() {
		Department department = new Department();
		departmentDao.update(department);
	}

	@Test
	public void testGet() {
		Department department = new Department();
		departmentDao.get(department);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		departmentDao.getListForPage(map, 1, 10);
	}

	@Test
	public void testGetList() {
		Department department = new Department();
		departmentDao.getList(department);
	}
}