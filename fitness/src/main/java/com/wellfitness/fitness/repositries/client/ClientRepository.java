package com.wellfitness.fitness.repositries.client;

import com.wellfitness.fitness.pojo.clientspojo.ClientsDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientsDetails, Long> {

}
