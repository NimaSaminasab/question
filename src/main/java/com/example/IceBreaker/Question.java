package com.example.IceBreaker;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question ;
    @ElementCollection
    private Map<String, String> answerAlternatives ;
    private String rightAnswer ;

    public Question() {

    }
    public Question(long id, String question,String rightAnswer){
        this.id = id ;
        this.question = question ;
        this.rightAnswer = rightAnswer ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

}
