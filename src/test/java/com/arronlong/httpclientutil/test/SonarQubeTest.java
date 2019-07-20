//package com.arronlong.httpclientutil.test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.http.Header;
//import org.apache.http.client.HttpClient;
//import org.apache.http.message.BasicHeader;
//
//import com.arronlong.httpclientutil.HttpClientUtil;
//import com.arronlong.httpclientutil.builder.HCB;
//import com.arronlong.httpclientutil.common.HttpConfig;
//import com.arronlong.httpclientutil.common.HttpCookies;
//import com.arronlong.httpclientutil.common.HttpHeader;
//import com.arronlong.httpclientutil.exception.HttpProcessException;
//
///**
// *
// * @author arron
// * @date 2015年11月1日 下午2:23:18
// * @version 1.0
// */
//public class SonarQubeTest {
//
//	public static void testCreateUser(String login, String name, String passwd) throws HttpProcessException {
//		//		; Max-Age=259200; Expires=Sun, 23-Sep-2018 11:22:50 GMT; Path=/; HttpOnly
//
//		Header[] headers = HttpHeader.custom()
//				.cookie("XSRF-TOKEN=ca18a8gia9bu459emco0rlu6jc; JWT-SESSION=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJBV1h5ZUgxVGh1VWhickxva3NyeiIsInN1YiI6ImFkbWluIiwiaWF0IjoxNTM3MzcxMzA3LCJleHAiOjE1Mzc3MDE3NzAsImxhc3RSZWZyZXNoVGltZSI6MTUzNzM3MTMwNzM0MywieHNyZlRva2VuIjoiY2ExOGE4Z2lhOWJ1NDU5ZW1jbzBybHU2amMifQ.ZalqKTBViuK8ygu1Jkgm0tqKSLPhozLQTPRBCsjUKQY")
//				.userAgent(
//						"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.92 Safari/537.36")
//				.accept("application/json, text/javascript, */*; q=0.01").acceptLanguage("zh-CN,zh;q=0.9")
//				.acceptEncoding("gzip, deflate").referer("http://172.16.52.28:9000/admin/users").host("172.16.52.28")
//				.build();
//
//		List<Header> headerList = new ArrayList<>();
//
//		headerList.addAll(Arrays.asList(headers));
//
//		headerList.add(new BasicHeader("DNT", "1"));
//		headerList.add(new BasicHeader("X-XSRF-TOKEN", "ca18a8gia9bu459emco0rlu6jc"));
//		headerList.add(new BasicHeader("X-Requested-With", "XMLHttpRequest"));
//		headerList.add(new BasicHeader("Origin", "http://172.16.52.28:9000"));
//
//		HttpCookies cookies = HttpCookies.custom();
//
//		Map<String, Object> params = new HashMap<>();
//		params.put("login", login);
//		params.put("name", name);
//		params.put("password", passwd);
//		params.put("email", "");
//		params.put("scmAccount", "");
//		HttpClient client = HCB.custom().timeout(10000).proxy("127.0.0.1", 8888).build();//采用默认方式（绕过证书验证）
//		HttpConfig config = HttpConfig.custom().context(cookies.getContext()).headers(headerList.toArray(new Header[0]))
//				.map(params);
//
//		String result = HttpClientUtil
//				.post(client, "http://172.16.52.28:9000/api/users/create", headerList.toArray(new Header[0]), params,
//						cookies.getContext(), "utf-8");
//
//		System.out.println(result);
//	}
//
//	public static void main(String[] args) throws Exception {
//
//		String[] userInfos = new String[] { "zhuangjq,庄建青,zhuangjq959", "lixy,李秀源,lixy195", "lihy,李宏毅,lihy457",
//				"hankm,韩科敏,hankm637", "liukd,刘坤东,liukd1000", "chenh,陈煌,chenh563", "zenghy,曾惠燕,zenghy772",
//				"qiaosg,乔绍刚,qiaosg831", "youdf,游德锋,youdf946", "chenfy,陈飞燕,chenfy744", "qiuyl,邱玉龙,qiuyl586",
//				"yangl,阳莲,yangl572", "zhangjn,张江南,zhangjn483", "chenlq,陈理群,chenlq520", "linwh,林万辉,linwh342",
//				"zhanjt,詹建通,zhanjt74", "kejz,柯进展,kejz503", "liyz,李奕洲,liyz628", "guogl,郭国玲,guogl582",
//				"caohx,曹华选,caohx172", "hexd,何雪东,hexd463", "yel,叶琳,yel704", "tongwl,童文霖,tongwl956", "yanht,颜海涛,yanht52",
//				"suhl,苏海亮,suhl693", "hongsm,洪顺满,hongsm425", "gaohw,高惠武,gaohw237", "huangxh,黄小宏,huangxh132",
//				"laiwb,赖伟斌,laiwb664", "fuyl,傅燕龙,fuyl445", "huangxb,黄熊滨,huangxb550", "linm,林铭,linm847",
//				"yeys,叶煜松,yeys125", "yezx,叶志雄,yezx495", "wuzh,吴振辉,wuzh762", "zhuz,朱震,zhuz106", "wyq,王运强,wyq543",
//				"yusy,余寿源,yusy178", "yangbh,杨宝环,yangbh167",
//
//		};
//		for (int i = 1; i < userInfos.length; i++) {
//			String[] parts = userInfos[i].split(",");
//			testCreateUser(parts[0], parts[1], parts[2]);
//		}
//	}
//}