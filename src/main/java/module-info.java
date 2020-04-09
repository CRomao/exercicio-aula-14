module br.edu.fapce.botao {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.fapce.botao to javafx.fxml;
    exports br.edu.fapce.botao;
}