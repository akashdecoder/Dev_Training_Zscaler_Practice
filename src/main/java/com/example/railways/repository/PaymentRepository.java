/**
 * Author: Chandan Kumar
 */
package com.example.railways.repository;

import com.example.railways.models.PaymentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentRepository extends JpaRepository<PaymentModel, Long> {
    @Query(value = "SELECT record FROM payments WHERE record.ticket_id=?1 AND record.u_id=?2", nativeQuery = true)
    List<PaymentModel> getPaymentList(String ticket_id, String u_id);
}