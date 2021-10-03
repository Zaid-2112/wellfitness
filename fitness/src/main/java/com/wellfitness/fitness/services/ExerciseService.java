package com.wellfitness.fitness.services;

import com.wellfitness.fitness.beans.excerciesbeans.ExercisesBean;
import com.wellfitness.fitness.beans.excerciesbeans.ExercisesCategoryBean;
import com.wellfitness.fitness.exceptions.CodeException;
import com.wellfitness.fitness.exceptions.ErrorCodes;
import com.wellfitness.fitness.pojo.exercisespojo.Exercise;
import com.wellfitness.fitness.pojo.exercisespojo.ExercisesCategory;
import com.wellfitness.fitness.repositries.Exercise.ExerciseRepository;
import com.wellfitness.fitness.repositries.Exercise.ExercisesCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {

    @Autowired
    ExerciseRepository exerciseRepository;

    @Autowired
    ExercisesCategoryRepository exercisesCategoryRepository;

    public String addExerciseRecord(ExercisesBean bean) throws CodeException {

        try{
        Exercise pojo = convertBeanToPojo(bean);
        exerciseRepository.save(pojo);
        }  catch (Exception e) {
            throw new CodeException(e.getMessage(), ErrorCodes.InsufficientData);
        }

        return "Success";
    }

    private Exercise convertBeanToPojo(ExercisesBean bean) {
        Exercise pojo = new Exercise();
        pojo.setExerciseCategory(bean.getExerciseCategory());
        pojo.setExercise(bean.getExercise());
        pojo.setStatus(bean.getStatus());
        return pojo;
    }

    public String addExerciseCategory(ExercisesCategoryBean bean) {

        ExercisesCategory pojo = convertBeanToPojo(bean);
        exercisesCategoryRepository.save(pojo);
        return "Success";

    }

    private ExercisesCategory convertBeanToPojo(ExercisesCategoryBean bean) {
        ExercisesCategory pojo = new ExercisesCategory();
        pojo.setExerciseCategory(bean.getExerciseCategory());
        pojo.setStatus(bean.getStatus());
        return pojo;
    }
}
