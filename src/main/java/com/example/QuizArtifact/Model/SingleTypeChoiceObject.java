package com.example.QuizArtifact.Model;

import com.example.QuizArtifact.Difficulty;

import java.util.ArrayList;

public class SingleTypeChoiceObject implements SingleTypeChoiceAbstract {
    @Override
    public Question getSingleAnswerMcq(int questionId, String statement, int marks, Difficulty difficulty, ArrayList<String> options, String answer) {
        return new SingleTypeChoice(statement, marks,difficulty, options, answer);
    }

    @Override
    public Question getMcq(int questionId, String statement, int marks, Difficulty difficulty, ArrayList<String> options) {
        return null;
    }

    @Override
    public Question getQuestion(int questionId, String statement, int marks, Difficulty difficulty) {
        return null;
    }
}
