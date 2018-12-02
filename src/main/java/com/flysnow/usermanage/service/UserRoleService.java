package com.flysnow.usermanage.service;

import com.flysnow.usermanage.model.UserRole;
import com.flysnow.common.Page;
import java.util.List;
import java.util.Map;

/**
 * @description 用户角色数据业务层操作接口
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public abstract interface UserRoleService{

	/**
	 * 增加
	 * @param entity
	 * @return
	 */
	public abstract UserRole insert(UserRole entity);

	/**
	 * 删除
	 * @param entity
	 * @return
	 */
	public abstract boolean delete(UserRole entity);

	/**
	 * 修改
	 * @param entity
	 * @return
	 */
  	public abstract boolean update(UserRole entity);

	/**
	 * 查询单条
	 * @param entity
	 * @return
	 */
  	public abstract UserRole get(UserRole entity);

	/**
	 * 多条查询
	 * @param entity
	 * @return
	 */
  	public abstract List getList(UserRole entity);

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
