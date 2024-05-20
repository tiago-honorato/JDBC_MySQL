package br.com.registro.dataAccessObject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.registro.connection.Conexao;
import br.com.registro.model.Usuario;

public class UsuarioDAO {
	
	//CRUD

	//create
	public void cadastrarUsuario(Usuario user) {
		
		String sql = "INSERT INTO USUARIO (NOME, IDADE, EMAIL) VALUES (?, ?, ?)";
		
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.getConexao().prepareStatement(sql);
			ps.setString(1, user.getNome());
			ps.setInt(2, user.getIdade());
			ps.setString(3, user.getEmail());
			
			ps.execute();
			ps.close();
			System.out.println("Registro salvo com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//read
	public List<Usuario> obterUsuarios(){
		
		String sql = "SELECT * FROM usuario";
		
		List<Usuario> users = new ArrayList<Usuario>();
		
		PreparedStatement ps = null;
		
		//Classe que vai receber os dados do banco de dados
		ResultSet rs = null;
		
		try {
			
			ps = Conexao.getConexao().prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				
				Usuario user = new Usuario();
				user.setId_usuario(rs.getInt("id_usuario"));
				user.setNome(rs.getString("nome"));
				user.setIdade(rs.getInt("idade"));
				user.setEmail(rs.getString("email"));
				
				users.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();	
		}finally {
		
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		return users;
		
	}
	
	
}
