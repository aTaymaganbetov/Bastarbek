module com.example.bastarbek {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.bastarbek to javafx.fxml;
    exports com.example.bastarbek;
}