package com.flysnow.usermanage.service.impl;

import com.flysnow.usermanage.model.RoleMenu;
import com.flysnow.usermanage.dao.RoleMenuDao;
import com.flysnow.usermanage.service.RoleMenuService;
import com.flysnow.common.FrameworkException;
import com.flysnow.common.BaseService;
import com.flysnow.common.Page;
import java.util.List;
import java.util.Map;

/**
 * @description 角色菜单数据业务层操作
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class RoleMenuServiceImpl extends BaseService implements RoleMenuService {

	private RoleMenuDao roleMenuDao;

	public void setRoleMenuDao(RoleMenuDao roleMenuDao) {
		this.roleMenuDao = roleMenuDao;
	}

	@Override
	public RoleMenu insert(RoleMenu entity){
		try {
			return roleMenuDao.insert(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色菜单添加异常", e);
		}
	}

	@Override
	public boolean delete(RoleMenu entity){
		try {
			return roleMenuDao.delete(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色菜单删除异常", e);
		}
	}

	@Override
	public boolean update(RoleMenu entity){
		try {
			return roleMenuDao.update(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色菜单修改异常", e);
		}
	}

	@Override
	public RoleMenu get(RoleMenu entity){
		try {
			return (RoleMenu)roleMenuDao.get(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色菜单查询异常", e);
		}
	}


	@Override
	public List getList(RoleMenu entity){
		try {
			return roleMenuDao .getList(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色菜单查询异常", e);
		}
	}


	@Override
	public Page getListForPage(Map map, int pageNo,int pageSize,String sort){
		try {
			return roleMenuDao.getListForPage(map,pageNo,pageSize);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("角色菜单查询异常", e);
		}
	}

}

