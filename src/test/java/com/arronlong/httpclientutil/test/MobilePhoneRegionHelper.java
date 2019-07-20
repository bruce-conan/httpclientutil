//package com.arronlong.httpclientutil.test;
//
//import java.text.MessageFormat;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Set;
//
//import org.apache.http.Header;
//import org.apache.http.client.HttpClient;
//
//import com.alibaba.fastjson.JSON;
//import com.arronlong.httpclientutil.HttpClientUtil;
//import com.arronlong.httpclientutil.builder.HCB;
//import com.arronlong.httpclientutil.common.HttpConfig;
//import com.arronlong.httpclientutil.common.HttpCookies;
//import com.arronlong.httpclientutil.common.HttpHeader;
//
///**
// *
// * @author conner
// * @date 2015年11月1日 下午2:23:18
// * @version 1.0
// */
//public class MobilePhoneRegionHelper {
//	static String[] apiUrls = { "https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel={0}",
//			"https://www.iteblog.com/api/mobile.php?mobile={0}", "https://cx.shouji.360.cn/phonearea.php?number={0}",
//			"https://life.tenpay.com/cgi-bin/mobile/MobileQueryAttribution.cgi?chgmobile={0}",
//			//			"https://www.baifubao.com/callback?cmd=1059&callback=iteblog&phone=15850781443"
//	};
//
////	public static final ConcurrentHashMap
//	public static void main(String[] args) throws Exception {
//		// 设置header信息
//		Header[] headers = HttpHeader.custom().userAgent(
//				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.92 Safari/537.36")
//				.accept("application/json, text/javascript, */*; q=0.01").acceptLanguage("zh-CN,zh;q=0.9")
//				.contentType("text/html; charset=utf-8")
//
//				.acceptEncoding("gzip, deflate").build();
//		HttpClient client = HCB.custom().timeout(10000).ssl().build();//采用默认方式（绕过证书验证）
//
//		HttpCookies cookies = HttpCookies.custom();
//
//		HttpConfig httpConfig = HttpConfig.custom();
//		httpConfig.client(client).headers(headers).context(cookies.getContext()).inenc("utf-8").outenc("gb2312");
//		for (int i = 0; i < 1; i++) {
//			httpConfig.url(MessageFormat.format(apiUrls[i], "13850009283"));
//			String result = HttpClientUtil.get(httpConfig);
//
//			System.out.println(result);
//			System.out.println(parseResult(result));
//		}
//	}
//
//	public static MobilePhoneRegion parseResult(String result) {
//
//		String jsonString = "{}";
//		int index = result.indexOf("{");
//		if (index != -1) {
//			jsonString = result.substring(index);
//		}
//
//		MobilePhoneRegion mobilePhoneRegion = JSON.parseObject(jsonString, MobilePhoneRegion.class);
//		return mobilePhoneRegion;
//	}
//
//	/**
//	 *
//	 */
//	public static class MobilePhoneRegionCounter {
//		public HashMap<String, Integer> regionCounter = new HashMap<>();
//
//		public void addMobilePhoneRegion(MobilePhoneRegion mobilePhoneRegion) {
//			Integer num = regionCounter.get(mobilePhoneRegion.getProvince());
//			if (num == null) {
//				num = 1;
//				regionCounter.put(mobilePhoneRegion.getProvince(), num);
//			} else {
//				num++;
//			}
//
//		}
//
//		public String showResult() {
//			Set<Map.Entry<String, Integer>> entrySet = regionCounter.entrySet();
//			Iterator<Map.Entry<String, Integer>> iter = entrySet.iterator();
//			StringBuilder sb = new StringBuilder();
//			while (iter.hasNext()) {
//				Map.Entry<String, Integer> entry = iter.next();
//				sb.append(entry.getKey()).append("：").append(entry.getValue()).append("\n");
//			}
//			return sb.toString();
//		}
//
//	}
//
//	public static class MobilePhoneRegion {
//		private String telString;
//		private String province;
//		private String carrier;
//		private String mts;
//		private String areaVid;
//		private String ispVid;
//		private String catName;
//
//		public MobilePhoneRegion() {
//			// 默认函数构造器
//		}
//
//		public String getCarrier() {
//			return carrier;
//		}
//
//		public void setCarrier(String carrier) {
//			this.carrier = carrier;
//		}
//
//		public String getMts() {
//			return mts;
//		}
//
//		public void setMts(String mts) {
//			this.mts = mts;
//		}
//
//		public String getAreaVid() {
//			return areaVid;
//		}
//
//		public void setAreaVid(String areaVid) {
//			this.areaVid = areaVid;
//		}
//
//		public String getIspVid() {
//			return ispVid;
//		}
//
//		public void setIspVid(String ispVid) {
//			this.ispVid = ispVid;
//		}
//
//		public String getCatName() {
//			return catName;
//		}
//
//		public void setCatName(String catName) {
//			this.catName = catName;
//		}
//
//		public String getTelString() {
//			return telString;
//		}
//
//		public void setTelString(String telString) {
//			this.telString = telString;
//		}
//
//		public String getProvince() {
//			return province;
//		}
//
//		public void setProvince(String province) {
//			this.province = province;
//		}
//
//		@Override
//		public String toString() {
//			return "MobilePhoneRegion{" + "telString='" + telString + '\'' + ", province='" + province + '\''
//					+ ", carrier='" + carrier + '\'' + ", mts='" + mts + '\'' + ", areaVid='" + areaVid + '\''
//					+ ", ispVid='" + ispVid + '\'' + ", catName='" + catName + '\'' + '}';
//		}
//	}
//}