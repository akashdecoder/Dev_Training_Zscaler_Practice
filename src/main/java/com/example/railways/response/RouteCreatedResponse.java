package com.example.railways.response;

import com.example.railways.models.RouteDetails;

import java.util.Date;


public class RouteCreatedResponse {
    private Date timestamp;

    private String message;

    private String status;

    private RouteDetails route;

    public RouteCreatedResponse() {
        super();
        // TODO Auto-generated constructor stub
    }

    public RouteCreatedResponse(Date timestamp, String message, String status, RouteDetails route) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.status = status;
        this.route = route;
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

    public RouteDetails getRoute() {
        return route;
    }

    public void setRoute(RouteDetails route) {
        this.route = route;
    }


}
