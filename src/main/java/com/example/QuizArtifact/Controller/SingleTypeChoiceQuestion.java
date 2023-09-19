package com.example.QuizArtifact.Controller;

import com.example.QuizArtifact.Model.SingleTypeChoice;
import com.example.QuizArtifact.Model.SingleTypeChoiceAbstract;
import com.example.QuizArtifact.Repository.SingleTypeChoiceRepo;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("questions/single-type-choice")
public class SingleTypeChoiceQuestion {
    @Autowired
    private SingleTypeChoiceRepo singleTypeChoiceRepo;
    @PostMapping("add")
    public ResponseEntity<String> addSingleTypeQuestion(@RequestBody SingleTypeChoice singleTypeChoice) {
         singleTypeChoiceRepo.save(singleTypeChoice);
         return new ResponseEntity<>("Done!", HttpStatus.OK);
    }
    @GetMapping("get-all")
    public List<SingleTypeChoice> getAll() {
        List<SingleTypeChoice> allQuestion = singleTypeChoiceRepo.findAll();
        return allQuestion;
    }
    @DeleteMapping("delete")
    public ResponseEntity<String> deleteQuestion(@RequestParam Integer id) {
        Optional<SingleTypeChoice> singleTypeChoice = singleTypeChoiceRepo.findById(id);
        singleTypeChoice.ifPresent(typeChoice -> singleTypeChoiceRepo.delete(typeChoice));
        return new ResponseEntity<>("Done!", HttpStatus.OK);
    }
}
