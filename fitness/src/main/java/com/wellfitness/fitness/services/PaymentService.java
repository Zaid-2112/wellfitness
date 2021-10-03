package com.wellfitness.fitness.services;
import com.wellfitness.fitness.beans.paymentsbeans.NewPaymentsBean;
import com.wellfitness.fitness.beans.paymentsbeans.PaymentsBean;
import com.wellfitness.fitness.beans.paymentsbeans.PaymentsDueBean;
import com.wellfitness.fitness.pojo.paymentspojo.NewPayments;
import com.wellfitness.fitness.pojo.paymentspojo.Payments;
import com.wellfitness.fitness.pojo.paymentspojo.PaymentsDue;
import com.wellfitness.fitness.repositries.payment.NewPaymentRepository;
import com.wellfitness.fitness.repositries.payment.PaymentsDueRepository;
import com.wellfitness.fitness.repositries.payment.PaymentsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class PaymentService {

    @Autowired
    NewPaymentRepository newPaymentRepository;

    @Autowired
    PaymentsRepository paymentsRepository;

    @Autowired
    PaymentsDueRepository paymentsDueRepository;

    //new payement crud opertaion
    public String addNewPayment(NewPaymentsBean bean) {

        NewPayments pojo = convertBeanToPojo(bean);
        newPaymentRepository.save(pojo);
        return "Success";

    }

    private NewPayments convertBeanToPojo(NewPaymentsBean bean) {
        NewPayments pojo = new NewPayments();
        pojo.setName(bean.getName());
        pojo.setPhoneNo(bean.getPhoneNo());
        pojo.setAddress(bean.getAddress());
        pojo.setItemName(bean.getItemName());
        pojo.setPaymentDate(bean.getPaymentDate());
        pojo.setDescription(bean.getDescription());
        pojo.setPaymentType(bean.getPaymentType());

        return pojo;
    }


    //payments crud opertaion
    public String addPaymentsRecord(PaymentsBean bean) {

        Payments pojo = convertBeanToPojo(bean);
        paymentsRepository.save(pojo);
        return "Success";
    }
    private Payments convertBeanToPojo(PaymentsBean bean) {
        Payments pojo = new Payments();
        pojo.setName(bean.getName());
        pojo.setPaymentDate(bean.getPaymentDate());
        pojo.setAmount(bean.getAmount());
        pojo.setPaymentFrom(bean.getPaymentFrom());
        pojo.setRemark(bean.getRemark());
        return pojo;
    }

    //duepayments crud opertaion
    public String addPaymentsDue(PaymentsDueBean bean) {

        PaymentsDue pojo = convertBeanToPojo(bean);
        paymentsDueRepository.save(pojo);
        return "Success";
    }
    private PaymentsDue convertBeanToPojo(PaymentsDueBean bean) {
        PaymentsDue pojo = new PaymentsDue();
        pojo.setClient(bean.getClient());
        pojo.setDue(bean.getDue());
        pojo.setDueDate(bean.getDueDate());
        pojo.setRemarks(bean.getRemarks());
        return pojo;
    }
}
