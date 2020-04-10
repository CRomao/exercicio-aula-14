package br.edu.fapce.controller;

import br.edu.fapce.model.DesserializarListaUsuario;
import br.edu.fapce.model.ListaUsuarios;
import br.edu.fapce.model.SerializarListaUsuario;
import br.edu.fapce.model.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

//Classe para o controle dos Cadastros.
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

	// Função para cadastrar o usuário e inserir ele na lista.
	@FXML
	public void actionBtnCadastrar() {
		Usuario usuario = new Usuario(tfNome.getText(), tfCPF.getText(), tfDataNascimento.getText(),
				tfNomeMae.getText());
		usuario.imprimirDados();
		lista.adicionar(usuario);
		preencherUsuariosCadastrados();
		limparCampos();
	}

	// Função para serializar a lista de usuários.
	public void actionBtnSerializar() {
		SerializarListaUsuario ser = new SerializarListaUsuario(lista);
		ser.serializar();
	}

	// Função para desserializar a lista de usuários.
	public void actionBtnDesserializar() {
		DesserializarListaUsuario desser = new DesserializarListaUsuario("arquivo.ser");
		desser.desserializar();
		this.lista = desser.getLista();
		preencherUsuariosDesserializados(lista);
	}

	// Função para sair da aplicação.
	public void actionBtnSair() {
		System.exit(0);
	}

	// Função para limpar os campos, após realizar um cadastro.
	public void limparCampos() {
		tfNome.setText("");
		tfCPF.setText("");
		tfDataNascimento.setText("");
		tfNomeMae.setText("");
	}

	// Função para adicionar no TextArea após cadastrar um usuário.
	public void preencherUsuariosCadastrados() {
		taUsuariosCadastrados.setText("");
		for (int i = 0; i < lista.lista.size(); i++) {
			taUsuariosCadastrados.appendText("Nome: " + lista.lista.get(i).getNome() + "\n");
		}
	}

	// Função para adicionar no TextArea os usuários desserializados.
	public void preencherUsuariosDesserializados(ListaUsuarios listaUsu) {
		taDesserializados.setText("");
		for (int i = 0; i < listaUsu.lista.size(); i++) {
			taDesserializados.appendText("Nome: " + lista.lista.get(i).getNome() + "\n");
		}
	}

}
