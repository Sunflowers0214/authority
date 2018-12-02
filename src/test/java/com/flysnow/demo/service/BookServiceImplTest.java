package com.flysnow.demo.service;

import com.flysnow.common.StatusEnum;
import com.flysnow.common.UUIDUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml", "classpath:config/spring/demo-*.xml"})
public class BookServiceImplTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint() throws Exception {
        String bookId = "1001";
        String studentId = UUIDUtil.genKey();
        StatusEnum execution = bookService.appoint(bookId, studentId);
        System.out.println(execution.getStatusName());
    }
}
