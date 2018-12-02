package com.flysnow.usermanage.model;

import java.util.Date;

/**
 * @description 菜单权限对象
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class MenuPermission {

	private String menuPermissionId;//菜单权限ID
	private String menuId;//菜单ID
	private String menuCode;//菜单编码
	private String menuPermissionCode;//菜单权限编码
	private String menuPermissionName;//菜单权限名称(添加,修改,查询,删除,导出等)
	private MenuPermission where;
	
	//菜单权限ID
	public String  getMenuPermissionId(){
		return menuPermissionId;
	}
	public void  setMenuPermissionId(String menuPermissionId){
		this.menuPermissionId =menuPermissionId;
	}
	
	//菜单ID
	public String  getMenuId(){
		return menuId;
	}
	public void  setMenuId(String menuId){
		this.menuId =menuId;
	}
	
	//菜单编码
	public String  getMenuCode(){
		return menuCode;
	}
	public void  setMenuCode(String menuCode){
		this.menuCode =menuCode;
	}
	
	//菜单权限编码
	public String  getMenuPermissionCode(){
		return menuPermissionCode;
	}
	public void  setMenuPermissionCode(String menuPermissionCode){
		this.menuPermissionCode =menuPermissionCode;
	}
	
	//菜单权限名称(添加,修改,查询,删除,导出等)
	public String  getMenuPermissionName(){
		return menuPermissionName;
	}
	public void  setMenuPermissionName(String menuPermissionName){
		this.menuPermissionName =menuPermissionName;
	}

	//修改条件
	public MenuPermission getWhere() {
		return where;
	}
	public void setWhere(MenuPermission where) {
		this.where = where;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Config{");
		sb.append("menuPermissionId="+menuPermissionId+",");
		sb.append("menuId="+menuId+",");
		sb.append("menuCode="+menuCode+",");
		sb.append("menuPermissionCode="+menuPermissionCode+",");
		sb.append("menuPermissionName="+menuPermissionName+",");
		sb.append("}");
		return sb.toString();
	}
}