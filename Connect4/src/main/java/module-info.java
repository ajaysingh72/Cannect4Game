module com.singh.connect4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.singh.connect4 to javafx.fxml;
    exports com.singh.connect4;
}