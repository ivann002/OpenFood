module com.example.openfood {
    requires javafx.controls;
    requires javafx.fxml;
    requires retrofit2;
    requires retrofit2.converter.gson;


    opens com.example.openfood to javafx.fxml;
    exports com.example.openfood;
}