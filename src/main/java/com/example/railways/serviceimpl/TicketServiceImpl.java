package com.example.railways.serviceimpl;

import com.example.railways.models.TicketDetails;
import com.example.railways.repository.TicketRepository;
import com.example.railways.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    TicketRepository ticketRepository;

    @Override
    public void bookTicket(TicketDetails ticketDetails) {
        ticketRepository.save(ticketDetails);
    }

    @Override
    public ArrayList<TicketDetails> fetchTicket(int uId) {

        return ticketRepository.fetchTicketByuId(uId);
    }

    @Override
    public void deleteTicket(int uId, int tbId) {
        ticketRepository.deleteTicket(uId, tbId);

    }

}
