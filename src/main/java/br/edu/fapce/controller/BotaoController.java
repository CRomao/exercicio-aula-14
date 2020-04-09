package br.edu.fapce.controller;

import java.io.IOException;

import br.edu.fapce.view.Cadastro;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotaoController {

	@FXML
	public Button buttonEnviar;

	@FXML
	public void actionEnviar() {
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setTitle("Informação");
		alert.setContentText("Pressione OK para realizar um cadastro!");
		alert.showAndWait();
		try {
			new Cadastro().start(new Stage());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}