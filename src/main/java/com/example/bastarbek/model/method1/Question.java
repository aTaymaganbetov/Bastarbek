package com.example.bastarbek.model.method1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {

    public Question(String correctAnswerKey) {
        this.correctAnswerKey = correctAnswerKey;
    }

    private String text; // Текст вопроса
    private List<Answer> answers = new ArrayList<>(); // Список вариантов ответов
    private final String correctAnswerKey; // Индекс правильного ответа в списке вариантов

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public Answer getCorrectAnswer() {
        for (Answer answer : answers) {
            if (answer.key().equals(correctAnswerKey)) {
                return answer;
            }
        }
        return null;
    }

    public void shuffleAnswers() {
        Collections.shuffle(answers);
    }
}
