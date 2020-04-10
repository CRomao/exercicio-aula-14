package br.edu.fapce.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

//Classe para serializar a lista de usuários.
public class SerializarListaUsuario {

	ListaUsuarios lista;

	// Construtor que recebe a lista.
	public SerializarListaUsuario(ListaUsuarios usu) {
		this.lista = usu;
	}

	// Função para a serialização.
	public void serializar() {
		try {
			// Cria o arquivo, joga no OutputStream e escreve no arquivo.
			FileOutputStream arquivo = new FileOutputStream("arquivo.ser");
			ObjectOutputStream saida = new ObjectOutputStream(arquivo);
			saida.writeObject(lista);
			saida.close();
			arquivo.close();

			// Mostra a mensagem se deu certo serializar.
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText(null);
			alert.setTitle("Informação");
			alert.setContentText("Lista de Usuários serializada!");
			alert.showAndWait();
		} catch (Exception e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText(null);
			alert.setTitle("Informação");
			alert.setContentText("Lista de Usuários não serializada!");
			alert.showAndWait();
			e.printStackTrace();
		}
	}

}
