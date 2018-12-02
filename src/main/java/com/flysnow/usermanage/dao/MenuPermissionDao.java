package com.flysnow.usermanage.dao;

import com.flysnow.usermanage.model.MenuPermission;
import com.flysnow.common.Page;
import java.util.List;
import java.util.Map;

/**
 * @description 菜单权限数据层操作接口
 * @description 菜单权限对象
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public abstract interface MenuPermissionDao{

	/**
	 * @description 增加
	 * @param entity
	 * @return
	 */
	public abstract MenuPermission insert(MenuPermission entity);

	/**
	 * @description 删除
	 * @param entity
	 * @return
	 */
	public abstract int delete(MenuPermission entity);

	/**
	 * @description 修改
	 * @param entity
	 * @return
	 */
	public abstract int update(MenuPermission entity);

	/**
	 * @description 查询单条
	 * @param entity
	 * @return
	 */
	public abstract MenuPermission get(MenuPermission entity);

	/**
	 * @description 多条查询
	 * @param entity
	 * @return
	*/
	public abstract List getList(MenuPermission entity);

	/**
	 * @description 分页查询
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public abstract Page getListForPage(Map map, int pageNo, int pageSize);

}