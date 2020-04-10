package br.edu.fapce.controller;

import br.edu.fapce.model.DesserializarUsuario;
import br.edu.fapce.model.ListaUsuarios;
import br.edu.fapce.model.SerializarUsuario;
import br.edu.fapce.model.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CadastroController {
	
	ListaUsuarios lista = new ListaUsuarios();
	
	@FXML
	public TextField tfNome;
	@FXML
	public TextField tfDataNascimento;
	@FXML
	public TextField tfCPF;
	@FXML
	public TextField tfNomeMae;
	
	@FXML
	public TextArea taUsuariosCadastrados;
	
	@FXML
	public TextArea taDesserializados;
	
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
		lista.adicionar(usuario);
		preencherUsuariosCadastrados();
		limparCampos();
	}
	
	public void actionBtnSerializar() {
		SerializarUsuario ser = new SerializarUsuario(lista);
		ser.serializar();
	}
	
	public void actionBtnDesserializar() {
		DesserializarUsuario desser = new DesserializarUsuario("arquivo.ser");
		desser.desserializar();
		this.lista = desser.getLista();
		preencherUsuariosDesserializados(lista);
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
	
	public void preencherUsuariosCadastrados() {
		taUsuariosCadastrados.setText("");
		for(int i=0; i< lista.lista.size(); i++) {
			taUsuariosCadastrados.appendText("Nome: " + lista.lista.get(i).getNome() + "\n");
		}
	}
	
	public void preencherUsuariosDesserializados(ListaUsuarios listaUsu) {
		taDesserializados.setText("");
		for(int i=0; i< listaUsu.lista.size(); i++) {
			taDesserializados.appendText("Nome: " + lista.lista.get(i).getNome() + "\n");
		}
	}

}
