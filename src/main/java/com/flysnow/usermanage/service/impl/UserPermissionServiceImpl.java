package com.flysnow.usermanage.service.impl;

import com.flysnow.usermanage.model.UserPermission;
import com.flysnow.usermanage.dao.UserPermissionDao;
import com.flysnow.usermanage.service.UserPermissionService;
import com.flysnow.common.FrameworkException;
import com.flysnow.common.BaseService;
import com.flysnow.common.Page;
import java.util.List;
import java.util.Map;

/**
 * @description 用户登录权限数据业务层操作
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class UserPermissionServiceImpl extends BaseService implements UserPermissionService {

	private UserPermissionDao userPermissionDao;

	public void setUserPermissionDao(UserPermissionDao userPermissionDao) {
		this.userPermissionDao = userPermissionDao;
	}

	@Override
	public UserPermission insert(UserPermission entity){
		try {
			return userPermissionDao.insert(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("用户登录权限添加异常", e);
		}
	}

	@Override
	public boolean delete(UserPermission entity){
		try {
			return userPermissionDao.delete(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("用户登录权限删除异常", e);
		}
	}

	@Override
	public boolean update(UserPermission entity){
		try {
			return userPermissionDao.update(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("用户登录权限修改异常", e);
		}
	}

	@Override
	public UserPermission get(UserPermission entity){
		try {
			return (UserPermission)userPermissionDao.get(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("用户登录权限查询异常", e);
		}
	}


	@Override
	public List getList(UserPermission entity){
		try {
			return userPermissionDao .getList(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("用户登录权限查询异常", e);
		}
	}


	@Override
	public Page getListForPage(Map map, int pageNo,int pageSize,String sort){
		try {
			return userPermissionDao.getListForPage(map,pageNo,pageSize);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("用户登录权限查询异常", e);
		}
	}

}

