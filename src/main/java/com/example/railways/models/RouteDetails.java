package com.example.railways.models;

import lombok.ToString;

import javax.persistence.*;
import java.time.LocalTime;


@Entity
@ToString()
@Table(name = "route")
public class RouteDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rId;

    @ManyToOne
    @JoinColumn(name = "from_id")
    private PlaceDetails fromId;
    @ManyToOne
    @JoinColumn(name = "to_id")
    private PlaceDetails toId;

    private String trainName;

    private LocalTime time;

    public RouteDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

    public RouteDetails(int rId, PlaceDetails fromId, PlaceDetails toId, String trainName, LocalTime time) {
        super();
        this.rId = rId;
        this.fromId = fromId;
        this.toId = toId;
        this.trainName = trainName;
        this.time = time;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public PlaceDetails getFromId() {
        return fromId;
    }

    public void setFromId(PlaceDetails fromId) {
        this.fromId = fromId;
    }

    public PlaceDetails getToId() {
        return toId;
    }

    public void setToId(PlaceDetails toId) {
        this.toId = toId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }


}
