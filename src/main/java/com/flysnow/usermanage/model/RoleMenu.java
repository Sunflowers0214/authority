package com.flysnow.usermanage.model;

import java.util.Date;

/**
 * @description 角色菜单对象
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class RoleMenu {

	private String roleMenuId;//角色菜单ID
	private String roleId;//角色ID
	private String menuId;//菜单ID
	private String menuCode;//菜单编码
	private String menuPermission;//菜单编码
	private Integer menuOrder;//菜单顺序
	private RoleMenu where;
	
	//角色菜单ID
	public String  getRoleMenuId(){
		return roleMenuId;
	}
	public void  setRoleMenuId(String roleMenuId){
		this.roleMenuId =roleMenuId;
	}
	
	//角色ID
	public String  getRoleId(){
		return roleId;
	}
	public void  setRoleId(String roleId){
		this.roleId =roleId;
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
	
	//菜单编码
	public String  getMenuPermission(){
		return menuPermission;
	}
	public void  setMenuPermission(String menuPermission){
		this.menuPermission =menuPermission;
	}
	
	//菜单顺序
	public Integer  getMenuOrder(){
		return menuOrder;
	}
	public void  setMenuOrder(Integer menuOrder){
		this.menuOrder =menuOrder;
	}

	//修改条件
	public RoleMenu getWhere() {
		return where;
	}
	public void setWhere(RoleMenu where) {
		this.where = where;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Config{");
		sb.append("roleMenuId="+roleMenuId+",");
		sb.append("roleId="+roleId+",");
		sb.append("menuId="+menuId+",");
		sb.append("menuCode="+menuCode+",");
		sb.append("menuPermission="+menuPermission+",");
		sb.append("menuOrder="+menuOrder+",");
		sb.append("}");
		return sb.toString();
	}
}