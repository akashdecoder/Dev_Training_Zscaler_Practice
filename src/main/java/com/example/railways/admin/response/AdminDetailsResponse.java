package com.example.railways.admin.response;

import com.example.railways.admin.model.AdminDetails;

import java.util.Date;

public class AdminDetailsResponse {

    private Date date;
    private String message;
    private AdminDetails admin;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public AdminDetails getAdmin() {
        return admin;
    }

    public void setAdmin(AdminDetails admin) {
        this.admin = admin;
    }

    public AdminDetailsResponse(Date date, String message, AdminDetails admin) {
        super();
        this.date = date;
        this.message = message;
        this.admin = admin;
    }

    public AdminDetailsResponse() {
        super();
        // TODO Auto-generated constructor stub
    }


}
