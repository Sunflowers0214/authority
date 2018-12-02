package com.flysnow.usermanage.dao;

import com.flysnow.usermanage.model.Dict;
import com.flysnow.common.Page;

import java.util.List;
import java.util.Map;

/**
 * @description 字典数据层操作接口
 * @description 字典对象
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public abstract interface DictDao{

	/**
	 * @description 增加
	 * @param entity
	 * @return
	 */
	public abstract Dict insert(Dict entity);

	/**
	 * @description 删除
	 * @param entity
	 * @return
	 */
	public abstract int delete(Dict entity);

	/**
	 * @description 修改
	 * @param entity
	 * @return
	 */
	public abstract int update(Dict entity);

	/**
	 * @description 查询单条
	 * @param entity
	 * @return
	 */
	public abstract Dict get(Dict entity);

	/**
	 * @description 多条查询
	 * @param entity
	 * @return
	*/
	public abstract List getList(Dict entity);

	/**
	 * @description 分页查询
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public abstract Page getListForPage(Map map, int pageNo, int pageSize);

}