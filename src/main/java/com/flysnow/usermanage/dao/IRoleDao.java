package com.flysnow.usermanage.dao;

import com.flysnow.usermanage.model.Role;
import com.flysnow.common.Page;

import java.util.List;
import java.util.Map;

/**
 * @author huangyongsheng
 * @version 1.0.0
 * @description 角色数据层操作接口
 * @description 角色对象
 * @createtime 2018-11-29
 */
public abstract interface IRoleDao {

    /**
     * @param entity
     * @return
     * @description 增加
     */
    public abstract Role insert(Role entity);

    /**
     * @param entity
     * @return
     * @description 删除
     */
    public abstract int delete(Role entity);

    /**
     * @param entity
     * @return
     * @description 修改
     */
    public abstract int update(Role entity);

    /**
     * 查询单条
     *
     * @param entity
     * @return
     */
    public abstract Role get(Role entity);

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
    public abstract List getList(Role entity);

}