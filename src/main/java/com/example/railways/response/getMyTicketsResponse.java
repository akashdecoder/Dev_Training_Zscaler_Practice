package com.example.railways.response;


import com.example.railways.models.TicketDetails;

import java.util.Date;
import java.util.List;

public class getMyTicketsResponse {
    Date date;
    String get_my_tickets_successful;
    String status;
    List<TicketDetails> myTickets;

    public getMyTicketsResponse(Date date, String get_my_tickets_successful, String status, List<TicketDetails> myTickets) {
        this.date = date;
        this.get_my_tickets_successful = get_my_tickets_successful;
        this.status = status;
        this.myTickets = myTickets;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGet_my_tickets_successful() {
        return get_my_tickets_successful;
    }

    public void setGet_my_tickets_successful(String get_my_tickets_successful) {
        this.get_my_tickets_successful = get_my_tickets_successful;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<TicketDetails> getMyTickets() {
        return myTickets;
    }

    public void setMyTickets(List<TicketDetails> myTickets) {
        this.myTickets = myTickets;
    }
}
