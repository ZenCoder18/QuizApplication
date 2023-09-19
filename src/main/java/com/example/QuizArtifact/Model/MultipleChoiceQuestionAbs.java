package com.example.QuizArtifact.Model;

import com.example.QuizArtifact.Difficulty;

import java.util.ArrayList;

public interface MultipleChoiceQuestionAbs extends QuestionAbsFactory {
    public Question getMcq(int questionId, String statement, int marks, Difficulty difficulty, ArrayList<String> options);
}
