package com.flysnow.usermanage.dao.impl;

import java.util.List;
import java.util.Map;
import com.flysnow.usermanage.dao.RoleMenuDao;
import com.flysnow.usermanage.model.RoleMenu;
import com.flysnow.common.UUIDUtil;
import com.flysnow.common.BaseDao;
import com.flysnow.common.Page;

/**
 * @description 角色菜单数据层操作接口实现
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class RoleMenuDaoImpl extends BaseDao implements RoleMenuDao {

	private static final String NAMESPACE = RoleMenuDao.class.getName() + ".";

	@Override
	public RoleMenu insert(RoleMenu entity){
		entity.setRoleMenuId(UUIDUtil.genKey());
		super.insert(NAMESPACE + "insertRoleMenu", entity);
		return entity;
	}

	@Override
	public int delete(RoleMenu entity){
		return super.delete(NAMESPACE + "deleteRoleMenu", entity);
	}

	@Override
	public int update(RoleMenu entity){
		return super.update(NAMESPACE + "updateRoleMenu", entity);
	}

	@Override
	public RoleMenu get(RoleMenu entity){
		return (RoleMenu)super.queryForObject(NAMESPACE + "getRoleMenu", entity);
	}

	@Override
	public List getList(RoleMenu entity){
		return super.queryForList(NAMESPACE + "getRoleMenuList", entity);
	}

	@Override
	public Page getListForPage(Map map, int pageNo, int pageSize){
		return super.queryForPage(NAMESPACE + "getRoleMenuListPage", map, pageNo,pageSize);
	}

}
