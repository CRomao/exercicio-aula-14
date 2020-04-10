package br.edu.fapce.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class SerializarUsuario {
	
	ListaUsuarios lista;
	
	public SerializarUsuario(ListaUsuarios usu) {
		this.lista = usu;
	}
	
	
	public void serializar() {
		try{
			FileOutputStream arquivo = new FileOutputStream("arquivo.ser");
			ObjectOutputStream saida = new ObjectOutputStream(arquivo);
			saida.writeObject(lista);
			saida.close();
			arquivo.close();
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText(null);
			alert.setTitle("Informação");
			alert.setContentText("Lista de Usuários serializada!");
			alert.showAndWait();
		}catch(Exception e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText(null);
			alert.setTitle("Informação");
			alert.setContentText("Objeto não serializado");
			alert.showAndWait();
			e.printStackTrace();
		}
	}

}
