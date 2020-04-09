module br.edu.fapce.view {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.fapce.view to javafx.fxml;
    exports br.edu.fapce.view;
    exports br.edu.fapce.controller;
    exports br.edu.fapce.model;
}