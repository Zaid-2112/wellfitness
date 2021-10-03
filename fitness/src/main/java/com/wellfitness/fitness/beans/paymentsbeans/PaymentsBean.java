package com.wellfitness.fitness.beans.paymentsbeans;

import lombok.Data;

import java.util.Date;

@Data
public class PaymentsBean {

    public String name;
    public Date paymentDate;
    public Long amount;
    public String paymentFrom;
    public String remark;
}
