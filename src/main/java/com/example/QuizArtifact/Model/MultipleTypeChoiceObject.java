package com.example.QuizArtifact.Model;

import com.example.QuizArtifact.Difficulty;

import java.util.ArrayList;

public class MultipleTypeChoiceObject implements MultipleTypeChoiceAbstract{

    @Override
    public Question getMultipleAnswerMcq(int questionId, String statement, int marks,Difficulty difficulty, ArrayList<String> options, ArrayList<String> answers) throws Exception {
        return new MultipleTypeChoice(statement, marks, difficulty, options, answers);
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
