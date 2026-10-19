module com.main.ejercicio1_2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.main.ejercicio1_2 to javafx.fxml;
    exports com.main.ejercicio1_2;
}
