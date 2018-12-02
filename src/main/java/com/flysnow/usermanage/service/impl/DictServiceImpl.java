package com.flysnow.usermanage.service.impl;

import com.flysnow.usermanage.model.Dict;
import com.flysnow.usermanage.dao.DictDao;
import com.flysnow.usermanage.service.DictService;
import com.flysnow.common.FrameworkException;
import com.flysnow.common.BaseService;
import com.flysnow.common.Page;
import java.util.List;
import java.util.Map;

/**
 * @description 字典数据业务层操作
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class DictServiceImpl extends BaseService implements DictService {

	private DictDao dictDao;

	public void setDictDao(DictDao dictDao) {
		this.dictDao = dictDao;
	}

	@Override
	public Dict insert(Dict entity){
		try {
			return dictDao.insert(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("字典添加异常", e);
		}
	}

	@Override
	public boolean delete(Dict entity){
		try {
			return dictDao.delete(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("字典删除异常", e);
		}
	}

	@Override
	public boolean update(Dict entity){
		try {
			return dictDao.update(entity)>0;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("字典修改异常", e);
		}
	}

	@Override
	public Dict get(Dict entity){
		try {
			return (Dict)dictDao.get(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("字典查询异常", e);
		}
	}


	@Override
	public List getList(Dict entity){
		try {
			return dictDao .getList(entity);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("字典查询异常", e);
		}
	}


	@Override
	public Page getListForPage(Map map, int pageNo,int pageSize,String sort){
		try {
			return dictDao.getListForPage(map,pageNo,pageSize);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new FrameworkException("字典查询异常", e);
		}
	}

}

