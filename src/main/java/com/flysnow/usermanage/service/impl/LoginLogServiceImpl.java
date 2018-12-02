package com.flysnow.usermanage.service.impl;

import com.flysnow.usermanage.model.LoginLog;
import com.flysnow.usermanage.dao.LoginLogDao;
import com.flysnow.usermanage.service.LoginLogService;
import com.flysnow.common.FrameworkException;
import com.flysnow.common.BaseService;
import com.flysnow.common.Page;
import java.util.List;
import java.util.Map;

/**
 * @description 登录日志数据业务层操作
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class LoginLogServiceImpl extends BaseService implements LoginLogService {

	private LoginLogDao loginLogDao;

	public void setLoginLogDao(LoginLogDao loginLogDao) {
		this.loginLogDao = loginLogDao;
	}

	@Override
	public LoginLog insert(LoginLog entity){
		try {
			return loginLogDao.insert(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("登录日志添加异常", e);
		}
	}

	@Override
	public boolean delete(LoginLog entity){
		try {
			return loginLogDao.delete(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("登录日志删除异常", e);
		}
	}

	@Override
	public boolean update(LoginLog entity){
		try {
			return loginLogDao.update(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("登录日志修改异常", e);
		}
	}

	@Override
	public LoginLog get(LoginLog entity){
		try {
			return (LoginLog)loginLogDao.get(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("登录日志查询异常", e);
		}
	}


	@Override
	public List getList(LoginLog entity){
		try {
			return loginLogDao .getList(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("登录日志查询异常", e);
		}
	}


	@Override
	public Page getListForPage(Map map, int pageNo,int pageSize,String sort){
		try {
			return loginLogDao.getListForPage(map,pageNo,pageSize);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("登录日志查询异常", e);
		}
	}

}

