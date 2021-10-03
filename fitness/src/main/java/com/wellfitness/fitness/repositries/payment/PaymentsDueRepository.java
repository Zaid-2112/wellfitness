package com.wellfitness.fitness.repositries.payment;

import com.wellfitness.fitness.pojo.paymentspojo.PaymentsDue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentsDueRepository extends JpaRepository<PaymentsDue, Long> {
}
