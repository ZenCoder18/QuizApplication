package com.example.QuizArtifact.Model.Requests;

import com.example.QuizArtifact.Model.QuestionModel.QuestionType;
import lombok.Data;

import java.util.List;
@Data
public class CreateQuiz {
    private List<QuestionTypeCount> questionTypeCountList;
}
