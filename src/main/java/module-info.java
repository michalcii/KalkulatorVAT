module com.example.kajakiii {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kajakiii to javafx.fxml;
    exports com.example.kajakiii;
}