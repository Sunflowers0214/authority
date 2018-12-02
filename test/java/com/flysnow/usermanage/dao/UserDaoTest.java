package com.flysnow.usermanage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.flysnow.usermanage.model.User;
import com.flysnow.usermanage.dao.UserDao;

/**
 * @author huangyongsheng
 * @description 用户数据层测试
 * @createtime 2018-12-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml", "classpath:config/spring/usermanage-*.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testInsert() {
        User user = new User();
        userDao.insert(user);
    }

    @Test
    public void testDelete() {
        User user = new User();
        userDao.delete(user);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        userDao.update(user);
    }

    @Test
    public void testGet() {
        User user = new User();
        userDao.get(user);
    }

    @Test
    public void testGetListForPage() {
        Map map = new HashMap();
        userDao.getListForPage(map, 1, 10);
    }

    @Test
    public void testGetList() {
        User user = new User();
        List<User> list = userDao.getList(user);
        for (User user1 : list) {
            System.out.println(user1);
        }
    }
}