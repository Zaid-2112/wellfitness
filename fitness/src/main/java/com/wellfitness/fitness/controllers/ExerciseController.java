package com.wellfitness.fitness.controllers;

import com.wellfitness.fitness.beans.BeanDataTable;
import com.wellfitness.fitness.beans.excerciesbeans.ExercisesBean;
import com.wellfitness.fitness.beans.excerciesbeans.ExercisesCategoryBean;
import com.wellfitness.fitness.exceptions.CodeException;
import com.wellfitness.fitness.pojo.ResponsePacket;
import com.wellfitness.fitness.pojo.exercisespojo.ExercisesCategory;
import com.wellfitness.fitness.services.ExerciseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/exercise")
@Api(description = "This api is used for exercise ")
public class ExerciseController {

    @Autowired
    ExerciseService exerciseService;

    /*@ApiOperation(value = "This api is used for post record to mysql database",
            notes = "Status: Completed \nRequired Fields: * \nOptional Fields: *\nComment: **")
    @PostMapping("/addexercise")
    public String addExercise(@RequestBody ExercisesBean bean) {

        return exerciseService.addExerciseRecord(bean);
    }*/

    @ApiOperation(value = "This api is used for post record to mysql database",
            notes = "Status: Completed \n Required Fields: page, search, size \n Optional Fields:  \n Comment: Pass search as 2021 to fetch holidays of year 2021")
    @PostMapping("/addexercise")
    public ResponseEntity<ResponsePacket> getAllRecords(HttpServletRequest request, @RequestBody  ExercisesBean bean) {
        ResponsePacket responsePacket;
        try {
            responsePacket = new ResponsePacket<>(0, "Record add Successfully ", exerciseService.addExerciseRecord(bean));
        } catch (CodeException e) {
            responsePacket = new ResponsePacket<>(14, e.getMessage(), null);
        }
        return new ResponseEntity<>(responsePacket, HttpStatus.OK);

    }

    /*@ApiOperation(value = "This api is used for post record to mysql database",
            notes = "Status: Completed \nRequired Fields: * \nOptional Fields: *\nComment: **")
    @PostMapping("/addexercisecategory")
    public String addEcategory(@RequestBody ExercisesCategoryBean bean) {

        return exerciseService.addExerciseCategory(bean);

    }*/
}