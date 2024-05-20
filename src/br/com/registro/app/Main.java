package br.com.registro.app;

import br.com.registro.dataAccessObject.UsuarioDAO;
import br.com.registro.model.Usuario;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Programa inicializado!");
		
		Usuario u = new Usuario();
		u.setNome("Tiago");
		u.setIdade(23);
		u.setEmail("tiago@gmail.com");
		
		UsuarioDAO dao = new UsuarioDAO();
		
		dao.cadastrarUsuario(u);
		
	}
	
}
