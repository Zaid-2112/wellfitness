package com.wellfitness.fitness.beans.paymentsbeans;

import lombok.Data;

import java.util.Date;

@Data
public class PaymentsDueBean {

    public String client;
    public Long due;
    public Date dueDate;
    public String Remarks;
}
