package com.example.QuizArtifact.Controller;

import com.example.QuizArtifact.Model.Question;
import com.example.QuizArtifact.Model.Quiz.Quiz;
import com.example.QuizArtifact.Repository.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("quiz")
public class QuizController {
    @Autowired
    private QuizRepo quizRepo;
    @GetMapping("get/{id}")
    public Quiz getQuiz(@RequestParam Integer id) throws Exception {
        Optional<Quiz> quiz = quizRepo.findById(id);
        return quiz.orElseThrow(() -> new Exception("Not found!"));
    }
    @PostMapping("update")
    public void updateQuiz(@RequestBody List<Question> questions, @RequestParam Integer quizId) throws Exception {
        Quiz quiz = quizRepo.findById(quizId).orElseThrow(()-> new Exception("Invalid Id!"));
        quiz.setQuestions(questions);
    }
}
