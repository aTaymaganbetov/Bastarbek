package com.example.bastarbek.model.method2;

import com.example.bastarbek.model.method1.Answer;

import java.util.List;

public class QuestionSecond {

    private String text; // Текст вопроса

    private List<String> correctAnswerArray;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswerArray;
    }

    public void setCorrectAnswers(List<String> correctAnswerArray) {
        this.correctAnswerArray = correctAnswerArray;
    }
}
