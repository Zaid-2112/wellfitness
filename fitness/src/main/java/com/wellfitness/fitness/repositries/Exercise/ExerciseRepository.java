package com.wellfitness.fitness.repositries.Exercise;

import com.wellfitness.fitness.pojo.exercisespojo.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
