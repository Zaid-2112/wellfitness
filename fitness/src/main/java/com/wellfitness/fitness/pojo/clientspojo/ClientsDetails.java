package com.wellfitness.fitness.pojo.clientspojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "clientsdetail")
public class ClientsDetails {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_no")
    private Long phoneNo;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "email")
    private String emailId;

    @Column(name = "refby")
    private String refBy;

    @Column(name = "age")
    private Long age;

    @Column(name = "address")
    private String address;

    @Column(name = "manniversary")
    private Date marriageAnniversary;

    @Column(name = "medicalhistory")
    private String medicalHistory;

    @Column(name = "bloodgroup")
    private String bloodGroup;

    @Column(name = "targetweight")
    private Long targetWeight;

    @Column(name = "remarks")
    private String remarks;

}
