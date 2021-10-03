package com.wellfitness.fitness.controllers;


import com.wellfitness.fitness.beans.paymentsbeans.NewPaymentsBean;
import com.wellfitness.fitness.beans.paymentsbeans.PaymentsBean;
import com.wellfitness.fitness.beans.paymentsbeans.PaymentsDueBean;
import com.wellfitness.fitness.pojo.paymentspojo.PaymentsDue;
import com.wellfitness.fitness.services.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payment")
@Api(description = "This api is used for payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @ApiOperation(value = "This api is used for post record to mysql database",
            notes = "Status: Completed \nRequired Fields: * \nOptional Fields: *\nComment: **")
    @PostMapping("/addnewpayment")
    public String addNewPayment(@RequestBody NewPaymentsBean bean) {

        return paymentService.addNewPayment(bean);
    }


    @ApiOperation(value = "This api is used for post record to mysql database",
            notes = "Status: Completed \nRequired Fields: * \nOptional Fields: *\nComment: **")
    @PostMapping("/addpayment")
    public String addPayments(@RequestBody PaymentsBean bean) {

        return paymentService.addPaymentsRecord(bean);
    }

    @ApiOperation(value = "This api is used for post record to mysql database",
            notes = "Status: Completed \nRequired Fields: * \nOptional Fields: *\nComment: **")
    @PostMapping("/addduepayment")
    public String addDuePayments(@RequestBody PaymentsDueBean bean) {

        return paymentService.addPaymentsDue(bean);
    }
}
