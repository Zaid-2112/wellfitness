package com.wellfitness.fitness.pojo.exercisespojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "exercisescategory")
public class ExercisesCategory {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "exercise_category")
    public String exerciseCategory;

    @Column(name = "status")
    public String status;
}
