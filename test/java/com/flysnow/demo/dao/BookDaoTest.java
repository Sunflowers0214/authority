package com.flysnow.demo.dao;

import com.flysnow.demo.model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml", "classpath:config/spring/demo-*.xml"})
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void testInsert() throws Exception {
        Book book = new Book();
        book.setName("测试数据");
        book.setNumber(10);
        book = bookDao.insert(book);
        System.out.println(book);
        Book bookQ = bookDao.queryById(book.getBookId());
        System.out.println(bookQ);
    }

    @Test
    public void testQueryById() throws Exception {
        String bookId = "1000";
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }

    @Test
    public void testQueryAll() throws Exception {
        List<Book> books = bookDao.queryAll(0, 3);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void testReduceNumber() throws Exception {
        String bookId = "1000";
        int update = bookDao.reduceNumber(bookId);
        System.out.println("update=" + update);
    }
}
