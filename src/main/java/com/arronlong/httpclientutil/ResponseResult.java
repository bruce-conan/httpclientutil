package com.arronlong.httpclientutil;

import java.io.Serializable;

/**
 *
 * @author conner
 * @create 2019-03-23
 **/
public class ResponseResult implements Serializable {

	private int status;
	private String body;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
