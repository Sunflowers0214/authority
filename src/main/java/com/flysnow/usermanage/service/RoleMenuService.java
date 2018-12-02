package com.flysnow.usermanage.service;

import com.flysnow.usermanage.model.RoleMenu;
import com.flysnow.common.Page;
import java.util.List;
import java.util.Map;

/**
 * @description 角色菜单数据业务层操作接口
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public abstract interface RoleMenuService{

	/**
	 * 增加
	 * @param entity
	 * @return
	 */
	public abstract RoleMenu insert(RoleMenu entity);

	/**
	 * 删除
	 * @param entity
	 * @return
	 */
	public abstract boolean delete(RoleMenu entity);

	/**
	 * 修改
	 * @param entity
	 * @return
	 */
  	public abstract boolean update(RoleMenu entity);

	/**
	 * 查询单条
	 * @param entity
	 * @return
	 */
  	public abstract RoleMenu get(RoleMenu entity);

	/**
	 * 多条查询
	 * @param entity
	 * @return
	 */
  	public abstract List getList(RoleMenu entity);

	/**
	 * 分页查询
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @param sort
	 * @return
	 */
	public abstract Page getListForPage(Map map, int pageNo, int pageSize, String sort);

}
