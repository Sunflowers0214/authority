package com.flysnow.usermanage.service.impl;

import com.flysnow.usermanage.model.Role;
import com.flysnow.usermanage.dao.RoleDao;
import com.flysnow.usermanage.service.RoleService;
import com.flysnow.common.FrameworkException;
import com.flysnow.common.BaseService;
import com.flysnow.common.Page;
import java.util.List;
import java.util.Map;

/**
 * @description 角色数据业务层操作
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class RoleServiceImpl extends BaseService implements RoleService {

	private RoleDao roleDao;

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	@Override
	public Role insert(Role entity){
		try {
			return roleDao.insert(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色添加异常", e);
		}
	}

	@Override
	public boolean delete(Role entity){
		try {
			return roleDao.delete(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色删除异常", e);
		}
	}

	@Override
	public boolean update(Role entity){
		try {
			return roleDao.update(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色修改异常", e);
		}
	}

	@Override
	public Role get(Role entity){
		try {
			return (Role)roleDao.get(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色查询异常", e);
		}
	}


	@Override
	public List getList(Role entity){
		try {
			return roleDao .getList(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色查询异常", e);
		}
	}


	@Override
	public Page getListForPage(Map map, int pageNo,int pageSize,String sort){
		try {
			return roleDao.getListForPage(map,pageNo,pageSize);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色查询异常", e);
		}
	}

}

