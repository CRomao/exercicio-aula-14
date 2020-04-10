package br.edu.fapce.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios implements Serializable {

	public List<Usuario> lista = new ArrayList<>();

	// Função para adicionar um usuário na lista de usuários.
	public void adicionar(Usuario novoUsuario) {
		lista.add(novoUsuario);
	}

}
