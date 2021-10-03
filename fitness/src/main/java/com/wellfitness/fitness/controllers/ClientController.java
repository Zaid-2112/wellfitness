package com.wellfitness.fitness.controllers;

import com.wellfitness.fitness.beans.clientsbeans.ClientListBean;
import com.wellfitness.fitness.beans.clientsbeans.ClientsDetailsBean;
import com.wellfitness.fitness.pojo.clientspojo.ClientList;
import com.wellfitness.fitness.services.ClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/client")
@Api(description = "This api is used for Client ")
public class ClientController {

    @Autowired
    ClientService clientService;

    //api for client_list
    @ApiOperation(value = "This api is used for post record to mysql database",
            notes = "Status: Completed \nRequired Fields: * \nOptional Fields: *\nComment: **")
    @PostMapping("/addClientList")
    public String addClientList(@RequestBody ClientListBean bean) {

        return clientService.addClientList(bean);
    }

    @ApiOperation(value = "This api is used for get all Clients records ",
            notes = "Status: Completed \nRequired Fields: * \nOptional Fields: *\nComment: **")
    @GetMapping("/getAllClientRecords")
    public List<ClientListBean> getClientListRecord() {
        List<ClientListBean> record = clientService.getAllClientList();
        return record;
    }

    @ApiOperation(value = "This api is used to delete a record from database!",
            notes = "Status: Completed \nRequired Fields: * \nOptional Fields: *\nComment: **")
    @DeleteMapping("/client/{clientId}")
    public void deleteClient(@PathVariable("clientId") Long clientId) {

        clientService.deleteClientList(clientId);
    }

    @ApiOperation(value = "This api is used to mark record as deleted!",
            notes = "Status: Completed \nRequired Fields: * \nOptional Fields: *\nComment: **")
    @DeleteMapping("/client/{clientId}/markForDeletion")
    public void markClientAsDeleted(@PathVariable("clientId") Long clientId) {
        clientService.markClientAsDeleted(clientId);

    }

    @ApiOperation(value = "This api is used for update existing  record ",
            notes = "Status: Completed \nRequired Fields: * \nOptional Fields: *\nComment: **")
    @PutMapping("/updateclient/{clientId}")
    public void updatestudent(@PathVariable("clientId") Long clientId, @RequestBody ClientList pojo) {
        clientService.update(clientId, pojo);

    }






    // api for client
    @ApiOperation(value = "This api is used for post record to mysql database",
            notes = "Status: Completed \nRequired Fields: * \nOptional Fields: *\nComment: **")
    @PostMapping("/addClientRecord")
    public String addClientRecord(@RequestBody ClientsDetailsBean bean) {

        return clientService.addClientRecord(bean);
    }

}
