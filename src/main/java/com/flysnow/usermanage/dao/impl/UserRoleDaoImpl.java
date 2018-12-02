package com.flysnow.usermanage.dao.impl;

import java.util.List;
import java.util.Map;
import com.flysnow.usermanage.dao.UserRoleDao;
import com.flysnow.usermanage.model.UserRole;
import com.flysnow.common.UUIDUtil;
import com.flysnow.common.BaseDao;
import com.flysnow.common.Page;

/**
 * @description 用户角色数据层操作接口实现
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class UserRoleDaoImpl extends BaseDao implements UserRoleDao {

	private static final String NAMESPACE = UserRoleDao.class.getName() + ".";

	@Override
	public UserRole insert(UserRole entity){
		entity.setUserRoleId(UUIDUtil.genKey());
		super.insert(NAMESPACE + "insertUserRole", entity);
		return entity;
	}

	@Override
	public int delete(UserRole entity){
		return super.delete(NAMESPACE + "deleteUserRole", entity);
	}

	@Override
	public int update(UserRole entity){
		return super.update(NAMESPACE + "updateUserRole", entity);
	}

	@Override
	public UserRole get(UserRole entity){
		return (UserRole)super.queryForObject(NAMESPACE + "getUserRole", entity);
	}

	@Override
	public List getList(UserRole entity){
		return super.queryForList(NAMESPACE + "getUserRoleList", entity);
	}

	@Override
	public Page getListForPage(Map map, int pageNo,int pageSize){
		return super.queryForPage(NAMESPACE + "getUserRoleListPage", map, pageNo,pageSize);
	}

}
