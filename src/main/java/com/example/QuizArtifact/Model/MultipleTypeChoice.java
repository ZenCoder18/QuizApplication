
package com.example.QuizArtifact.Model;
import com.example.QuizArtifact.Difficulty;
import jakarta.persistence.Entity;
import jdk.jfr.Enabled;
import lombok.Data;
import lombok.NonNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class MultipleTypeChoice extends MultipleChoiceQuestion {

    private List<String> answers = new ArrayList<>();
    public MultipleTypeChoice(@NonNull String statement, @NonNull int marks, @NonNull Difficulty difficulty, ArrayList<String> options, ArrayList<String> answers) {
        super(statement, marks,difficulty, options);
        this.answers = answers;
    }
}

