package com.example.railways.models;

import javax.persistence.*;


@Entity
@Table(name = "place")
public class PlaceDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private

    int pId;

    private

    String pName;

    public PlaceDetails() {
        super();
        // TODO Auto-generated constructor stub
    }


    public PlaceDetails(int pId) {
        super();
        this.pId = pId;
    }


    public PlaceDetails(int pId, String pName) {
        super();
        this.pId = pId;
        this.pName = pName;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }


}
