package com.example.railways.response;

public class TrainResponse {

    private String message;


    public TrainResponse(String m) {
        message = m;
    }

    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }

}
