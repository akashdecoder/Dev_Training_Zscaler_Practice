package com.example.railways.models;


import javax.persistence.*;


@Entity
@Table(name = "users")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uId;


    private String uName;

    private String uEmailId;

    private String uAddress;

    private String uDob;

    private int uAge;

    private String uPassword;

    private String uAadhaar;

    public UserDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

    public UserDetails(int uId, String uName, String uEmailId, String uAddress, String uDob, int uAge, String uPassword,
                       String uAadhaar) {
        super();
        this.uId = uId;
        this.uName = uName;
        this.uEmailId = uEmailId;
        this.uAddress = uAddress;
        this.uDob = uDob;
        this.uAge = uAge;
        this.uPassword = uPassword;
        this.uAadhaar = uAadhaar;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuEmailId() {
        return uEmailId;
    }

    public void setuEmailId(String uEmailId) {
        this.uEmailId = uEmailId;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public String getuDob() {
        return uDob;
    }

    public void setuDob(String uDob) {
        this.uDob = uDob;
    }

    public int getuAge() {
        return uAge;
    }

    public void setuAge(int uAge) {
        this.uAge = uAge;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuAadhaar() {
        return uAadhaar;
    }

    public void setuAadhaar(String uAadhaar) {
        this.uAadhaar = uAadhaar;
    }


}
