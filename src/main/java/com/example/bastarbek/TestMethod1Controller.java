package com.example.bastarbek;

import com.example.bastarbek.model.QuestionsBase;
import com.example.bastarbek.model.method1.Answer;
import com.example.bastarbek.model.method1.AnswerStateInstance;
import com.example.bastarbek.model.method1.Question;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class TestMethod1Controller extends WindowFunctionality implements Initializable {

    List<Question> questions = null;

    AnswerStateInstance answerState = AnswerStateInstance.getInstance();

    ToggleGroup group = new ToggleGroup();

    protected static int counter = 1;

    @FXML
    private RadioButton answer1;

    @FXML
    private RadioButton answer2;

    @FXML
    private RadioButton answer3;

    @FXML
    private RadioButton answer4;

    @FXML
    private Button nextQuestionButton;

    @FXML
    private Text questionText;

    @FXML
    protected void nextQuestionAction() {
        try {
            RadioButton selection = (RadioButton) group.getSelectedToggle();
            String selectedAnswerText = selection.getText();

            if (counter == 10) {
                checkAnswer(selectedAnswerText, questions.get(counter - 1).getCorrectAnswer().text());
                selection.setSelected(false);
                counter = 1;
                answerState.date = getTime();
                openWindowWithStage("result_first.fxml", 900, 600, StageInstance.getInstance().stage);

            } else {
                System.out.println("Selected: " + selectedAnswerText);
                checkAnswer(selectedAnswerText, questions.get(counter - 1).getCorrectAnswer().text());
                setQuestionsView(questions.get(counter));
                counter++;
                selection.setSelected(false);
            }
        } catch (RuntimeException e) {
            showAlert(
                    Alert.AlertType.INFORMATION,
                    "Қателік",
                    "Сіз дұрыс жауап таңдамадыңыз",
                    "Экранда көрсетілген төрт нұсқаның біреуін таңдаңыз"
            );
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        createQuestionsBase();

        answer1.setToggleGroup(group);
        answer2.setToggleGroup(group);
        answer3.setToggleGroup(group);
        answer4.setToggleGroup(group);

        setQuestionsView(questions.get(0));


//        nextQuestionButton.setOnAction(event -> {
//            RadioButton selection = (RadioButton) group.getSelectedToggle();
//            System.out.println("Selected: " + selection.getText());
//        });
    }

    protected String getTime() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy, HH:mm:ss");
        return dateFormat.format(currentDate);
    }

    protected void checkAnswer(String selectedAnswerText, String correctAnswerText) {
        if(selectedAnswerText.equals(correctAnswerText)) {
            answerState.results.add(true);
            System.err.println("TRUE");
        } else {
            answerState.results.add(false);
            System.err.println("FALSE");
        }
    }

    protected void setQuestionsView(Question startQuestion) {
        questionText.setText(startQuestion.getText());

        List<Answer> answers = startQuestion.getAnswers();
        startQuestion.shuffleAnswers();

        answer1.setText(answers.get(0).text());
        answer2.setText(answers.get(1).text());
        answer3.setText(answers.get(2).text());
        answer4.setText(answers.get(3).text());
    }

    protected void createQuestionsBase() {
        questions = QuestionsBase.getFirstQuestionsBase();
    }
}
