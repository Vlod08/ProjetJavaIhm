module com.example.projetjavaihm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetjavaihm to javafx.fxml;
    exports com.example.projetjavaihm;
}