// By: Wendell Bernardo

package com.devmedia.model;

import java.util.List;

public class UsuarioRN {
	
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public boolean inserir(Usuario usuario) {		
		return usuarioDAO.inserir(usuario);
	}

	public List<Usuario> listar(){
		return usuarioDAO.listar();
	}
}
