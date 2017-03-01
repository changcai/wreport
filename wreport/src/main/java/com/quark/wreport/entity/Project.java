/**
 * @Title:   [Project.java]
 * @Package: [com.quark.wreport.entity]
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年2月27日 下午7:28:13]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年2月27日 下午7:28:13]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.quark.wreport.entity;

/**
 * @ClassName: Project
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年2月27日 下午7:28:13]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年2月27日 下午7:28:13]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [项目信息]
 * @version: [V1.0]
 */
public class Project {

	/*
	 * 主键
	 */
	private Integer id;
	
	/*
	 * 项目名称
	 */
	private String projectCode;
	
	/*
	 * 项目名称
	 */
	private String projectName;
	
	/*
	 * 项目负责人
	 */
	private String ownerId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	
}
