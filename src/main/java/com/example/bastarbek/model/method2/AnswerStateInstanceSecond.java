package com.example.bastarbek.model.method2;

import com.example.bastarbek.model.method1.AnswerStateInstance;

import java.util.ArrayList;
import java.util.List;

public class AnswerStateInstanceSecond {

    private static AnswerStateInstanceSecond instance;
    private AnswerStateInstanceSecond(){}

    public static AnswerStateInstanceSecond getInstance() {
        if (instance == null) {
            instance = new AnswerStateInstanceSecond();
        }
        return instance;
    }

    public List<Boolean> results = new ArrayList<>();
    public String date;
}
