package com.wellfitness.fitness.beans.clientsbeans;

import lombok.Data;

import java.util.Date;

@Data
public class ClientListBean {

    public String name;
    public String planName;
    public Date endDate;
    public String status;
}
