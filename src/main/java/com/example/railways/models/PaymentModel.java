/**
 * Author: Chandan Kumar
 */
package com.example.railways.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class PaymentModel {

    @Id
    @Column(name = "payment_id", nullable = false)
    public String payment_id;

    @Column(name = "amount", nullable = false)
    public int amount;

    @Column(name = "u_id", nullable = false)
    public String u_id;

    @Column(name = "success", nullable = false)
    public int success;

    @Column(name = "payment_method", nullable = false)
    public String payment_method;

    @Column(name = "ticket_id", nullable = false)
    public String ticket_id;
}