package com.example.QuizArtifact.Model;

import com.example.QuizArtifact.Difficulty;

import java.util.ArrayList;

public interface MultipleTypeChoiceAbstract extends MultipleChoiceQuestionAbs {
    public Question getMultipleAnswerMcq(int questionId, String statement, int marks, Difficulty difficulty, ArrayList<String> options, ArrayList<String> answer) throws Exception;
}
