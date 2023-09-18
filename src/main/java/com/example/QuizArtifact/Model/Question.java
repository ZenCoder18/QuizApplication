package com.example.QuizArtifact.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;
import org.springframework.lang.NonNullFields;

@Entity
@Data
public abstract class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionId;
    @NonNull
    private String statement;
    @NonNull
    private int marks;
}
