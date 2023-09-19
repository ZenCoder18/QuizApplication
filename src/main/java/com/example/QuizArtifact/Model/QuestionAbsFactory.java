package com.example.QuizArtifact.Model;

import com.example.QuizArtifact.Difficulty;

public interface QuestionAbsFactory {
    public Question getQuestion(int questionId, String statement, int marks, Difficulty difficulty);
}
