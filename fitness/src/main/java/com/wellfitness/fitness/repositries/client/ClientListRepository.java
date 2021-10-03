package com.wellfitness.fitness.repositries.client;

import com.wellfitness.fitness.pojo.clientspojo.ClientList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientListRepository extends JpaRepository<ClientList, Long> {


    Optional<ClientList> findById(@Param("clientId") Long clientId);


    @Query("SELECT e FROM ClientList e where e.deleted=false")
    List<ClientList> findAll();

}