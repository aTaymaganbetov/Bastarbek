package com.example.bastarbek;

import com.example.bastarbek.model.QuestionsBase;
import com.example.bastarbek.model.method1.Answer;
import com.example.bastarbek.model.method1.AnswerStateInstance;
import com.example.bastarbek.model.method1.Question;
import com.example.bastarbek.model.method2.AnswerStateInstanceSecond;
import com.example.bastarbek.model.method2.QuestionSecond;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class TestMethod2Controller extends WindowFunctionality implements Initializable {

    List<QuestionSecond> questions = null;

    AnswerStateInstanceSecond answerState = AnswerStateInstanceSecond.getInstance();


    protected static int counter = 1;

    @FXML
    private Text questionText;

    @FXML
    private TextField answerField;

    @FXML
    protected void nextQuestionAction() {
        String selectedAnswerText = answerField.getText();

        if(selectedAnswerText.isEmpty()) {
            showAlert(
                    Alert.AlertType.INFORMATION,
                    "Input data is empty",
                    "Қателік! Сіз мән егізбедіңіз.",
                    "Ұяшыққа жауаптың енгізілгеніне көз жеткізіп, әрекетті қайталаңыз."
            );
        } else {
            if (counter == 10) {
                checkAnswer(selectedAnswerText, questions.get(counter - 1).getCorrectAnswers());
                counter = 1;
                answerState.date = getTime();
                openWindowWithStage("result_second.fxml", 900, 600, StageInstance.getInstance().stage);

            } else {
                System.out.println("Selected: " + selectedAnswerText);
                checkAnswer(selectedAnswerText, questions.get(counter - 1).getCorrectAnswers());
                setQuestionsView(questions.get(counter));
                counter++;
            }
        }
    }

    @FXML
    protected void clearAction() {
        answerField.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        createQuestionsBase();
        setQuestionsView(questions.get(0));
    }

    protected void setQuestionsView(QuestionSecond question) {
        questionText.setText(question.getText());
        answerField.clear();
    }

    protected void checkAnswer(String selectedAnswerText, List<String> correctAnswers) {
        boolean result = false;
        for(String currentQuestion : correctAnswers) {
            if(selectedAnswerText.trim().equalsIgnoreCase(currentQuestion)) {
                result = true;
                System.err.println("TRUE");
            }
        }
        answerState.results.add(result);
    }

    protected void createQuestionsBase() {
        questions = QuestionsBase.getSecondQuestionsBase();
    }
}
