package com.wellfitness.fitness.services;

import com.wellfitness.fitness.beans.clientsbeans.ClientListBean;
import com.wellfitness.fitness.beans.clientsbeans.ClientsDetailsBean;
import com.wellfitness.fitness.pojo.clientspojo.ClientList;
import com.wellfitness.fitness.pojo.clientspojo.ClientsDetails;
import com.wellfitness.fitness.repositries.client.ClientListRepository;
import com.wellfitness.fitness.repositries.client.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ClientService {

 @Autowired
 private ClientRepository clientRepository;

 @Autowired
 private ClientListRepository clientListRepository;


    public String addClientList(ClientListBean bean) {

        ClientList pojo = convertBeanToPojo(bean);
        clientListRepository.save(pojo);
        return "Success";

    }


    public List<ClientListBean> getAllClientList() {
        List<ClientList> records = clientListRepository.findAll();
        List<ClientListBean> response = new ArrayList<>();
        for (ClientList record : records) {
            ClientListBean tempData = convertPojoToBean(record);
            response.add(tempData);
        }
        return response;
    }

    public void deleteClientList(Long clientId) {
        clientListRepository.deleteById(clientId);
    }


    public void markClientAsDeleted(Long clientId) {
        Optional<ClientList> record = clientListRepository.findById(clientId);
        ClientList tempRecord = new ClientList();
        tempRecord.setName(record.get().getName());
        tempRecord.setPlanName(record.get().getPlanName());
        tempRecord.setEndDate(record.get().getEndDate());
        tempRecord.setStatus(record.get().getStatus());
        tempRecord.setDeleted(Boolean.TRUE);

        clientListRepository.save(tempRecord);
    }

    public void update(Long clientId, ClientList pojo) {
        ClientList updatepojo = clientListRepository.findById(clientId).get();
        updatepojo.setName(pojo.getName());
        updatepojo.setPlanName(pojo.getPlanName());
        updatepojo.setEndDate(pojo.getEndDate());
        updatepojo.setStatus(pojo.getStatus());

        clientListRepository.save(updatepojo);

        }
    private ClientListBean convertPojoToBean(ClientList record) {
        ClientListBean response = new ClientListBean();
        response.setName(record.getName());
        response.setPlanName(record.getPlanName());
        response.setEndDate(record.getEndDate());
        response.setStatus(record.getStatus());
        return response;
    }

    private ClientList convertBeanToPojo(ClientListBean bean) {
        ClientList pojo = new ClientList();
        pojo.setName(bean.getName());
        pojo.setPlanName(bean.getPlanName());
        pojo.setEndDate(bean.getEndDate());
        pojo.setStatus(bean.getStatus());
        return pojo;
    }

    public String addClientRecord(ClientsDetailsBean bean) {

        ClientsDetails pojo = convertBeanToPojo(bean);
        clientRepository.save(pojo);
        return "Success";

    }


    private ClientsDetails convertBeanToPojo(ClientsDetailsBean bean) {
        ClientsDetails pojo = new ClientsDetails();
        pojo.setName(bean.getName());
        pojo.setPhoneNo(bean.getPhoneNo());
        pojo.setDob(bean.getDob());
        pojo.setEmailId(bean.getEmailId());
        pojo.setRefBy(bean.getRefBy());
        pojo.setAge(bean.getAge());
        pojo.setAddress(bean.getAddress());
        pojo.setMarriageAnniversary(bean.getMarriageAnniversary());
        pojo.setMedicalHistory(bean.getMedicalHistory());
        pojo.setBloodGroup(bean.getBloodGroup());
        pojo.setTargetWeight(bean.getTargetWeight());
        pojo.setRemarks(bean.getRemarks());

        return pojo;
    }
}
