package com.example.QuizArtifact.Controller;

import com.example.QuizArtifact.Model.Question;
import com.example.QuizArtifact.Model.Quiz.Quiz;
import com.example.QuizArtifact.Model.Requests.CreateQuiz;
import com.example.QuizArtifact.Model.Service.QuizService;
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
    @Autowired
    private QuizService quizService;
    @GetMapping("get")
    public Quiz getQuiz(@RequestParam Integer id) throws Exception {
        Optional<Quiz> quiz = quizRepo.findById(id);
        return quiz.orElseThrow(() -> new Exception("Not found!"));
    }
    @GetMapping("getAll")
    public List<Quiz> getAllQuiz() {
        List<Quiz> quiz = quizRepo.findAll();
        return quiz;
    }
//    @PostMapping("update")
//    public void updateQuiz(@RequestBody List<Question> questions, @RequestParam Integer quizId) throws Exception {
//        Quiz quiz = quizRepo.findById(quizId).orElseThrow(()-> new Exception("Invalid Id!"));
//        quiz.setQuestions(questions);
//    }
    @PostMapping("add")
    public void addQuiz(@RequestBody CreateQuiz createQuiz) throws Exception {
        quizService.createQuiz(createQuiz);
    }
}
