package com.example.railways.response;

import java.util.Date;

public class SeatsAvailableResponse {
    Date timestamp;
    String message;
    String status;

    int noOfAvailableSeats;

    public SeatsAvailableResponse(Date timestamp, String message, String status, int noOfAvailableSeats) {
        this.timestamp = timestamp;
        this.message = message;
        this.status = status;
        this.noOfAvailableSeats = noOfAvailableSeats;
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

    public int getAvailable() {
        return noOfAvailableSeats;
    }

    public void setAvailable(int available) {
        this.noOfAvailableSeats = noOfAvailableSeats;
    }




}
