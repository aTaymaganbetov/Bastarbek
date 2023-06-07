package com.example.bastarbek;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ResultsController extends WindowFunctionality implements Initializable {

    @FXML
    protected void backWindowAction() {
        openWindowWithStage("hello-view.fxml", 900, 600, StageInstance.getInstance().stage);
    }

    @FXML
    protected void firstDetail() {
        openWindowWithStage("result_first_detail.fxml", 900, 600, StageInstance.getInstance().stage);
    }

    @FXML
    protected void secondDetail() {
        openWindowWithStage("result_second_detail.fxml", 900, 600, StageInstance.getInstance().stage);
    }

    @FXML
    protected void thirdDetail() {
        openWindowWithStage("result_third_detail.fxml", 900, 600, StageInstance.getInstance().stage);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
