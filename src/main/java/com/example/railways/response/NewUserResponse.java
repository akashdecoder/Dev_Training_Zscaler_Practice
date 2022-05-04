package com.example.railways.response;

import com.example.railways.models.UserDetails;

import java.util.Date;

public class NewUserResponse {
    private Date date;

    private String message;

    private String status;

    private UserDetails user;

    public NewUserResponse(Date date, String message, String status, UserDetails user) {
        this.date = date;
        this.message = message;
        this.status = status;
        this.user = user;
    }

    public NewUserResponse() {
    }

    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStatus() {
        return this.status;
    }

    public UserDetails getUser() {
        return this.user;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUser(UserDetails user) {
        this.user = user;
    }
}