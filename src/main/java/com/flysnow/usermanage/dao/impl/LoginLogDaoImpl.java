package com.flysnow.usermanage.dao.impl;

import java.util.List;
import java.util.Map;
import com.flysnow.usermanage.dao.LoginLogDao;
import com.flysnow.usermanage.model.LoginLog;
import com.flysnow.common.UUIDUtil;
import com.flysnow.common.BaseDao;
import com.flysnow.common.Page;

/**
 * @description 登录日志数据层操作接口实现
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class LoginLogDaoImpl extends BaseDao implements LoginLogDao {

	private static final String NAMESPACE = LoginLogDao.class.getName() + ".";

	@Override
	public LoginLog insert(LoginLog entity){
		entity.setLoginLogId(UUIDUtil.genKey());
		super.insert(NAMESPACE + "insertLoginLog", entity);
		return entity;
	}

	@Override
	public int delete(LoginLog entity){
		return super.delete(NAMESPACE + "deleteLoginLog", entity);
	}

	@Override
	public int update(LoginLog entity){
		return super.update(NAMESPACE + "updateLoginLog", entity);
	}

	@Override
	public LoginLog get(LoginLog entity){
		return (LoginLog)super.queryForObject(NAMESPACE + "getLoginLog", entity);
	}

	@Override
	public List getList(LoginLog entity){
		return super.queryForList(NAMESPACE + "getLoginLogList", entity);
	}

	@Override
	public Page getListForPage(Map map, int pageNo,int pageSize){
		return super.queryForPage(NAMESPACE + "getLoginLogListPage", map, pageNo,pageSize);
	}

}
