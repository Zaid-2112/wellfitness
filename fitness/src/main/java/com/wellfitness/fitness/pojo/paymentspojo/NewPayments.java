package com.wellfitness.fitness.pojo.paymentspojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="newPayments")
public class NewPayments {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_no")
    private Long phoneNo;

    @Column(name = "address")
    private String address;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "amount_received")
    private Long amountReceived;

    @Column(name = "description")
    private String description;

    @Column(name = "paymentType")
    private String paymentType;
}
