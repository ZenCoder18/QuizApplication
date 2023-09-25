package com.example.QuizArtifact.Repository;

import com.example.QuizArtifact.Model.MultipleTypeChoice;
import com.example.QuizArtifact.Model.Question;
import com.example.QuizArtifact.Model.SingleTypeChoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MultipleTypeChoiceRepo extends JpaRepository<MultipleTypeChoice, Integer> {
    @Query(value = "Select * from question limit :limit", nativeQuery = true)
    List<MultipleTypeChoice> findByLimit(Integer limit);
}
