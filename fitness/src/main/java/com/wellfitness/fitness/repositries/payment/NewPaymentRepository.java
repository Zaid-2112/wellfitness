package com.wellfitness.fitness.repositries.payment;

import com.wellfitness.fitness.pojo.paymentspojo.NewPayments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewPaymentRepository extends JpaRepository<NewPayments, Long> {

}