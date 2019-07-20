package com.arronlong.httpclientutil;

import java.io.OutputStream;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.protocol.HttpContext;

import com.arronlong.httpclientutil.common.HttpConfig;
import com.arronlong.httpclientutil.common.HttpMethods;
import com.arronlong.httpclientutil.exception.HttpProcessException;

/**
 * 使用HttpClient模拟发送（http/https）请求
 * 
 * @author arron
 * @version 1.0
 */
public class HttpClientUtil{
	
	//-----------华----丽----分----割----线--------------
	//-----------华----丽----分----割----线--------------
	//-----------华----丽----分----割----线--------------
	
	/**
	 * 以Get方式，请求资源或服务
	 * 
	 * @param client				client对象
	 * @param url					资源地址
	 * @param headers			请求头信息
	 * @param context			http上下文，用于cookie操作
	 * @param encoding		编码
	 * @return						返回处理结果
	 * @throws HttpProcessException	http处理异常 
	 */
	public static String get(HttpClient client, String url, Header[] headers, HttpContext context, String encoding) throws HttpProcessException {
		return get(HttpConfig.custom().client(client).url(url).headers(headers).context(context).encoding(encoding));
	}
	/**
	 * 以Get方式，请求资源或服务
	 * 
	 * @param config		请求参数配置
	 * @return	返回结果
	 * @throws HttpProcessException	http处理异常
	 */
	public static String get(HttpConfig config) throws HttpProcessException {
		return HttpClientWrapper.get(config).getBody();
	}
	
	/**
	 * 以Post方式，请求资源或服务
	 * 
	 * @param client		client对象
	 * @param url			资源地址
	 * @param headers		请求头信息
	 * @param parasMap		请求参数
	 * @param context		http上下文，用于cookie操作
	 * @param encoding		编码
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常 
	 */
	public static String post(HttpClient client, String url, Header[] headers, Map<String,Object>parasMap, HttpContext context, String encoding) throws HttpProcessException {
		return post(HttpConfig.custom().client(client).url(url).headers(headers).map(parasMap).context(context).encoding(encoding));
	}
	/**
	 * 以Post方式，请求资源或服务
	 * 
	 * @param config		请求参数配置
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常
	 */
	public static String post(HttpConfig config) throws HttpProcessException {
		return HttpClientWrapper.post(config.method(HttpMethods.POST)).getBody();
	}
	
	/**
	 * 以Put方式，请求资源或服务
	 * 
	 * @param client		client对象
	 * @param url			资源地址
	 * @param parasMap		请求参数
	 * @param headers		请求头信息
	 * @param context		http上下文，用于cookie操作
	 * @param encoding		编码
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常 
	 */
	public static String put(HttpClient client, String url, Map<String,Object>parasMap,Header[] headers, HttpContext context,String encoding) throws HttpProcessException {
		return put(HttpConfig.custom().client(client).url(url).headers(headers).map(parasMap).context(context).encoding(encoding));
	}
	/**
	 * 以Put方式，请求资源或服务
	 * 
	 * @param config		请求参数配置
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常
	 */
	public static String put(HttpConfig config) throws HttpProcessException {
		return HttpClientWrapper.send(config.method(HttpMethods.PUT)).getBody();
	}
	
	/**
	 * 以Delete方式，请求资源或服务
	 * 
	 * @param client		client对象
	 * @param url			资源地址
	 * @param headers		请求头信息
	 * @param context		http上下文，用于cookie操作
	 * @param encoding		编码
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常 
	 */
	public static String delete(HttpClient client, String url, Header[] headers, HttpContext context,String encoding) throws HttpProcessException {
		return delete(HttpConfig.custom().client(client).url(url).headers(headers).context(context).encoding(encoding));
	}
	/**
	 * 以Delete方式，请求资源或服务
	 * 
	 * @param config		请求参数配置
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常
	 */
	public static String delete(HttpConfig config) throws HttpProcessException {
		return HttpClientWrapper.send(config.method(HttpMethods.DELETE)).getBody();
	}
	
	/**
	 * 以Patch方式，请求资源或服务
	 * 
	 * @param client		client对象
	 * @param url			资源地址
	 * @param parasMap		请求参数
	 * @param headers		请求头信息
	 * @param context		http上下文，用于cookie操作
	 * @param encoding		编码
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常 
	 */
	public static String patch(HttpClient client, String url, Map<String,Object>parasMap, Header[] headers, HttpContext context,String encoding) throws HttpProcessException {
		return patch(HttpConfig.custom().client(client).url(url).headers(headers).map(parasMap).context(context).encoding(encoding));
	}
	/**
	 * 以Patch方式，请求资源或服务
	 * 
	 * @param config		请求参数配置
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常
	 */
	public static String patch(HttpConfig config) throws HttpProcessException {
		return HttpClientWrapper.send(config.method(HttpMethods.PATCH)).getBody();
	}
	
