/**
 * @Title:   [UserController.java]
 * @Package: [com.quark.wreport.controller]
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年2月23日 下午5:39:14]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年2月23日 下午5:39:14]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.quark.wreport.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quark.wreport.dao.EmpTaskFeedbackMapper;
import com.quark.wreport.dao.ProjectMapper;
import com.quark.wreport.dao.TaskMapper;
import com.quark.wreport.dao.UserMapper;
import com.quark.wreport.entity.EmpTaskFeedback;
import com.quark.wreport.entity.Project;
import com.quark.wreport.entity.Task;
import com.quark.wreport.entity.User;
import com.quark.wreport.util.ResponseCode;
import com.quark.wreport.util.ResponseData;
import com.quark.wreport.util.ResponseUtil;

/**
 * @ClassName: UserController
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年2月23日 下午5:39:14]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年2月23日 下午5:39:14]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */

@RestController
@RequestMapping("/wreport/user")
public class UserController{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private ProjectMapper projectMapper;
	
	@Autowired
	private TaskMapper taskMapper;
	
	@Autowired
	private EmpTaskFeedbackMapper empTaskFeedbackMapper;

	@RequestMapping(value ="/test", method=RequestMethod.GET)
	public User test() {
		System.out.println("已进入。。。");
		User user = userMapper.selectByUserName("simon");
		Project project = projectMapper.selectByProjectName("AMS");
		Task task = taskMapper.selectByTaskName("优化AMS");
		List<EmpTaskFeedback> list = empTaskFeedbackMapper.selectByUserId(1);
		
		System.out.println("user" + user.getUserName());
		System.out.println("project" + project.getProjectName());
		System.out.println("task" + task.getTaskName());
		System.out.println("empTaskFeedback" + list);
		return user;
	}
	
	
	@RequestMapping(value ="/login", method=RequestMethod.POST)
	public ResponseData<User> login(@RequestBody User user) {
		LOGGER.info("登录，请求参数：" + user);
		
		ResponseData<User> responseData = ResponseUtil.defaultResponse();
		if(user != null) {
			User record = userMapper.selectByUserNameAndRole(user.getUserName(), user.getRoles());
			if(record != null && record.getPasswd().equals(user.getPasswd())) {
				responseData.setCode(ResponseCode.SUCCESS);
				responseData.setMsg("登录成功");
				responseData.setData(record);
			} else {
				responseData.setCode(ResponseCode.LOGIN_FAIL);
				responseData.setMsg("登录失败！");
			}
		} else {
			responseData.setCode(ResponseCode.PARAM_IS_NULL);
			responseData.setMsg("输入参数为空！");
		}
		
		LOGGER.info("登录，返回结果：" + responseData);
		return responseData;
	}
	
}
