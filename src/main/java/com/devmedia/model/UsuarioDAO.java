// By: Wendell Bernardo

package com.devmedia.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

public class UsuarioDAO {
	HibernateUtil hibernateUtil = new HibernateUtil();
	
	public boolean inserir(Usuario usuario) {
		usuario.setDataCadastro(new Date(new Date().getTime()));
		
		Session session = hibernateUtil.getCurrentSession();
		session.beginTransaction();
		session.persist(usuario);
		session.getTransaction().commit();
		session.close();
		
		return true;
	}

	public List<Usuario> listar() {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		Session session = hibernateUtil.getCurrentSession();
		session.beginTransaction();
		usuarios = session.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
		session.close();
		
		return usuarios;
	}

}
