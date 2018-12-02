package com.flysnow.usermanage.dao;

import com.flysnow.usermanage.model.Menu;
import com.flysnow.common.Page;

import java.util.List;
import java.util.Map;

/**
 * @author huangyongsheng
 * @version 1.0.0
 * @description 菜单数据层操作接口
 * @description 菜单对象
 * @createtime 2018-11-29
 */
public abstract interface IMenuDao {

    /**
     * @param entity
     * @return
     * @description 增加
     */
    public abstract Menu insert(Menu entity);

    /**
     * @param entity
     * @return
     * @description 删除
     */
    public abstract int delete(Menu entity);

    /**
     * @param entity
     * @return
     * @description 修改
     */
    public abstract int update(Menu entity);

    /**
     * 查询单条
     *
     * @param entity
     * @return
     */
    public abstract Menu get(Menu entity);

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
    public abstract List getList(Menu entity);

}