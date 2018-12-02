package com.flysnow.usermanage.dao.impl;

import java.util.List;
import java.util.Map;
import com.flysnow.usermanage.dao.MenuPermissionDao;
import com.flysnow.usermanage.model.MenuPermission;
import com.flysnow.common.UUIDUtil;
import com.flysnow.common.BaseDao;
import com.flysnow.common.Page;

/**
 * @description 菜单权限数据层操作接口实现
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class MenuPermissionDaoImpl extends BaseDao implements MenuPermissionDao {

	private static final String NAMESPACE = MenuPermissionDao.class.getName() + ".";

	@Override
	public MenuPermission insert(MenuPermission entity){
		entity.setMenuPermissionId(UUIDUtil.genKey());
		super.insert(NAMESPACE + "insertMenuPermission", entity);
		return entity;
	}

	@Override
	public int delete(MenuPermission entity){
		return super.delete(NAMESPACE + "deleteMenuPermission", entity);
	}

	@Override
	public int update(MenuPermission entity){
		return super.update(NAMESPACE + "updateMenuPermission", entity);
	}

	@Override
	public MenuPermission get(MenuPermission entity){
		return (MenuPermission)super.queryForObject(NAMESPACE + "getMenuPermission", entity);
	}

	@Override
	public List getList(MenuPermission entity){
		return super.queryForList(NAMESPACE + "getMenuPermissionList", entity);
	}

	@Override
	public Page getListForPage(Map map, int pageNo, int pageSize){
		return super.queryForPage(NAMESPACE + "getMenuPermissionListPage", map, pageNo,pageSize);
	}

}
