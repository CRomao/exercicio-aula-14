package br.edu.fapce.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class SerializarUsuario {
	
	Usuario usuario;
	
	public SerializarUsuario(Usuario usu) {
		this.usuario = usu;
	}
	
	
	public void serializar() {
		try{
			FileOutputStream arquivo = new FileOutputStream("arquivo.ser");
			ObjectOutputStream saida = new ObjectOutputStream(arquivo);
			saida.writeObject(usuario);
			saida.close();
			arquivo.close();
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText(null);
			alert.setTitle("Informação");
			alert.setContentText("Objeto serializado!");
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
