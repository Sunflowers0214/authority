package com.flysnow.usermanage.model;

import java.util.Date;

/**
 * @description 用户登录权限对象
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class UserPermission {

	private String userPermissionId;//用户登录权限ID
	private String userId;//用户ID
	private String loginType;//登录类型(WEB端,移动端等)
	private UserPermission where;
	
	//用户登录权限ID
	public String  getUserPermissionId(){
		return userPermissionId;
	}
	public void  setUserPermissionId(String userPermissionId){
		this.userPermissionId =userPermissionId;
	}
	
	//用户ID
	public String  getUserId(){
		return userId;
	}
	public void  setUserId(String userId){
		this.userId =userId;
	}
	
	//登录类型(WEB端,移动端等)
	public String  getLoginType(){
		return loginType;
	}
	public void  setLoginType(String loginType){
		this.loginType =loginType;
	}

	//修改条件
	public UserPermission getWhere() {
		return where;
	}
	public void setWhere(UserPermission where) {
		this.where = where;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Config{");
		sb.append("userPermissionId="+userPermissionId+",");
		sb.append("userId="+userId+",");
		sb.append("loginType="+loginType+",");
		sb.append("}");
		return sb.toString();
	}
}