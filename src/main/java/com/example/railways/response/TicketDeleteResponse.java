package com.example.railways.response;


import java.util.Date;

public class TicketDeleteResponse {

    public TicketDeleteResponse() {
    }

    public TicketDeleteResponse(Date date, String message, String status) {
        this.date = date;
        this.message = message;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;

    private String message;

    private String status;

}
