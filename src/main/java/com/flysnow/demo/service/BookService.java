package com.flysnow.demo.service;

import com.flysnow.common.StatusEnum;
import com.flysnow.demo.model.Book;

import java.util.List;

public interface BookService {

    /**
     * 查询所有图书
     *
     * @return
     */
    List<Book> getList();

    /**
     * 查询一本图书
     *
     * @param bookId
     * @return
     */
    Book getById(String bookId);

    /**
     * 预约图书
     *
     * @param bookId
     * @param studentId
     * @return
     */
    StatusEnum appoint(String bookId, String studentId);

    /**
     * 预约记录
     *
     * @param bookId
     * @return
     */
    List appointList(String bookId);
}
