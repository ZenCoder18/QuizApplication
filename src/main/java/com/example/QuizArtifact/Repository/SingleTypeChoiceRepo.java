package com.example.QuizArtifact.Repository;

import com.example.QuizArtifact.Model.SingleTypeChoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingleTypeChoiceRepo extends JpaRepository<SingleTypeChoice, Integer> {
}
