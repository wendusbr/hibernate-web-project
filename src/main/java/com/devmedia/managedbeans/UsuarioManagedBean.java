package com.devmedia.managedbeans;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.devmedia.model.Usuario;
import com.devmedia.model.UsuarioRN;

@ManagedBean(name="UsuarioMB")
public class UsuarioManagedBean {

 	private Usuario usuario = new Usuario();
	
 	UsuarioRN usuarioRN = new UsuarioRN();

 	public String inserir() {
 		
            	if (usuarioRN.inserir(usuario)) {
                 	FacesContext.getCurrentInstance().addMessage(
                  	null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                  	"Sucesso!", "Usuário cadastrado com sucesso!"));
            	} else {
                 	FacesContext.getCurrentInstance().addMessage(
                    	null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro!",
                    	"Erro no cadastro de usuário!"));

            	}
            	
      	return "";
 	}

 	public List<Usuario> getUsuarios() {

      	// Connect con = new Connect();
      	// List<Usuario> listaUsuarios = con.listUsuarios();

      	return usuarioRN.listar();
 	}
 	
 	public Usuario getUsuario() {
      	return usuario;
 	}

 	public void setUsuario(Usuario usuario) {
      	this.usuario = usuario;
 	}
}
