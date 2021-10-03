package com.wellfitness.fitness.pojo.paymentspojo;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="payments")
public class Payments {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="name")
    private String name;

    @Column(name ="paymentdate")
    private Date paymentDate;

    @Column(name ="amount")
    private Long amount;

    @Column(name ="paymentfrom")
    private String paymentFrom;

    @Column(name ="remark")
    private String remark;
}
