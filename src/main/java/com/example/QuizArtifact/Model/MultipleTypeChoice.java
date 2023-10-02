
package com.example.QuizArtifact.Model;
import com.example.QuizArtifact.Difficulty;
import jakarta.annotation.Nonnull;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jdk.jfr.Enabled;
import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@Entity
public class MultipleTypeChoice extends MultipleChoiceQuestion {
    @NotEmpty
    private List<String> answers = new ArrayList<>();
    public MultipleTypeChoice() {

    }
    public MultipleTypeChoice(@NotEmpty String statement, @NotNull int marks, @NotNull Difficulty difficulty, ArrayList<String> options, ArrayList<String> answers) throws Exception {
        super(statement, marks,difficulty, options);
        if(Objects.isNull(answers)) {
            throw new Exception("Answer cannot be null!");
        }
        for(String str : answers) {
            if(str == null || str.isEmpty()) throw new Exception("Answer cannot be null or empty");
        }
        this.answers = answers;
    }
}

