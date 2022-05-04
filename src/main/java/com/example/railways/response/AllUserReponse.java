package com.example.railways.response;

import java.util.List;

import com.example.railways.models.UserDetails;

public class AllUserReponse {
    
    private String message;

    private int status;

    private List<UserDetails> users;

    public AllUserReponse(String message, int status, List<UserDetails> users) {
        this.message = message;
        this.status = status;
        this.users = users;
    }

    public AllUserReponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<UserDetails> getUsers() {
        return users;
    }

    public void setUsers(List<UserDetails> users) {
        this.users = users;
    }

    
    
}
