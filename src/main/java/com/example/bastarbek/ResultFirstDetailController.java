package com.example.bastarbek;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ResultFirstDetailController extends WindowFunctionality implements Initializable {

    @FXML
    private TableColumn<Result, String> AuthorColumn;

    @FXML
    private TableColumn<Result, String> DateColumn;

    @FXML
    private TableColumn<Result, Integer> IdColumn;

    @FXML
    private TableColumn<Result, Integer> PointsColumn;

    @FXML
    private TableColumn<Result, String> StatusColumn;

    @FXML
    private TableView<Result> resultTableView;

    private Connection connection;

    ObservableList<Result> observableList = FXCollections.observableArrayList();

    @FXML
    protected void backWindowAction() {
        openWindowWithStage("results.fxml", 900, 600, StageInstance.getInstance().stage);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            connection = new DatabaseConnection().getConnection();
            updateTable();
        } catch (Exception e){
            Logger.getLogger(ResultFirstDetailController.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    String SELECT_ALL_FROM_RESULT = "SELECT * FROM result_1";

    private void updateTable (){

        observableList.clear();

        try {
            ResultSet rs = connection.createStatement().executeQuery(SELECT_ALL_FROM_RESULT);

            while (rs.next()){
                Integer id = Integer.valueOf(rs.getString("id"));
                Integer points = Integer.valueOf(rs.getString("points"));
                String date = rs.getString("date");
                String author = rs.getString("author");
                String status = rs.getString("status");

                observableList.add(new Result(id, points, date, author, status));
            }

        } catch (SQLException e){
            Logger.getLogger(ResultFirstDetailController.class.getName()).log(Level.SEVERE,null,e);
        }

        IdColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        PointsColumn.setCellValueFactory(new PropertyValueFactory<>("points"));
        DateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        AuthorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));
        StatusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        resultTableView.setItems(observableList);

    }
}
