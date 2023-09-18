package com.example.QuizArtifact.Model;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class MultipleChoiceQuestion extends Question{
    private List<String> options= new ArrayList<>();
    public MultipleChoiceQuestion(@NonNull String statement, @NonNull int marks,ArrayList<String> options) {
        super(statement, marks);
        this.options = options;
    }
}
