package com.example.railways.models;


import javax.persistence.*;


@Entity
@Table(name = "tickets")
public class TicketDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tbId;

    private int uId;

    private int trainNumber;

    private String tbSource;

    private String tbDestination;

    private int tbStatus;

    public TicketDetails(int tbId, int uId, int trainNumber, String tbSource, String tbDestination, int tbStatus) {
        this.tbId = tbId;
        this.uId = uId;
        this.trainNumber = trainNumber;
        this.tbSource = tbSource;
        this.tbDestination = tbDestination;
        this.tbStatus = tbStatus;
    }

    public TicketDetails() {
    }


    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getTbId() {
        return tbId;
    }

    public void setTbId(int tbId) {
        this.tbId = tbId;
    }

    public int getTbStatus() {
        return tbStatus;
    }

    public void setTbStatus(int tbStatus) {
        this.tbStatus = tbStatus;
    }

    public String getTbDestination() {
        return tbDestination;
    }

    public void setTbDestination(String tbDestination) {
        this.tbDestination = tbDestination;
    }

    public String getTbSource() {
        return tbSource;
    }

    public void setTbSource(String tbSource) {
        this.tbSource = tbSource;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
}