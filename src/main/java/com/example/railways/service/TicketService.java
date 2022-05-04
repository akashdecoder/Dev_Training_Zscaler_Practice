package com.example.railways.service;

import com.example.railways.models.TicketDetails;


import java.util.ArrayList;

public interface TicketService {

    void bookTicket(TicketDetails ticketDetails);

    ArrayList<TicketDetails> fetchTicket(int uId);

    void deleteTicket(int uId, int tbId);


}
