package com.example.QuizArtifact.Model;

import com.example.QuizArtifact.Difficulty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;
import org.springframework.lang.NonNullFields;
import org.springframework.validation.annotation.Validated;

@Data
@Entity
@Validated
public abstract class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionId;
    @NotEmpty
    private String statement;
    @NotNull
    private int marks;
    @NotNull
    private Difficulty difficulty;
    public Question() {

    }
    public Question(String statement, int marks, Difficulty difficulty) {
        this.statement = statement;
        this.marks = marks;
        this.difficulty = difficulty;
    }
}
