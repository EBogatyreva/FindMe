module com.example.findme {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.findme to javafx.fxml;
    exports com.example.findme;
}