package br.com.registro.app;

import br.com.registro.dataAccessObject.UsuarioDAO;
import br.com.registro.model.Usuario;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Programa inicializado!");
		
		//criando e salvando um usuario
		Usuario u = new Usuario();
		u.setNome("Tiago");
		u.setIdade(23);
		u.setEmail("tiago@gmail.com");
		
		UsuarioDAO dao = new UsuarioDAO();
		
		dao.cadastrarUsuario(u);
		
		//listando todos usuarios
		for(Usuario user : dao.obterUsuarios()) {
			
			System.out.println("ID: " + user.getId_usuario());
			System.out.println("Nome: " + user.getNome());
			System.out.println("Idade: " + user.getIdade());
			System.out.println("Email: " + user.getEmail());
			System.out.println();
			
		}
		
	}
	
}
