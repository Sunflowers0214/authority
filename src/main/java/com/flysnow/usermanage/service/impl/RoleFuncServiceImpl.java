package com.flysnow.usermanage.service.impl;

import com.flysnow.usermanage.model.RoleFunc;
import com.flysnow.usermanage.dao.RoleFuncDao;
import com.flysnow.usermanage.service.RoleFuncService;
import com.flysnow.common.FrameworkException;
import com.flysnow.common.BaseService;
import com.flysnow.common.Page;
import java.util.List;
import java.util.Map;

/**
 * @description 角色功能数据业务层操作
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class RoleFuncServiceImpl extends BaseService implements RoleFuncService {

	private RoleFuncDao roleFuncDao;

	public void setRoleFuncDao(RoleFuncDao roleFuncDao) {
		this.roleFuncDao = roleFuncDao;
	}

	@Override
	public RoleFunc insert(RoleFunc entity){
		try {
			return roleFuncDao.insert(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色功能添加异常", e);
		}
	}

	@Override
	public boolean delete(RoleFunc entity){
		try {
			return roleFuncDao.delete(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色功能删除异常", e);
		}
	}

	@Override
	public boolean update(RoleFunc entity){
		try {
			return roleFuncDao.update(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色功能修改异常", e);
		}
	}

	@Override
	public RoleFunc get(RoleFunc entity){
		try {
			return (RoleFunc)roleFuncDao.get(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色功能查询异常", e);
		}
	}


	@Override
	public List getList(RoleFunc entity){
		try {
			return roleFuncDao .getList(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色功能查询异常", e);
		}
	}


	@Override
	public Page getListForPage(Map map, int pageNo,int pageSize,String sort){
		try {
			return roleFuncDao.getListForPage(map,pageNo,pageSize);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色功能查询异常", e);
		}
	}

}

