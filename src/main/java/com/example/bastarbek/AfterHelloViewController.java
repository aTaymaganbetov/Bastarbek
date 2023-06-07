package com.example.bastarbek;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class AfterHelloViewController extends WindowFunctionality implements Initializable {

    @FXML
    protected void backWindowAction() {
        openWindowWithStage("hello-view.fxml", 900, 600, StageInstance.getInstance().stage);
    }

    @FXML
    protected void firstMethodTextView() {
        openWindowWithStage("test.fxml", 900, 600, StageInstance.getInstance().stage);
    }

    @FXML
    protected void secondMethodTextView() {
        openWindowWithStage("test_with_textfield.fxml", 900, 600, StageInstance.getInstance().stage);
    }

    @FXML
    protected void thirdMethodTextView() {
        openWindowWithStage("test_last_beta.fxml", 900, 600, StageInstance.getInstance().stage);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
