package com.example.IceBreaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class QuestionController {

    @Autowired
    private final QuestionService questionService ;


    public QuestionController(QuestionService questionService) {
        this.questionService = questionService ;
    }

    @GetMapping("/{id}")
    public Question findQuestionById(@PathVariable long id){

        return questionService.findById(id);

    }

    @GetMapping("/questions")
    public List<Question> findQuestionById(){

           return  questionService.allQuestions() ;


    }
}
