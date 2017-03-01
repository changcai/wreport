/**
 * @Title:   [Task.java]
 * @Package: [com.quark.wreport.entity]
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年2月27日 下午7:30:18]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年2月27日 下午7:30:18]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.quark.wreport.entity;

import java.util.Date;

/**
 * @ClassName: Task
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年2月27日 下午7:30:18]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年2月27日 下午7:30:18]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [任务信息]
 * @version: [V1.0]
 */
public class Task {

	/*
	 * 主键
	 */
	private Integer id;
	
	/*
	 * 项目代码
	 */
	private Integer projectId;
	
	/*
	 * 任务代码
	 */
	private String taskCode;
	
	/*
	 * 任务名称
	 */
	private String taskName;
	
	/*
	 * 详细描述
	 */
	private String remark;
	
	/*
	 * 开发模式
	 */
	private String devMode;
	
	/*
	 * 项目成员
	 */
	private String member;
	
	/*
	 * 项目阶段
	 */
	private String stage;
	
	/*
	 * 总工作量（小时）
	 */
	private Double workload;
	
	/*
	 * 开始时间
	 */
	private Date startTime;
	
	/*
	 * 截止时间
	 */
	private Date endTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getTaskCode() {
		return taskCode;
	}

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDevMode() {
		return devMode;
	}

	public void setDevMode(String devMode) {
		this.devMode = devMode;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public Double getWorkload() {
		return workload;
	}

	public void setWorkload(Double workload) {
		this.workload = workload;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	
}
