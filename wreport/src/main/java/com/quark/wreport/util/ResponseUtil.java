/**
 * @Title:   [ResponseUtil.java]
 * @Package: [com.quark.wreport.util]
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年3月1日 上午9:35:49]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年3月1日 上午9:35:49]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.quark.wreport.util;


/**
 * @ClassName: ResponseUtil
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年3月1日 上午9:35:49]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年3月1日 上午9:35:49]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
public class ResponseUtil {

	/*
	 * 返回一个初始化的ResultData对象
	 */
	public static ResponseData defaultResponse(){
		ResponseData resultData = new ResponseData();
		resultData.setCode(ResponseCode.SUCCESS);
		resultData.setMsg("成功");
		return resultData;
	}
}
