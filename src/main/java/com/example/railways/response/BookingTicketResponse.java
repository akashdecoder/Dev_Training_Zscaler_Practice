package com.example.railways.response;

import com.example.railways.models.TicketDetails;

import java.util.Date;

public class BookingTicketResponse {
    private Date timestamp;

    private String message;

    private String status;

    private TicketDetails ticketDetails;

    private String userName;

    public BookingTicketResponse() {
    }

    public BookingTicketResponse(Date timestamp, String message, String status, TicketDetails ticketDetails, String userName) {
        this.timestamp = timestamp;
        this.message = message;
        this.status = status;
        this.ticketDetails = ticketDetails;
        this.userName = userName;
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

    public TicketDetails getTicketDetails() {
        return ticketDetails;
    }

    public void setTicketDetails(TicketDetails ticketDetails) {
        this.ticketDetails = ticketDetails;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
