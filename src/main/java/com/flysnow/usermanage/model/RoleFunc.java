package com.flysnow.usermanage.model;

import java.util.Date;

/**
 * @description 角色功能对象
 * @author huangyongsheng
 * @version 1.0.0
 * @createtime 2018-12-02
 */
public class RoleFunc {

	private String roleFuncId;//角色功能ID
	private String roleId;//角色ID
	private String funcCode;//功能编码
	private String funcParam;//功能参数
	private RoleFunc where;
	
	//角色功能ID
	public String  getRoleFuncId(){
		return roleFuncId;
	}
	public void  setRoleFuncId(String roleFuncId){
		this.roleFuncId =roleFuncId;
	}
	
	//角色ID
	public String  getRoleId(){
		return roleId;
	}
	public void  setRoleId(String roleId){
		this.roleId =roleId;
	}
	
	//功能编码
	public String  getFuncCode(){
		return funcCode;
	}
	public void  setFuncCode(String funcCode){
		this.funcCode =funcCode;
	}
	
	//功能参数
	public String  getFuncParam(){
		return funcParam;
	}
	public void  setFuncParam(String funcParam){
		this.funcParam =funcParam;
	}

	//修改条件
	public RoleFunc getWhere() {
		return where;
	}
	public void setWhere(RoleFunc where) {
		this.where = where;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Config{");
		sb.append("roleFuncId="+roleFuncId+",");
		sb.append("roleId="+roleId+",");
		sb.append("funcCode="+funcCode+",");
		sb.append("funcParam="+funcParam+",");
		sb.append("}");
		return sb.toString();
	}
}