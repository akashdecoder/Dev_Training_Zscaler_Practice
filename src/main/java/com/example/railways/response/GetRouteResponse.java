package com.example.railways.response;

import com.example.railways.models.RouteDetails;

import java.util.Date;
import java.util.List;

public class GetRouteResponse {
    private Date timestamp;

    private String message;

    private String status;

    private List<RouteDetails> route;

    public GetRouteResponse(Date timestamp, String message, String status, List<RouteDetails> route) {
        this.timestamp = timestamp;
        this.message = message;
        this.status = status;
        this.route = route;
    }

    public GetRouteResponse() {
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

    public List<RouteDetails> getRoute() {
        return this.route;
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

    public void setRoute(List<RouteDetails> route) {
        this.route = route;
    }
}

