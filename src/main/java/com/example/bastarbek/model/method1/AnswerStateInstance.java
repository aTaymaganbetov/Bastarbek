package com.example.bastarbek.model.method1;

import java.util.ArrayList;
import java.util.List;

public class AnswerStateInstance {

    private static AnswerStateInstance instance;
    private AnswerStateInstance(){}

    public static AnswerStateInstance getInstance() {
        if (instance == null) {
            instance = new AnswerStateInstance();
        }
        return instance;
    }

    public List<Boolean> results = new ArrayList<>();
    public String date;
}
