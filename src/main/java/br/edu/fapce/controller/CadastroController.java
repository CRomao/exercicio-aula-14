package br.edu.fapce.controller;

import br.edu.fapce.model.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CadastroController {
	
	@FXML
	public TextField tfNome;
	@FXML
	public TextField tfDataNascimento;
	@FXML
	public TextField tfCPF;
	@FXML
	public TextField tfNomeMae;
	
	@FXML
	public Button btnCadastrar;
	
	@FXML
	public Button btnSerializar;
	
	@FXML
	public Button btnDesserializar;
	
	@FXML
	public Button btnSair;
	
	@FXML
	public void actionBtnCadastrar() {
		Usuario usuario = new Usuario(tfNome.getText(), tfCPF.getText(), 
				tfDataNascimento.getText(), tfNomeMae.getText());
		
		usuario.imprimirDados();
	}

	public void actionBtnSair() {
		System.exit(0);
	}
	

}
