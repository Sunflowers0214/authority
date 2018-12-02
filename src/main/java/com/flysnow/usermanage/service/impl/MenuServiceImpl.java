package com.flysnow.usermanage.service.impl;

import com.flysnow.usermanage.model.Menu;
import com.flysnow.usermanage.dao.MenuDao;
import com.flysnow.usermanage.service.MenuService;
import com.flysnow.common.FrameworkException;
import com.flysnow.common.BaseService;
import com.flysnow.common.Page;
import java.util.List;
import java.util.Map;

/**
 * @description 菜单数据业务层操作
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class MenuServiceImpl extends BaseService implements MenuService {

	private MenuDao menuDao;

	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}

	@Override
	public Menu insert(Menu entity){
		try {
			return menuDao.insert(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("菜单添加异常", e);
		}
	}

	@Override
	public boolean delete(Menu entity){
		try {
			return menuDao.delete(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("菜单删除异常", e);
		}
	}

	@Override
	public boolean update(Menu entity){
		try {
			return menuDao.update(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("菜单修改异常", e);
		}
	}

	@Override
	public Menu get(Menu entity){
		try {
			return (Menu)menuDao.get(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("菜单查询异常", e);
		}
	}


	@Override
	public List getList(Menu entity){
		try {
			return menuDao .getList(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("菜单查询异常", e);
		}
	}


	@Override
	public Page getListForPage(Map map, int pageNo,int pageSize,String sort){
		try {
			return menuDao.getListForPage(map,pageNo,pageSize);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("菜单查询异常", e);
		}
	}

}

