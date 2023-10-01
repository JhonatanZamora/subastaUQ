module co.edu.uniquindio.subastauq {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.subastauq to javafx.fxml;
    exports co.edu.uniquindio.subastauq;
}