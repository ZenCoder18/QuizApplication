package com.example.QuizArtifact.Model.Service;

import com.example.QuizArtifact.Model.MultipleTypeChoice;
import com.example.QuizArtifact.Model.Question;
import com.example.QuizArtifact.Model.QuestionModel.QuestionType;
import com.example.QuizArtifact.Model.Quiz.Quiz;
import com.example.QuizArtifact.Model.Requests.CreateQuiz;
import com.example.QuizArtifact.Model.Requests.QuestionTypeCount;
import com.example.QuizArtifact.Model.SingleTypeChoice;
import com.example.QuizArtifact.Repository.MultipleTypeChoiceRepo;
import com.example.QuizArtifact.Repository.QuizRepo;
import com.example.QuizArtifact.Repository.SingleTypeChoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepo quizRepo;
    @Autowired
    private MultipleTypeChoiceRepo multipleTypeChoiceRepo;
    @Autowired
    private SingleTypeChoiceRepo singleTypeChoiceRepo;
    public boolean createQuiz(CreateQuiz quizRequest) throws Exception {
        List<SingleTypeChoice> singleQuestions = new ArrayList<>();
        List<MultipleTypeChoice> multipleQuestions = new ArrayList<>();
        for(QuestionTypeCount questionType: quizRequest.getQuestionTypeCountList()) {
            QuestionType quesType = questionType.getQuestionType();
            if(quesType.equals(QuestionType.MULTIPLE_ANSWER_TYPE)) {
                multipleQuestions.addAll(multipleTypeChoiceRepo.findByLimit(questionType.getCount()));
            } else if (quesType.equals(QuestionType.SINGLE_ANSWER_TYPE)) {
                singleQuestions.addAll( singleTypeChoiceRepo.findByLimit(questionType.getCount()));
            }
        }
        int marks = 0;
        for(Question q : singleQuestions) marks+=q.getMarks();
        for(Question q : multipleQuestions) marks+=q.getMarks();
        Quiz quiz = new Quiz(singleQuestions, multipleQuestions,marks);
        try {
            quizRepo.save(quiz);
            return true;
        } catch (Exception e) {
            throw new Exception(e.toString());
        }
    }
}
