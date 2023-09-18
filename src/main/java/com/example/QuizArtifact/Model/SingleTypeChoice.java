package com.example.QuizArtifact.Model;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
@Data
public class SingleTypeChoice extends MultipleChoiceQuestion {

    private String answer;
    public SingleTypeChoice(@NonNull String statement, @NonNull int marks, ArrayList<String> options, String answers) {
        super(statement, marks, options);
        this.answer = answers;
    }
}
