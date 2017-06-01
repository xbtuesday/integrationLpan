package com.Lpan.payPortal.Model;

import java.util.Map;

public class HttpRequestModel extends BaseModel{
	
	/**
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/ 
	private static final long serialVersionUID = 1L;
	private String uri;					//资源定位  
	private String charset = "UTF-8";	//请求字符集
	private String getOrPost = "POST";	//请求方式
	private String contentType = "application/x-www-form-urlencoded; charset=UTF-8";	//请求参数类型		
	private Map<String,Object> paramMap;//请求参数
	private boolean isSSLValidate = false;//是否SSL验证
	
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getCharset() {
		return charset;
	}
	public void setCharset(String charset) {
		this.charset = charset;
	}
	public String getGetOrPost() {
		return getOrPost;
	}
	public void setGetOrPost(String getOrPost) {
		this.getOrPost = getOrPost;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public Map<String, Object> getParamMap() {
		return paramMap;
	}
	public void setParamMap(Map<String, Object> paramMap) {
		this.paramMap = paramMap;
	}
	public boolean isSSLValidate() {
		return isSSLValidate;
	}
	public void setSSLValidate(boolean isSSLValidate) {
		this.isSSLValidate = isSSLValidate;
	}
	
}
