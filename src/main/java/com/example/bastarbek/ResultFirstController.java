package com.example.bastarbek;

import com.example.bastarbek.model.method1.AnswerStateInstance;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ResultFirstController extends WindowFunctionality implements Initializable {

    private Connection connection;

    ObservableList<Result> observableList = FXCollections.observableArrayList();

    String INSERT_INTO_RESULT = "INSERT INTO result_1 (points, date, author, status)" +
            " VALUES (?, ?, ?, ?)";

    AnswerStateInstance answerState = AnswerStateInstance.getInstance();
    @FXML
    private Text resultText;

    @FXML
    protected void backWindowAction() {
        openWindowWithStage("after_hello-view.fxml", 900, 600, StageInstance.getInstance().stage);
        answerState.results.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            connection = new DatabaseConnection().getConnection();
        } catch (Exception e){
            Logger.getLogger(ResultFirstController.class.getName()).log(Level.SEVERE,null,e);
        }

        StringBuilder result = new StringBuilder();
        int numberOfCorrectAnswers = getNumberOfCorrectAnswers();
        result.append("Результат: ").append(numberOfCorrectAnswers).append("/10.\n");
        result.append("Өту уақыты: ").append(answerState.date);

        resultText.setText(result.toString());

        addDataToDB();
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


    public void addDataToDB() {
        String status = null;
        if(getNumberOfCorrectAnswers()>6) {
            status = "Өтілді";
        } else {
            status ="Өтілмеді";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_RESULT);
            preparedStatement.setInt(1, getNumberOfCorrectAnswers());
            preparedStatement.setString(2, answerState.date);
            preparedStatement.setString(3, "Author");
            preparedStatement.setString(4, status);

            preparedStatement.executeUpdate();
            System.out.println("Данные о туре успешно добавлены!");

        } catch (SQLException e) {

        }
    }
}
