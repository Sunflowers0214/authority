package com.flysnow.usermanage.dao.impl;

import java.util.List;
import java.util.Map;
import com.flysnow.usermanage.dao.RoleFuncDao;
import com.flysnow.usermanage.model.RoleFunc;
import com.flysnow.common.UUIDUtil;
import com.flysnow.common.BaseDao;
import com.flysnow.common.Page;

/**
 * @description 角色功能数据层操作接口实现
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class RoleFuncDaoImpl extends BaseDao implements RoleFuncDao {

	private static final String NAMESPACE = RoleFuncDao.class.getName() + ".";

	@Override
	public RoleFunc insert(RoleFunc entity){
		entity.setRoleFuncId(UUIDUtil.genKey());
		super.insert(NAMESPACE + "insertRoleFunc", entity);
		return entity;
	}

	@Override
	public int delete(RoleFunc entity){
		return super.delete(NAMESPACE + "deleteRoleFunc", entity);
	}

	@Override
	public int update(RoleFunc entity){
		return super.update(NAMESPACE + "updateRoleFunc", entity);
	}

	@Override
	public RoleFunc get(RoleFunc entity){
		return (RoleFunc)super.queryForObject(NAMESPACE + "getRoleFunc", entity);
	}

	@Override
	public List getList(RoleFunc entity){
		return super.queryForList(NAMESPACE + "getRoleFuncList", entity);
	}

	@Override
	public Page getListForPage(Map map, int pageNo,int pageSize){
		return super.queryForPage(NAMESPACE + "getRoleFuncListPage", map, pageNo,pageSize);
	}

}
