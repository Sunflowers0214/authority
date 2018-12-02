package com.flysnow.usermanage.dao;

import com.flysnow.common.Page;
import com.flysnow.usermanage.model.Department;

import java.util.List;
import java.util.Map;

/**
 * @author huangyongsheng
 * @version 1.0.0
 * @description 部门数据层操作接口
 * @description 部门对象
 * @createtime 2018-11-29
 */
public abstract interface IDepartmentDao {

    /**
     * @param entity
     * @return
     * @description 增加
     */
    public abstract Department insert(Department entity);

    /**
     * @param entity
     * @return
     * @description 删除
     */
    public abstract int delete(Department entity);

    /**
     * @param entity
     * @return
     * @description 修改
     */
    public abstract int update(Department entity);

    /**
     * 查询单条
     *
     * @param entity
     * @return
     */
    public abstract Department get(Department entity);

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
    public abstract List getList(Department entity);

}