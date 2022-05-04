package com.example.railways.admin.response;

import java.util.Date;

import com.example.railways.admin.model.AdminDetails;

public class AdminLoginResponse {

	private Date date;
    private String message;
    private AdminDetails admin;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public AdminDetails getAdmin() {
		return admin;
	}
	public void setAdmin(AdminDetails admin) {
		this.admin = admin;
	}
	public AdminLoginResponse(Date date, String message, AdminDetails admin) {
		super();
		this.date = date;
		this.message = message;
		this.admin = admin;
	}
	public AdminLoginResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
}
