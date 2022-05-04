package com.example.railways.response;

import java.util.Date;

public class ErrorResponse {
    private Date timeStamp;
    private String message;
    private String Status;

    public ErrorResponse() {
        super();
    }

    public ErrorResponse(Date timeStamp, String message, String status) {
        super();
        this.timeStamp = timeStamp;
        this.message = message;
        Status = status;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
