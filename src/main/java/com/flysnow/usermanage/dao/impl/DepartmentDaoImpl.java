package com.flysnow.usermanage.dao.impl;

import java.util.List;
import java.util.Map;
import com.flysnow.usermanage.dao.DepartmentDao;
import com.flysnow.usermanage.model.Department;
import com.flysnow.common.UUIDUtil;
import com.flysnow.common.BaseDao;
import com.flysnow.common.Page;

/**
 * @description 部门数据层操作接口实现
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class DepartmentDaoImpl extends BaseDao implements DepartmentDao {

	private static final String NAMESPACE = DepartmentDao.class.getName() + ".";

	@Override
	public Department insert(Department entity){
		entity.setDepartId(UUIDUtil.genKey());
		super.insert(NAMESPACE + "insertDepartment", entity);
		return entity;
	}

	@Override
	public int delete(Department entity){
		return super.delete(NAMESPACE + "deleteDepartment", entity);
	}

	@Override
	public int update(Department entity){
		return super.update(NAMESPACE + "updateDepartment", entity);
	}

	@Override
	public Department get(Department entity){
		return (Department)super.queryForObject(NAMESPACE + "getDepartment", entity);
	}

	@Override
	public List getList(Department entity){
		return super.queryForList(NAMESPACE + "getDepartmentList", entity);
	}

	@Override
	public Page getListForPage(Map map, int pageNo, int pageSize){
		return super.queryForPage(NAMESPACE + "getDepartmentListPage", map, pageNo,pageSize);
	}

}
