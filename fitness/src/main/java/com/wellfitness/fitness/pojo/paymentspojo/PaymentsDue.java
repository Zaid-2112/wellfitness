package com.wellfitness.fitness.pojo.paymentspojo;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="duepayments")
public class PaymentsDue {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client")
    private String client;

    @Column(name = "due")
    private Long due;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "remarks")
    private String remarks;
}
