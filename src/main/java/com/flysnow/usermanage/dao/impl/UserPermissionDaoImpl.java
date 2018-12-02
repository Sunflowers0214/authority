package com.flysnow.usermanage.dao.impl;

import java.util.List;
import java.util.Map;
import com.flysnow.usermanage.dao.UserPermissionDao;
import com.flysnow.usermanage.model.UserPermission;
import com.flysnow.common.UUIDUtil;
import com.flysnow.common.BaseDao;
import com.flysnow.common.Page;

/**
 * @description 用户登录权限数据层操作接口实现
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class UserPermissionDaoImpl extends BaseDao implements UserPermissionDao {

	private static final String NAMESPACE = UserPermissionDao.class.getName() + ".";

	@Override
	public UserPermission insert(UserPermission entity){
		entity.setUserPermissionId(UUIDUtil.genKey());
		super.insert(NAMESPACE + "insertUserPermission", entity);
		return entity;
	}

	@Override
	public int delete(UserPermission entity){
		return super.delete(NAMESPACE + "deleteUserPermission", entity);
	}

	@Override
	public int update(UserPermission entity){
		return super.update(NAMESPACE + "updateUserPermission", entity);
	}

	@Override
	public UserPermission get(UserPermission entity){
		return (UserPermission)super.queryForObject(NAMESPACE + "getUserPermission", entity);
	}

	@Override
	public List getList(UserPermission entity){
		return super.queryForList(NAMESPACE + "getUserPermissionList", entity);
	}

	@Override
	public Page getListForPage(Map map, int pageNo, int pageSize){
		return super.queryForPage(NAMESPACE + "getUserPermissionListPage", map, pageNo,pageSize);
	}

}
