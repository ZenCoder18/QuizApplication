package com.example.QuizArtifact.Model;

import com.example.QuizArtifact.Difficulty;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

import java.io.DataInput;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public abstract class MultipleChoiceQuestion extends Question{
    @ElementCollection
    @NotNull
    private List<String> options= new ArrayList<>();
    public MultipleChoiceQuestion() {
        super();

    }
    public MultipleChoiceQuestion(@NonNull String statement, @NonNull int marks, @NonNull Difficulty difficulty, ArrayList<String> options) {
        super(statement, marks, difficulty);
        this.options = options;
    }
}
