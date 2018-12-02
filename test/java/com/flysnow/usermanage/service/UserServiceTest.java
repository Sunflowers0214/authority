package com.flysnow.usermanage.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.flysnow.usermanage.model.User;
import com.flysnow.usermanage.service.UserService;

/**
 * @description 用户逻辑层测试
 * @author huangyongsheng	 
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml","classpath:config/spring/usermanage-*.xml"})
public class UserServiceTest {
 
	@Autowired
	private UserService userService;

 	@Test
	public void testInsert() {
		User user = new User();
		userService.insert(user);
	}

	@Test
	public void testDelete() {
		User user = new User();
		userService.delete(user);
	}

	@Test
	public void testUpdate() {
		User user = new User();
		userService.update(user);
	}

	@Test
	public void testGet() {
		User user = new User();
		userService.get(user);
	}

	@Test
	public void testGetListForPage() {
		Map map = new HashMap();
		userService.getListForPage(map, 1, 10, "");
	}

	@Test
	public void testGetList() {
		User user = new User();
		List<User> list = userService.getList(user);
		for (User user1 : list) {
			System.out.println(user1);
		}
	}
 
}