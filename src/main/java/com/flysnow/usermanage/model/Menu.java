package com.flysnow.usermanage.model;

import java.util.Date;

/**
 * @description 菜单对象
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class Menu {

	private String menuId;//菜单ID
	private String menuCode;//菜单编码
	private String menuName;//菜单名称
	private String menuFuncEntry;//菜单功能入口
	private Integer menuOrder;//菜单顺序
	private String menuSpell;//拼音
	private String menuSpellJane;//简拼
	private String superMenuCode;//父节点
	private String menuFullCode;//菜单全路径编码
	private String menuFullName;//菜单全路径名称
	private Integer menuLevel;//菜单层级
	private Integer isleaf;//是否叶子节点,1:是,0:否
	private Integer menuType;//菜单类型(0:正常菜单,1:管理菜单)
	private Integer itemStatus;//状态(0:初始,1:有效,-1:失效)
	private Menu where;
	
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
	
	//菜单名称
	public String  getMenuName(){
		return menuName;
	}
	public void  setMenuName(String menuName){
		this.menuName =menuName;
	}
	
	//菜单功能入口
	public String  getMenuFuncEntry(){
		return menuFuncEntry;
	}
	public void  setMenuFuncEntry(String menuFuncEntry){
		this.menuFuncEntry =menuFuncEntry;
	}
	
	//菜单顺序
	public Integer  getMenuOrder(){
		return menuOrder;
	}
	public void  setMenuOrder(Integer menuOrder){
		this.menuOrder =menuOrder;
	}
	
	//拼音
	public String  getMenuSpell(){
		return menuSpell;
	}
	public void  setMenuSpell(String menuSpell){
		this.menuSpell =menuSpell;
	}
	
	//简拼
	public String  getMenuSpellJane(){
		return menuSpellJane;
	}
	public void  setMenuSpellJane(String menuSpellJane){
		this.menuSpellJane =menuSpellJane;
	}
	
	//父节点
	public String  getSuperMenuCode(){
		return superMenuCode;
	}
	public void  setSuperMenuCode(String superMenuCode){
		this.superMenuCode =superMenuCode;
	}
	
	//菜单全路径编码
	public String  getMenuFullCode(){
		return menuFullCode;
	}
	public void  setMenuFullCode(String menuFullCode){
		this.menuFullCode =menuFullCode;
	}
	
	//菜单全路径名称
	public String  getMenuFullName(){
		return menuFullName;
	}
	public void  setMenuFullName(String menuFullName){
		this.menuFullName =menuFullName;
	}
	
	//菜单层级
	public Integer  getMenuLevel(){
		return menuLevel;
	}
	public void  setMenuLevel(Integer menuLevel){
		this.menuLevel =menuLevel;
	}
	
	//是否叶子节点,1:是,0:否
	public Integer  getIsleaf(){
		return isleaf;
	}
	public void  setIsleaf(Integer isleaf){
		this.isleaf =isleaf;
	}
	
	//菜单类型(0:正常菜单,1:管理菜单)
	public Integer  getMenuType(){
		return menuType;
	}
	public void  setMenuType(Integer menuType){
		this.menuType =menuType;
	}
	
	//状态(0:初始,1:有效,-1:失效)
	public Integer  getItemStatus(){
		return itemStatus;
	}
	public void  setItemStatus(Integer itemStatus){
		this.itemStatus =itemStatus;
	}

	//修改条件
	public Menu getWhere() {
		return where;
	}
	public void setWhere(Menu where) {
		this.where = where;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Config{");
		sb.append("menuId="+menuId+",");
		sb.append("menuCode="+menuCode+",");
		sb.append("menuName="+menuName+",");
		sb.append("menuFuncEntry="+menuFuncEntry+",");
		sb.append("menuOrder="+menuOrder+",");
		sb.append("menuSpell="+menuSpell+",");
		sb.append("menuSpellJane="+menuSpellJane+",");
		sb.append("superMenuCode="+superMenuCode+",");
		sb.append("menuFullCode="+menuFullCode+",");
		sb.append("menuFullName="+menuFullName+",");
		sb.append("menuLevel="+menuLevel+",");
		sb.append("isleaf="+isleaf+",");
		sb.append("menuType="+menuType+",");
		sb.append("itemStatus="+itemStatus+",");
		sb.append("}");
		return sb.toString();
	}
}