/**
 * @Title:   [TaskController.java]
 * @Package: [com.quark.wreport.controller]
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年3月1日 上午9:51:38]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年3月1日 上午9:51:38]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.quark.wreport.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quark.wreport.dao.EmpTaskFeedbackMapper;
import com.quark.wreport.entity.EmpTaskFeedback;
import com.quark.wreport.util.ResponseData;
import com.quark.wreport.util.ResponseUtil;

/**
 * @ClassName: TaskController
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年3月1日 上午9:51:38]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年3月1日 上午9:51:38]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */

@RestController
@RequestMapping("/wreport/empTaskFeedback")
public class EmpTaskFeedbackController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private EmpTaskFeedbackMapper empTaskFeedbackMapper;
	
	@RequestMapping(value ="/list", method=RequestMethod.GET)
	public ResponseData<List<EmpTaskFeedback>> list() {
		ResponseData<List<EmpTaskFeedback>> responseData = ResponseUtil.defaultResponse();
		List<EmpTaskFeedback> list = empTaskFeedbackMapper.selectAll();
		responseData.setData(list);
		return responseData;
	}
	
	@RequestMapping(value ="/list/{userId}", method=RequestMethod.GET)
	public ResponseData<List<EmpTaskFeedback>> listByUserId(@PathVariable("userId") Integer userId) {
		ResponseData<List<EmpTaskFeedback>> responseData = ResponseUtil.defaultResponse();
		List<EmpTaskFeedback> list = empTaskFeedbackMapper.selectByUserId(userId);
		responseData.setData(list);
		return responseData;
	}
	
	@RequestMapping(value ="/save", method=RequestMethod.PUT)
	public ResponseData<List<EmpTaskFeedback>> save(@RequestBody EmpTaskFeedback empTaskFeedback) {
		ResponseData<List<EmpTaskFeedback>> responseData = ResponseUtil.defaultResponse();
		empTaskFeedbackMapper.save(empTaskFeedback);
		return responseData;
	}
	
}
