package com.wellfitness.fitness.beans.paymentsbeans;

import lombok.Data;

import java.util.Date;

@Data
public class NewPaymentsBean {

    public String name;
    public Long phoneNo;
    public String Address;
    public String itemName;
    public Date paymentDate;
    public Long amountReceived;
    public String description;
    public String paymentType;
}
