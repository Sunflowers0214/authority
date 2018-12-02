package com.flysnow.usermanage.dao;

import com.flysnow.usermanage.model.UserPermission;
import com.flysnow.common.Page;

import java.util.List;
import java.util.Map;

/**
 * @author huangyongsheng
 * @version 1.0.0
 * @description 用户登录权限数据层操作接口
 * @description 用户登录权限对象
 * @createtime 2018-11-29
 */
public abstract interface IUserPermissionDao {

    /**
     * @param entity
     * @return
     * @description 增加
     */
    public abstract UserPermission insert(UserPermission entity);

    /**
     * @param entity
     * @return
     * @description 删除
     */
    public abstract int delete(UserPermission entity);

    /**
     * @param entity
     * @return
     * @description 修改
     */
    public abstract int update(UserPermission entity);

    /**
     * 查询单条
     *
     * @param entity
     * @return
     */
    public abstract UserPermission get(UserPermission entity);

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
    public abstract List getList(UserPermission entity);

}