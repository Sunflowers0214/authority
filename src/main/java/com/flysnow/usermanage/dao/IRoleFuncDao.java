package com.flysnow.usermanage.dao;

import com.flysnow.common.Page;
import com.flysnow.usermanage.model.RoleFunc;

import java.util.List;
import java.util.Map;

/**
 * @author huangyongsheng
 * @version 1.0.0
 * @description t_role_func数据层操作接口
 * @description t_role_func对象
 * @createtime 2018-11-29
 */
public abstract interface IRoleFuncDao {

    /**
     * @param entity
     * @return
     * @description 增加
     */
    public abstract RoleFunc insert(RoleFunc entity);

    /**
     * @param entity
     * @return
     * @description 删除
     */
    public abstract int delete(RoleFunc entity);

    /**
     * @param entity
     * @return
     * @description 修改
     */
    public abstract int update(RoleFunc entity);

    /**
     * 查询单条
     *
     * @param entity
     * @return
     */
    public abstract RoleFunc get(RoleFunc entity);

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
    public abstract List getList(RoleFunc entity);

}