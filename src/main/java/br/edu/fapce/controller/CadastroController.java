package br.edu.fapce.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import br.edu.fapce.model.DesserializarUsuario;
import br.edu.fapce.model.SerializarUsuario;
import br.edu.fapce.model.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CadastroController {
	
	Usuario usuario;
	
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
		usuario = new Usuario(tfNome.getText(), tfCPF.getText(), 
				tfDataNascimento.getText(), tfNomeMae.getText());
		
		usuario.imprimirDados();
	}
	
	public void actionBtnSerializar() {
		SerializarUsuario ser = new SerializarUsuario(usuario);
		ser.serializar();
		limparCampos();
	}
	
	public void actionBtnDesserializar() {
		DesserializarUsuario desser = new DesserializarUsuario("arquivo.ser");
		desser.desserializar();
		this.usuario = desser.getUsuario();
		preencherCampos(usuario.getNome(), usuario.getCpf(), usuario.getDataNascimento(), usuario.getNomeMae());
		usuario.imprimirDados();
	}

	public void actionBtnSair() {
		System.exit(0);
	}
	
	public void limparCampos() {
		tfNome.setText("");
		tfCPF.setText("");
		tfDataNascimento.setText("");
		tfNomeMae.setText("");
	}
	
	public void preencherCampos(String nome, String cpf, String dataNascimento, String nomeMae) {
		tfNome.setText(nome);
		tfCPF.setText(cpf);
		tfDataNascimento.setText(dataNascimento);
		tfNomeMae.setText(nomeMae);
	}
	
	

}
