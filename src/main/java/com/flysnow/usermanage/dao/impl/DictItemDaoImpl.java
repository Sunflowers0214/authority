package com.flysnow.usermanage.dao.impl;

import java.util.List;
import java.util.Map;
import com.flysnow.usermanage.dao.DictItemDao;
import com.flysnow.usermanage.model.DictItem;
import com.flysnow.common.UUIDUtil;
import com.flysnow.common.BaseDao;
import com.flysnow.common.Page;

/**
 * @description 字典选项数据层操作接口实现
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class DictItemDaoImpl extends BaseDao implements DictItemDao {

	private static final String NAMESPACE = DictItemDao.class.getName() + ".";

	@Override
	public DictItem insert(DictItem entity){
		entity.setItemId(UUIDUtil.genKey());
		super.insert(NAMESPACE + "insertDictItem", entity);
		return entity;
	}

	@Override
	public int delete(DictItem entity){
		return super.delete(NAMESPACE + "deleteDictItem", entity);
	}

	@Override
	public int update(DictItem entity){
		return super.update(NAMESPACE + "updateDictItem", entity);
	}

	@Override
	public DictItem get(DictItem entity){
		return (DictItem)super.queryForObject(NAMESPACE + "getDictItem", entity);
	}

	@Override
	public List getList(DictItem entity){
		return super.queryForList(NAMESPACE + "getDictItemList", entity);
	}

	@Override
	public Page getListForPage(Map map, int pageNo,int pageSize){
		return super.queryForPage(NAMESPACE + "getDictItemListPage", map, pageNo,pageSize);
	}

}
