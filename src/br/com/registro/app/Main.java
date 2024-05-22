package br.com.registro.app;

import br.com.registro.dataAccessObject.UsuarioDAO;
import br.com.registro.model.Usuario;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Programa inicializado!");
		
		//criando e salvando um usuario
		
//		Usuario u = new Usuario();
//		u.setNome("Rosa");
//		u.setIdade(32);
//		u.setEmail("roseta@yahoo.com");
		
		//atualizando um usuario
		Usuario u = new Usuario();
		u.setNome("Roseta Lina");
		u.setIdade(33);
		u.setEmail("roseta@yahoo.com");
		u.setId_usuario(5);
		
		UsuarioDAO dao = new UsuarioDAO();
		
		//dao.atualizarUsuario(u);
		
		//deletar usuario por ID
		dao.deletarUsuario(5);
		
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
