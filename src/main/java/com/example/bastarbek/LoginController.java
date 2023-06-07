package com.example.bastarbek;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController extends WindowFunctionality implements Initializable {

    @FXML
    private Button enterButton;

    @FXML
    private Button closeButton;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private ImageView pic;

    @FXML
    protected void enterAction() {
        openWindowWithStage("hello-view.fxml", 900, 600, StageInstance.getInstance().stage);
        Stage stage = (Stage) enterButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void exitAction() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void clearAction() {
        loginField.clear();
        passwordField.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File brandingFile = new File("picture/zamok.png");
        Image bulbImage = new Image(brandingFile.toURI().toString());
        pic.setImage(bulbImage);
    }
}
