package com.Lpan.Utils;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * 该类用来发送http请求
 * @author Lpan
 *
 */
public class HttpClientUtils {
	
	/**
	 * 
	* @Title: createHttpClient
	* @Description: TODO(创建一个httpclient)
	* @param @param isSSLValidate
	* @param @return    	设定文件
	* @return HttpClient    返回类型
	* @auther shipan
	* @throws
	 */
	public CloseableHttpClient createHttpClient(boolean isSSLValidate){
		CloseableHttpClient httpClient = null;
		if(isSSLValidate){
			
		}else{
			 httpClient = HttpClients.createDefault();
		}
		return httpClient;
	}
	
	public HttpRequestBase createHttpRequest(HttpClient httpclient){
		HttpRequestBase httpRequest = null;
		
		return httpRequest;
	}
	
	
}
