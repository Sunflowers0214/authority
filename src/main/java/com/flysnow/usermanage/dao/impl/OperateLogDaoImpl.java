package com.flysnow.usermanage.dao.impl;

import java.util.List;
import java.util.Map;
import com.flysnow.usermanage.dao.OperateLogDao;
import com.flysnow.usermanage.model.OperateLog;
import com.flysnow.common.UUIDUtil;
import com.flysnow.common.BaseDao;
import com.flysnow.common.Page;

/**
 * @description 操作日志数据层操作接口实现
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class OperateLogDaoImpl extends BaseDao implements OperateLogDao {

	private static final String NAMESPACE = OperateLogDao.class.getName() + ".";

	@Override
	public OperateLog insert(OperateLog entity){
		entity.setOperateLogId(UUIDUtil.genKey());
		super.insert(NAMESPACE + "insertOperateLog", entity);
		return entity;
	}

	@Override
	public int delete(OperateLog entity){
		return super.delete(NAMESPACE + "deleteOperateLog", entity);
	}

	@Override
	public int update(OperateLog entity){
		return super.update(NAMESPACE + "updateOperateLog", entity);
	}

	@Override
	public OperateLog get(OperateLog entity){
		return (OperateLog)super.queryForObject(NAMESPACE + "getOperateLog", entity);
	}

	@Override
	public List getList(OperateLog entity){
		return super.queryForList(NAMESPACE + "getOperateLogList", entity);
	}

	@Override
	public Page getListForPage(Map map, int pageNo,int pageSize){
		return super.queryForPage(NAMESPACE + "getOperateLogListPage", map, pageNo,pageSize);
	}

}
