package com.example.IceBreaker;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private final List<Question> questionList ;
    QuestionRepository questionRepository ;


    public QuestionService(QuestionRepository questionRepository){

        this.questionRepository = questionRepository ;



        questionList = new ArrayList<>() ;

       questionList.add(new Question(0, "Where were you born ?", "Kazmabad")) ;
        questionList.add(new Question(1,"What is your favourite food", "Pepper Steak")) ;
        questionList.add(new Question(2, "What is your favourite car ?","Buggati")) ;
        questionList.add(new Question(3,"What is your favourite singer","Ebi")) ;
        questionList.add(new Question(4, "What is your favourite color ?","Blue")) ;
        questionList.add(new Question(5,"What is your favourite moovie", "Gladiator")) ;

        questionRepository.saveAll(questionList) ;
    }




    public Question findById(Long id)
    {
        return questionRepository.findById( id).get()  ;
    }

    public  List<Question> allQuestions(){
        return (List<Question>) questionRepository.findAll();
    }
}
