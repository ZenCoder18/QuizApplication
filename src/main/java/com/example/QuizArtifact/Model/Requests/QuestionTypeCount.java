package com.example.QuizArtifact.Model.Requests;

import com.example.QuizArtifact.Model.QuestionModel.QuestionType;
import lombok.Data;

@Data
public class QuestionTypeCount {
    private Integer count;
    private QuestionType questionType;
}
