package com.flysnow.usermanage.service.impl;

import com.flysnow.usermanage.model.MenuPermission;
import com.flysnow.usermanage.dao.MenuPermissionDao;
import com.flysnow.usermanage.service.MenuPermissionService;
import com.flysnow.common.FrameworkException;
import com.flysnow.common.BaseService;
import com.flysnow.common.Page;
import java.util.List;
import java.util.Map;

/**
 * @description 菜单权限数据业务层操作
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class MenuPermissionServiceImpl extends BaseService implements MenuPermissionService {

	private MenuPermissionDao menuPermissionDao;

	public void setMenuPermissionDao(MenuPermissionDao menuPermissionDao) {
		this.menuPermissionDao = menuPermissionDao;
	}

	@Override
	public MenuPermission insert(MenuPermission entity){
		try {
			return menuPermissionDao.insert(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("菜单权限添加异常", e);
		}
	}

	@Override
	public boolean delete(MenuPermission entity){
		try {
			return menuPermissionDao.delete(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("菜单权限删除异常", e);
		}
	}

	@Override
	public boolean update(MenuPermission entity){
		try {
			return menuPermissionDao.update(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("菜单权限修改异常", e);
		}
	}

	@Override
	public MenuPermission get(MenuPermission entity){
		try {
			return (MenuPermission)menuPermissionDao.get(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("菜单权限查询异常", e);
		}
	}


	@Override
	public List getList(MenuPermission entity){
		try {
			return menuPermissionDao .getList(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("菜单权限查询异常", e);
		}
	}


	@Override
	public Page getListForPage(Map map, int pageNo,int pageSize,String sort){
		try {
			return menuPermissionDao.getListForPage(map,pageNo,pageSize);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("菜单权限查询异常", e);
		}
	}

}

