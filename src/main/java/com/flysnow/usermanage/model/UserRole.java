package com.flysnow.usermanage.model;

import java.util.Date;

/**
 * @description 用户角色对象
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class UserRole {

	private String userRoleId;//用户角色ID
	private String userId;//用户ID
	private String roleId;//角色ID
	private UserRole where;
	
	//用户角色ID
	public String  getUserRoleId(){
		return userRoleId;
	}
	public void  setUserRoleId(String userRoleId){
		this.userRoleId =userRoleId;
	}
	
	//用户ID
	public String  getUserId(){
		return userId;
	}
	public void  setUserId(String userId){
		this.userId =userId;
	}
	
	//角色ID
	public String  getRoleId(){
		return roleId;
	}
	public void  setRoleId(String roleId){
		this.roleId =roleId;
	}

	//修改条件
	public UserRole getWhere() {
		return where;
	}
	public void setWhere(UserRole where) {
		this.where = where;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Config{");
		sb.append("userRoleId="+userRoleId+",");
		sb.append("userId="+userId+",");
		sb.append("roleId="+roleId+",");
		sb.append("}");
		return sb.toString();
	}
}