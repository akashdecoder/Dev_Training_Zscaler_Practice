package com.example.railways.response;

import com.example.railways.models.PlaceDetails;

import java.util.Date;
import java.util.List;

public class GetPlaceResponse {
    private Date timestamp;

    private String message;

    private String status;

    private List<PlaceDetails> place;

    public GetPlaceResponse(Date timestamp, String message, String status, List<PlaceDetails> place) {
        this.timestamp = timestamp;
        this.message = message;
        this.status = status;
        this.place = place;
    }

    public GetPlaceResponse() {
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStatus() {
        return this.status;
    }

    public List<PlaceDetails> getPlace() {
        return this.place;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPlace(List<PlaceDetails> place) {
        this.place = place;
    }
}

