/**
 * @Title:   [UserMapper.java]
 * @Package: [com.quark.wreport.mapper]
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年2月23日 下午5:46:57]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年2月23日 下午5:46:57]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.quark.wreport.dao;

import org.apache.ibatis.annotations.Mapper;

import com.quark.wreport.entity.Task;

/**
 * @ClassName: UserMapper
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年2月23日 下午5:46:57]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年2月23日 下午5:46:57]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */

@Mapper
public interface TaskMapper {

	Task selectByTaskName(String taskName);
}
