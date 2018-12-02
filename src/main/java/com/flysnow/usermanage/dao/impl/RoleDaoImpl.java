package com.flysnow.usermanage.dao.impl;

import java.util.List;
import java.util.Map;
import com.flysnow.usermanage.dao.RoleDao;
import com.flysnow.usermanage.model.Role;
import com.flysnow.common.UUIDUtil;
import com.flysnow.common.BaseDao;
import com.flysnow.common.Page;

/**
 * @description 角色数据层操作接口实现
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class RoleDaoImpl extends BaseDao implements RoleDao {

	private static final String NAMESPACE = RoleDao.class.getName() + ".";

	@Override
	public Role insert(Role entity){
		entity.setRoleId(UUIDUtil.genKey());
		super.insert(NAMESPACE + "insertRole", entity);
		return entity;
	}

	@Override
	public int delete(Role entity){
		return super.delete(NAMESPACE + "deleteRole", entity);
	}

	@Override
	public int update(Role entity){
		return super.update(NAMESPACE + "updateRole", entity);
	}

	@Override
	public Role get(Role entity){
		return (Role)super.queryForObject(NAMESPACE + "getRole", entity);
	}

	@Override
	public List getList(Role entity){
		return super.queryForList(NAMESPACE + "getRoleList", entity);
	}

	@Override
	public Page getListForPage(Map map, int pageNo, int pageSize){
		return super.queryForPage(NAMESPACE + "getRoleListPage", map, pageNo,pageSize);
	}

}
