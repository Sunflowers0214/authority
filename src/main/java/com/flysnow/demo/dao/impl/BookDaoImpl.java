package com.flysnow.demo.dao.impl;

import com.flysnow.common.BaseDao;
import com.flysnow.common.UUIDUtil;
import com.flysnow.demo.dao.BookDao;
import com.flysnow.demo.model.Book;

import java.util.List;

public class BookDaoImpl extends BaseDao implements BookDao {

    public Book insert(Book book) {
        book.setBookId(UUIDUtil.genKey());
        super.insert(BookDao.class.getName() + ".insert", book);
        return book;
    }

    public Book queryById(String id) {
        return (Book) super.queryForObject(BookDao.class.getName() + ".queryById", id);
    }

    public List<Book> queryAll(int pageNo, int pageSize) {
        return super.queryForList(BookDao.class.getName() + ".queryList", null);
    }

    public int reduceNumber(String bookId) {
        return super.update(BookDao.class.getName() + ".reduceNumber", bookId);
    }
}
