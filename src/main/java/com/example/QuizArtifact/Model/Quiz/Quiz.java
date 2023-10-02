package com.example.QuizArtifact.Model.Quiz;

import com.example.QuizArtifact.Model.MultipleTypeChoice;
import com.example.QuizArtifact.Model.SingleTypeChoice;
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
    @CollectionTable(name = "quiz_single_questions")
    private List<SingleTypeChoice> singleTypeChoicesQuestions;
    @ElementCollection
    @CollectionTable(name = "quiz_multiple_questions")
    private List<MultipleTypeChoice> multipleTypeChoicesQuestions;
    private Integer maximumMarks;
    public Quiz() {}
    public Quiz(List<SingleTypeChoice> singleTypeChoicesQuestions, List<MultipleTypeChoice> multipleTypeChoicesQuestions, Integer maximumMarks) {
        this.multipleTypeChoicesQuestions = multipleTypeChoicesQuestions;
        this.singleTypeChoicesQuestions = singleTypeChoicesQuestions;
        this.maximumMarks = maximumMarks;
    }
}
