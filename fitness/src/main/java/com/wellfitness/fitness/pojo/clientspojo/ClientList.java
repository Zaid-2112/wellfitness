package com.wellfitness.fitness.pojo.clientspojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="ClientList")
public class ClientList {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "deleted")
    private Boolean deleted = Boolean.FALSE;

    @Column(name="name")
    private String name;

    @Column(name="plan_name")
    private String planName;

    @Column(name="endDate")
    private Date endDate;

    @Column(name="status")
    private String status;
}
