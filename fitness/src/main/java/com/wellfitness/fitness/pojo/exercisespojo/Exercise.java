package com.wellfitness.fitness.pojo.exercisespojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="exercise")
public class Exercise {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "exercise_category")
    private String exerciseCategory;

    @Column(name = "exercise")
    private String exercise;

    @Column(name = "status")
    private String status;

    private Long number;
}
