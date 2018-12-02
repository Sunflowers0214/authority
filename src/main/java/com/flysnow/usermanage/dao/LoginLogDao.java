package com.flysnow.usermanage.dao;

import com.flysnow.usermanage.model.LoginLog;
import com.flysnow.common.Page;
import java.util.List;
import java.util.Map;

/**
 * @description 登录日志数据层操作接口
 * @description 登录日志对象
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public abstract interface LoginLogDao{

	/**
	 * @description 增加
	 * @param entity
	 * @return
	 */
	public abstract LoginLog insert(LoginLog entity);

	/**
	 * @description 删除
	 * @param entity
	 * @return
	 */
	public abstract int delete(LoginLog entity);

	/**
	 * @description 修改
	 * @param entity
	 * @return
	 */
	public abstract int update(LoginLog entity);

	/**
	 * @description 查询单条
	 * @param entity
	 * @return
	 */
	public abstract LoginLog get(LoginLog entity);

	/**
	 * @description 多条查询
	 * @param entity
	 * @return
	*/
	public abstract List getList(LoginLog entity);

	/**
	 * @description 分页查询
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public abstract Page getListForPage(Map map, int pageNo, int pageSize);

}