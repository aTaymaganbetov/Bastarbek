package com.example.bastarbek;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController extends WindowFunctionality implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onAfterHelloView() {
        openWindowWithStage("after_hello-view.fxml", 900, 600, StageInstance.getInstance().stage);
    }

    @FXML
    protected void onResultsView() {
        openWindowWithStage("results.fxml", 900, 600, StageInstance.getInstance().stage);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}