package com.flysnow.usermanage.dao;

import com.flysnow.usermanage.model.User;
import com.flysnow.common.Page;

import java.util.List;
import java.util.Map;

/**
 * @description 用户数据层操作接口
 * @description 用户对象
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public abstract interface UserDao{

	/**
	 * @description 增加
	 * @param entity
	 * @return
	 */
	public abstract User insert(User entity);

	/**
	 * @description 删除
	 * @param entity
	 * @return
	 */
	public abstract int delete(User entity);

	/**
	 * @description 修改
	 * @param entity
	 * @return
	 */
	public abstract int update(User entity);

	/**
	 * @description 查询单条
	 * @param entity
	 * @return
	 */
	public abstract User get(User entity);

	/**
	 * @description 多条查询
	 * @param entity
	 * @return
	*/
	public abstract List getList(User entity);

	/**
	 * @description 分页查询
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public abstract Page getListForPage(Map map, int pageNo, int pageSize);

}