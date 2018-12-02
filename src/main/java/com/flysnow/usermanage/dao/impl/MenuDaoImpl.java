package com.flysnow.usermanage.dao.impl;

import java.util.List;
import java.util.Map;
import com.flysnow.usermanage.dao.MenuDao;
import com.flysnow.usermanage.model.Menu;
import com.flysnow.common.UUIDUtil;
import com.flysnow.common.BaseDao;
import com.flysnow.common.Page;

/**
 * @description 菜单数据层操作接口实现
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class MenuDaoImpl extends BaseDao implements MenuDao {

	private static final String NAMESPACE = MenuDao.class.getName() + ".";

	@Override
	public Menu insert(Menu entity){
		entity.setMenuCode(UUIDUtil.genKey());
		super.insert(NAMESPACE + "insertMenu", entity);
		return entity;
	}

	@Override
	public int delete(Menu entity){
		return super.delete(NAMESPACE + "deleteMenu", entity);
	}

	@Override
	public int update(Menu entity){
		return super.update(NAMESPACE + "updateMenu", entity);
	}

	@Override
	public Menu get(Menu entity){
		return (Menu)super.queryForObject(NAMESPACE + "getMenu", entity);
	}

	@Override
	public List getList(Menu entity){
		return super.queryForList(NAMESPACE + "getMenuList", entity);
	}

	@Override
	public Page getListForPage(Map map, int pageNo, int pageSize){
		return super.queryForPage(NAMESPACE + "getMenuListPage", map, pageNo,pageSize);
	}

}
