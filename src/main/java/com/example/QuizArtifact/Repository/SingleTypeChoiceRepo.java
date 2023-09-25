package com.example.QuizArtifact.Repository;

import com.example.QuizArtifact.Model.Question;
import com.example.QuizArtifact.Model.SingleTypeChoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SingleTypeChoiceRepo extends JpaRepository<SingleTypeChoice, Integer> {
    @Query(value = "Select * from question limit :limit", nativeQuery = true)
    List<SingleTypeChoice> findByLimit(Integer limit);

}
