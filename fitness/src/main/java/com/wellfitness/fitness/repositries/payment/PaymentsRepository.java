package com.wellfitness.fitness.repositries.payment;

import com.wellfitness.fitness.pojo.paymentspojo.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentsRepository extends JpaRepository<Payments, Long> {

}