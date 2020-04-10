package br.edu.fapce.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//Classe para Desserializar a lista.
public class DesserializarListaUsuario {

	ListaUsuarios lista = null;
	FileInputStream arquivo = null;

	// Construtor que vai receber o nome do arquivo.
	public DesserializarListaUsuario(String arq) {
		try {
			this.arquivo = new FileInputStream(arq);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Função que vai fazer a desserialização.
	public void desserializar() {
		try {
			// Pega o conteudo do arquivo, lê e joga no objeto lista dessa classe.
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

	// Função para retornar a lista depois de desserializada.
	public ListaUsuarios getLista() {
		return lista;
	}

}
