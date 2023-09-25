package com.example.QuizArtifact.Controller;

import com.example.QuizArtifact.Model.MultipleTypeChoice;
import com.example.QuizArtifact.Model.SingleTypeChoice;
import com.example.QuizArtifact.Repository.MultipleTypeChoiceRepo;
import com.example.QuizArtifact.Repository.SingleTypeChoiceRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("questions/multiple-type-choice")
@Validated
public class MultipleTypeChoiceQuestion {
    @Autowired
    private MultipleTypeChoiceRepo multipleTypeChoiceRepo;
    @PostMapping("add")
    public ResponseEntity<String> addMultipleTypeQuestion(@RequestBody @Valid MultipleTypeChoice multipleTypeChoice) {
        multipleTypeChoiceRepo.save(multipleTypeChoice);
         return new ResponseEntity<>("Done!", HttpStatus.OK);
    }
    @GetMapping("get-all")
    public List<MultipleTypeChoice> getAll() {
        List<MultipleTypeChoice> allQuestion = multipleTypeChoiceRepo.findAll();
        return allQuestion;
    }
    @DeleteMapping("delete")
    public ResponseEntity<String> deleteQuestion(@RequestParam Integer id) {
        Optional<MultipleTypeChoice> multipleTypeChoice = multipleTypeChoiceRepo.findById(id);
        multipleTypeChoice.ifPresent(typeChoice -> multipleTypeChoiceRepo.delete(typeChoice));
        return new ResponseEntity<>("Done!", HttpStatus.OK);
    }
}
