module com.example.csc325mod5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc325mod5 to javafx.fxml;
    exports com.example.csc325mod5;
}