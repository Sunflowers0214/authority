package com.flysnow.usermanage.service.impl;

import com.flysnow.usermanage.model.User;
import com.flysnow.usermanage.dao.UserDao;
import com.flysnow.usermanage.service.UserService;
import com.flysnow.common.FrameworkException;
import com.flysnow.common.BaseService;
import com.flysnow.common.Page;
import java.util.List;
import java.util.Map;

/**
 * @description 用户数据业务层操作
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class UserServiceImpl extends BaseService implements UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User insert(User entity){
		try {
			return userDao.insert(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("用户添加异常", e);
		}
	}

	@Override
	public boolean delete(User entity){
		try {
			return userDao.delete(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("用户删除异常", e);
		}
	}

	@Override
	public boolean update(User entity){
		try {
			return userDao.update(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("用户修改异常", e);
		}
	}

	@Override
	public User get(User entity){
		try {
			return (User)userDao.get(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("用户查询异常", e);
		}
	}


	@Override
	public List getList(User entity){
		try {
			return userDao .getList(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("用户查询异常", e);
		}
	}


	@Override
	public Page getListForPage(Map map, int pageNo,int pageSize,String sort){
		try {
			return userDao.getListForPage(map,pageNo,pageSize);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("用户查询异常", e);
		}
	}

}

