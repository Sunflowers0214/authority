package com.flysnow.usermanage.dao.impl;

import java.util.List;
import java.util.Map;
import com.flysnow.usermanage.dao.UserDao;
import com.flysnow.usermanage.model.User;
import com.flysnow.common.UUIDUtil;
import com.flysnow.common.BaseDao;
import com.flysnow.common.Page;

/**
 * @description 用户数据层操作接口实现
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class UserDaoImpl extends BaseDao implements UserDao {

	private static final String NAMESPACE = UserDao.class.getName() + ".";

	@Override
	public User insert(User entity){
		entity.setUserId(UUIDUtil.genKey());
		super.insert(NAMESPACE + "insertUser", entity);
		return entity;
	}

	@Override
	public int delete(User entity){
		return super.delete(NAMESPACE + "deleteUser", entity);
	}

	@Override
	public int update(User entity){
		return super.update(NAMESPACE + "updateUser", entity);
	}

	@Override
	public User get(User entity){
		return (User)super.queryForObject(NAMESPACE + "getUser", entity);
	}

	@Override
	public List getList(User entity){
		return super.queryForList(NAMESPACE + "getUserList", entity);
	}

	@Override
	public Page getListForPage(Map map, int pageNo, int pageSize){
		return super.queryForPage(NAMESPACE + "getUserListPage", map, pageNo,pageSize);
	}

}
