
package com.example.QuizArtifact.Model;
import lombok.Data;
import lombok.NonNull;
import java.util.ArrayList;
import java.util.List;

@Data
public class MultipleTypeChoice extends MultipleChoiceQuestion {

    private List<String> answers = new ArrayList<>();
    public MultipleTypeChoice(@NonNull String statement, @NonNull int marks, ArrayList<String> options, ArrayList<String> answers) {
        super(statement, marks, options);
        this.answers = answers;
    }
}

