package com.example.bastarbek;

import com.example.bastarbek.model.method1.AnswerStateInstance;
import com.example.bastarbek.model.method2.AnswerStateInstanceSecond;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ResultSecondController extends WindowFunctionality implements Initializable {

    AnswerStateInstanceSecond answerState = AnswerStateInstanceSecond.getInstance();
    @FXML
    private Text resultText;

    @FXML
    protected void backWindowAction() {
        openWindowWithStage("after_hello-view.fxml", 900, 600, StageInstance.getInstance().stage);
        answerState.results.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        StringBuilder result = new StringBuilder();
        int numberOfCorrectAnswers = getNumberOfCorrectAnswers();
        result.append("Результат: ").append(numberOfCorrectAnswers).append("/10.\n");
        result.append("Өту уақыты: ").append(answerState.date);

        resultText.setText(result.toString());
    }

    protected Integer getNumberOfCorrectAnswers() {
        int counter = 0;
        for(Boolean item : answerState.results) {
            if(item) {
                counter++;
            }
        }
        return counter;
    }
}
