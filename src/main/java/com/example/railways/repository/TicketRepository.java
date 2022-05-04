package com.example.railways.repository;

import com.example.railways.models.TicketDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import javax.transaction.Transactional;

@Repository
public interface TicketRepository extends JpaRepository<TicketDetails, Long> {
    @Query(value = "SELECT * FROM tickets t WHERE t.u_id=?1", nativeQuery = true)
    ArrayList<TicketDetails> fetchTicketByuId(int uId);

    @Transactional
    @Modifying
    @Query(value = "delete FROM tickets t WHERE t.u_id=?1 and t.tb_id=?2", nativeQuery = true)
    void deleteTicket(int uId, int tbId);
}
