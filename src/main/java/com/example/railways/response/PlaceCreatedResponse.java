package com.example.railways.response;

import com.example.railways.models.PlaceDetails;

import java.util.Date;


public class PlaceCreatedResponse {
    private Date timestamp;

    private String message;

    private String status;

    private PlaceDetails place;

    public PlaceCreatedResponse() {
        super();
        // TODO Auto-generated constructor stub
    }

    public PlaceCreatedResponse(Date timestamp, String message, String status, PlaceDetails place) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.status = status;
        this.place = place;
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

    public PlaceDetails getPlace() {
        return place;
    }

    public void setPlace(PlaceDetails place) {
        this.place = place;
    }


}
