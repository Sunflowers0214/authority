package com.flysnow.usermanage.dao;

import com.flysnow.usermanage.model.RoleMenu;
import com.flysnow.common.Page;
import java.util.List;
import java.util.Map;

/**
 * @description 角色菜单数据层操作接口
 * @description 角色菜单对象
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public abstract interface RoleMenuDao{

	/**
	 * @description 增加
	 * @param entity
	 * @return
	 */
	public abstract RoleMenu insert(RoleMenu entity);

	/**
	 * @description 删除
	 * @param entity
	 * @return
	 */
	public abstract int delete(RoleMenu entity);

	/**
	 * @description 修改
	 * @param entity
	 * @return
	 */
	public abstract int update(RoleMenu entity);

	/**
	 * @description 查询单条
	 * @param entity
	 * @return
	 */
	public abstract RoleMenu get(RoleMenu entity);

	/**
	 * @description 多条查询
	 * @param entity
	 * @return
	*/
	public abstract List getList(RoleMenu entity);

	/**
	 * @description 分页查询
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public abstract Page getListForPage(Map map, int pageNo, int pageSize);

}