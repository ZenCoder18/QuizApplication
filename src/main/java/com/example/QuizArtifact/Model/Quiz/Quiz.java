package com.example.QuizArtifact.Model.Quiz;

import com.example.QuizArtifact.Model.Question;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer quizId;
    @ElementCollection
    @CollectionTable(name = "quiz_questions")
    private List<Question> questions;
    private Integer maximumMarks;
    public Quiz(List<Question> questions, Integer maximumMarks) {
        this.questions = questions;
        this.maximumMarks = maximumMarks;
    }
}
