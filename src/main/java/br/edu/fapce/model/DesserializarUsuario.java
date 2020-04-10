package br.edu.fapce.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesserializarUsuario {
	
	ListaUsuarios lista = null;
	FileInputStream arquivo = null;
	
	public DesserializarUsuario(String arq) {
		try {
			this.arquivo = new FileInputStream(arq);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void desserializar() {
		try {
			ObjectInputStream entrada = new ObjectInputStream(arquivo);
			this.lista = (ListaUsuarios) entrada.readObject();
			entrada.close();
			arquivo.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ListaUsuarios getLista() {
		return lista;
	}
	
}
