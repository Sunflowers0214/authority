package com.flysnow.usermanage.dao;

import com.flysnow.common.Page;
import com.flysnow.usermanage.model.LoginLog;

import java.util.List;
import java.util.Map;

/**
 * @author huangyongsheng
 * @version 1.0.0
 * @description 登录日志数据层操作接口
 * @description 登录日志对象
 * @createtime 2018-11-29
 */
public abstract interface ILoginLogDao {

    /**
     * @param entity
     * @return
     * @description 增加
     */
    public abstract LoginLog insert(LoginLog entity);

    /**
     * @param entity
     * @return
     * @description 删除
     */
    public abstract int delete(LoginLog entity);

    /**
     * @param entity
     * @return
     * @description 修改
     */
    public abstract int update(LoginLog entity);

    /**
     * 查询单条
     *
     * @param entity
     * @return
     */
    public abstract LoginLog get(LoginLog entity);

    /**
     * @param map
     * @param pageNo
     * @param pageSize
     * @param sort
     * @return
     * @description 分页查询
     */
    public abstract Page getListForPage(Map map, int pageNo, int pageSize, String sort, String desc);

    /**
     * @param entity
     * @return
     * @description 多条查询
     */
    public abstract List getList(LoginLog entity);

}