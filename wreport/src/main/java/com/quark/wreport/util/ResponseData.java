/**
 * @Title:   [ResponseData.java]
 * @Package: [com.quark.wreport.util]
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年3月1日 上午9:31:12]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年3月1日 上午9:31:12]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.quark.wreport.util;

/**
 * @ClassName: ResponseData
 * @author:  [ChangcaiCao] 
 * @CreateDate: [2017年3月1日 上午9:31:12]   
 * @UpdateUser: [ChangcaiCao]   
 * @UpdateDate: [2017年3月1日 上午9:31:12]   
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  [定义接口返回对象]
 * @version: [V1.0]
 */
public class ResponseData<T> {

	/*
	 * 响应编码
	 */
	private int code;
	
	/*
	 * 响应消息
	 */
	private String msg;
	
	/*
	 * 返回的数据
	 */
	private T data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
