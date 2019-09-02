package edu.usal.dto;

public class Response {

	private Boolean success;
	private String message;
	private Object data;
	
	public Response(Boolean success, Object data, String message) {
		this.success = success;
		this.data = data;
		this.message = message;
	}
	
	public Response(Boolean success, String message) {
		this.success = success;
		//this.data = data;
		this.message = message;
	}
	
	

	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
