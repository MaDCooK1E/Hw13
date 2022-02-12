module ua.hillel.homework13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ua.hillel.homework13 to javafx.fxml;
    exports ua.hillel.homework13;
}