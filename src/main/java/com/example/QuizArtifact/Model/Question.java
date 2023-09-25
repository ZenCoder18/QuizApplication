package com.example.QuizArtifact.Model;

import com.example.QuizArtifact.Difficulty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;
import org.springframework.lang.NonNullFields;

@Data
@Entity
public abstract class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionId;
    @NonNull
    private String statement;
    @NonNull
    private int marks;
    @NonNull
    private Difficulty difficulty;
    public Question() {

    }
    public Question(String statement, int marks, Difficulty difficulty) {
        this.statement = statement;
        this.marks = marks;
        this.difficulty = difficulty;
    }
}
