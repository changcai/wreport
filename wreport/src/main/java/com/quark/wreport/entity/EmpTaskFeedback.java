/**
 * @Title:   [EmpTaskFeedback.java]
 * @Package: [com.quark.wreport.entity]
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年2月27日 下午7:34:38]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年2月27日 下午7:34:38]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.quark.wreport.entity;

import java.util.Date;

/**
 * @ClassName: EmpTaskFeedback
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年2月27日 下午7:34:38]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年2月27日 下午7:34:38]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [员工任务反馈信息]
 * @version: [V1.0]
 */
public class EmpTaskFeedback {

	/*
	 * 主键
	 */
	private Integer id;
	
	/*
	 * 用户ID
	 */
	private Integer userId;
	
	/*
	 * 任务ID
	 */
	private Integer taskId;
	
	/*
	 * 任务阶段
	 */
	private String taskStage;
	
	/*
	 * 任务简要说明
	 */
	private String taskRemark;
	
	/*
	 * 填报工时
	 */
	private Double applyHours;
	
	/*
	 * 填报时间
	 */
	private Date applyTime;
	
	/*
	 * 审核人
	 */
	private Integer approveId;
	
	/*
	 * 审核时间
	 */
	private Date approveTime;
	
	/*
	 * 审核状态
	 */
	private String approveStatus;
	
	/*
	 * 创建时间
	 */
	private String createTime;
	
	/*
	 * 修改时间
	 */
	private String updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getTaskStage() {
		return taskStage;
	}

	public void setTaskStage(String taskStage) {
		this.taskStage = taskStage;
	}

	public String getTaskRemark() {
		return taskRemark;
	}

	public void setTaskRemark(String taskRemark) {
		this.taskRemark = taskRemark;
	}

	public Double getApplyHours() {
		return applyHours;
	}

	public void setApplyHours(Double applyHours) {
		this.applyHours = applyHours;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public Integer getApproveId() {
		return approveId;
	}

	public void setApproveId(Integer approveId) {
		this.approveId = approveId;
	}

	public Date getApproveTime() {
		return approveTime;
	}

	public void setApproveTime(Date approveTime) {
		this.approveTime = approveTime;
	}

	public String getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
