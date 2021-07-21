package com.telus.workforcemgmt.dto.resourcemanagement.dto;

public class Error {

	private String code;
	private String message;
	
	public Error(String message) {
		this.message = message;
	}
	
	public Error(String message, String code) {
		this.code = code;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
