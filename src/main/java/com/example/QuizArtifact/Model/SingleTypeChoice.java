package com.example.QuizArtifact.Model;

import com.example.QuizArtifact.Difficulty;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
@Data
@Entity
public class SingleTypeChoice extends MultipleChoiceQuestion {

    private String answer;
    public SingleTypeChoice() {
        super();

    }
    public SingleTypeChoice(@NonNull String statement, @NonNull int marks, @NonNull Difficulty difficulty, ArrayList<String> options, String answer) {
        super(statement, marks, difficulty, options);
        this.answer = answer;
    }
}
