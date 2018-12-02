package com.flysnow.common;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class BaseDao extends SqlSessionDaoSupport {

    protected int insert(String sqlId, Object obj) {
        return this.getSqlSession().insert(sqlId, obj);
    }

    protected int delete(String sqlId, Object obj) {
        return this.getSqlSession().delete(sqlId, obj);
    }

    protected int update(String sqlId, Object obj) {
        return this.getSqlSession().update(sqlId, obj);
    }

    protected Object queryForObject(String sqlId, Object obj) {
        return this.getSqlSession().selectOne(sqlId, obj);
    }

    protected List queryForList(String sqlId, Object obj) {
        return this.getSqlSession().selectList(sqlId, obj);
    }

    protected Page queryForPage(String sqlId, Object obj, int pageNo, int pageSize) {
        Page page = new Page();
        List dataList = this.getSqlSession().selectList(sqlId, obj);
        page.setDatalist(dataList);
        int count = this.getSqlSession().selectOne(sqlId + "Count");
        page.setTotalRows(count);
        return page;
    }

}
