package com.wellfitness.fitness.repositries.Exercise;

import com.wellfitness.fitness.pojo.exercisespojo.ExercisesCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercisesCategoryRepository extends JpaRepository<ExercisesCategory, Long> {
}
