package com.flysnow.demo.dao;

import com.flysnow.demo.model.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {

    /**
     * 添加书本
     *
     * @param book
     * @return
     */
    Book insert(Book book);

    /**
     * 通过ID查询单本图书
     *
     * @param id
     * @return
     */
    Book queryById(String id);

    /**
     * 查询所有图书
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 减少馆藏数量
     *
     * @param bookId
     * @return 如果影响行数等于>1，表示更新的记录行数
     */
    int reduceNumber(String bookId);

}
