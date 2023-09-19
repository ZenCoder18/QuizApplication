package com.example.QuizArtifact.Model;

import com.example.QuizArtifact.Difficulty;

import java.util.ArrayList;

public interface SingleTypeChoiceAbstract extends MultipleChoiceQuestionAbs {
    public Question getSingleAnswerMcq(int questionId, String statement, int marks, Difficulty difficulty, ArrayList<String> options, String answer);
}