	/**
	 * 以Head方式，请求资源或服务
	 * 
	 * @param client		client对象
	 * @param url			资源地址
	 * @param headers		请求头信息
	 * @param context		http上下文，用于cookie操作
	 * @param encoding		编码
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常 
	 */
	public static String head(HttpClient client, String url, Header[] headers, HttpContext context,String encoding) throws HttpProcessException {
		return head(HttpConfig.custom().client(client).url(url).headers(headers).context(context).encoding(encoding));
	}
	/**
	 * 以Head方式，请求资源或服务
	 * 
	 * @param config		请求参数配置
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常
	 */
	public static String head(HttpConfig config) throws HttpProcessException {
		return HttpClientWrapper.send(config.method(HttpMethods.HEAD)).getBody();
	}
	
	/**
	 * 以Options方式，请求资源或服务
	 * 
	 * @param client		client对象
	 * @param url			资源地址
	 * @param headers		请求头信息
	 * @param context		http上下文，用于cookie操作
	 * @param encoding		编码
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常 
	 */
	public static String options(HttpClient client, String url, Header[] headers, HttpContext context,String encoding) throws HttpProcessException {
		return options(HttpConfig.custom().client(client).url(url).headers(headers).context(context).encoding(encoding));
	}
	/**
	 * 以Options方式，请求资源或服务
	 * 
	 * @param config		请求参数配置
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常
	 */
	public static String options(HttpConfig config) throws HttpProcessException {
		return HttpClientWrapper.send(config.method(HttpMethods.OPTIONS)).getBody();
	}
	
	/**
	 * 以Trace方式，请求资源或服务
	 * 
	 * @param client		client对象
	 * @param url			资源地址
	 * @param headers		请求头信息
	 * @param context		http上下文，用于cookie操作
	 * @param encoding		编码
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常 
	 */
	public static String trace(HttpClient client, String url, Header[] headers, HttpContext context, String encoding) throws HttpProcessException {
		return trace(HttpConfig.custom().client(client).url(url).headers(headers).context(context).encoding(encoding));
	}
	/**
	 * 以Trace方式，请求资源或服务
	 * 
	 * @param config		请求参数配置
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常
	 */
	public static String trace(HttpConfig config) throws HttpProcessException {
		return HttpClientWrapper.send(config.method(HttpMethods.TRACE)).getBody();
	}
	
	/**
	 * 下载文件
	 * 
	 * @param client		client对象
	 * @param url			资源地址
	 * @param headers		请求头信息
	 * @param context		http上下文，用于cookie操作
	 * @param out			输出流
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常 
	 */
	public static OutputStream down(HttpClient client, String url, Header[] headers, HttpContext context, OutputStream out) throws HttpProcessException {
		return down(HttpConfig.custom().client(client).url(url).headers(headers).context(context).out(out));
	}
	
	/**
	 * 下载文件
	 * 
	 * @param config		请求参数配置
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常 
	 */
	public static OutputStream down(HttpConfig config) throws HttpProcessException {
		return HttpClientWrapper.down(config);
	}
	
	/**
	 * 上传文件
	 * 
	 * @param client		client对象
	 * @param url			资源地址
	 * @param headers		请求头信息
	 * @param context		http上下文，用于cookie操作
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常 
	 */
	public static String upload(HttpClient client, String url, Header[] headers, HttpContext context) throws HttpProcessException {
		return upload(HttpConfig.custom().client(client).url(url).headers(headers).context(context));
	}
	
	/**
	 * 上传文件
	 * 
	 * @param config		请求参数配置
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常 
	 */
	public static String upload(HttpConfig config) throws HttpProcessException {
		if(config.method() != HttpMethods.POST  && config.method() != HttpMethods.PUT){
			config.method(HttpMethods.POST);
		}
		return HttpClientWrapper.send(config).getBody();
	}
	
	/**
	 * 查看资源链接情况，返回状态码
	 * 
	 * @param client		client对象
	 * @param url			资源地址
	 * @param headers		请求头信息
	 * @param context		http上下文，用于cookie操作
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常 
	 */
	public static int status(HttpClient client, String url, Header[] headers, HttpContext context, HttpMethods method) throws HttpProcessException {
		return status(HttpConfig.custom().client(client).url(url).headers(headers).context(context).method(method));
	}
	
	/**
	 * 查看资源链接情况，返回状态码
	 * 
	 * @param config		请求参数配置
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常 
	 */
	public static int status(HttpConfig config) throws HttpProcessException {
		return HttpClientWrapper.status(config);
	}

	//-----------华----丽----分----割----线--------------
	//-----------华----丽----分----割----线--------------
	//-----------华----丽----分----割----线--------------
	
	/**
	 * 请求资源或服务
	 * 
	 * @param config		请求参数配置
	 * @return				返回处理结果
	 * @throws HttpProcessException	http处理异常
	 */
	public static String send(HttpConfig config) throws HttpProcessException {
		return HttpClientWrapper.send(config).getBody();
	}
	

	

}