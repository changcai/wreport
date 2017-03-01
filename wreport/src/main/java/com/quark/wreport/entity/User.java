/**
 * @Title:   [User.java]
 * @Package: [com.quark.wreport.entity]
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年2月23日 下午5:41:21]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年2月23日 下午5:41:21]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.quark.wreport.entity;

import java.util.Date;

/**
 * @ClassName: User
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年2月23日 下午5:41:21]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年2月23日 下午5:41:21]   
 * @UpdateRemark: []
 * @Description:  [用户信息]
 * @version: [V1.0]
 */


public class User {
	
	/*
	 * 主键
	 */
	private Integer id;

	/*
	 * 用户名
	 */
	private String userName;
	
	/*
	 * 密码
	 */
	private String passwd;
	
	/*
	 * 角色
	 */
	private String roles;
	
	/*
	 * 最后登录时间
	 */
	private Date lastLoginTime;

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	
	
	
}
