package com.example.railways.response;

import com.example.railways.models.UserDetails;

import java.util.Date;


public class UserCreatedResponse {
    private Date timestamp;

    private String message;

    private String status;

    private UserDetails result;

    public UserCreatedResponse() {
        super();
    }

    public UserCreatedResponse(Date timestamp, String message, String status, UserDetails result) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.status = status;
        this.result = result;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserDetails getResult() {
        return result;
    }

    public void setResult(UserDetails result) {
        this.result = result;
    }


}
