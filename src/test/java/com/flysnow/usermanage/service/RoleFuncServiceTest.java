package com.flysnow.usermanage.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.Map;
import com.flysnow.usermanage.model.RoleFunc;
import com.flysnow.usermanage.service.RoleFuncService;

/**
 * @description 角色功能逻辑层测试
 * @author huangyongsheng	 
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class RoleFuncServiceTest {
 
	@Autowired
	private RoleFuncService roleFuncService;

 	@Test
	public void testInsert() {
		RoleFunc roleFunc = new RoleFunc();
		roleFuncService.insert(roleFunc);
	}

	@Test
	public void testDelete() {
		RoleFunc roleFunc = new RoleFunc();
		roleFuncService.delete(roleFunc);
	}

	@Test
	public void testUpdate() {
		RoleFunc roleFunc = new RoleFunc();
		roleFuncService.update(roleFunc);
	}

	@Test
	public void testGet() {
		RoleFunc roleFunc = new RoleFunc();
		roleFuncService.get(roleFunc);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		roleFuncService.getListForPage(map, 1, 10, "");
	}

	@Test
	public void testGetList() {
		RoleFunc roleFunc = new RoleFunc();
		roleFuncService.getList(roleFunc);
	}
 
}