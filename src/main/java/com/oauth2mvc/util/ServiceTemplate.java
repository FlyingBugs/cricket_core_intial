package com.oauth2mvc.util;

import java.io.Serializable;

public class ServiceTemplate implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public ServiceTemplate(String type, Object data, String status, Long result) {
		super();
		this.type = type;
		this.data = data;
		Status = status;
		this.result = result;
	}

	private String type;
	
	private Object data;
	
	private String Status;
	
	private Long result;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Long getResult() {
		return result;
	}

	public void setResult(Long result) {
		this.result = result;
	}


}
