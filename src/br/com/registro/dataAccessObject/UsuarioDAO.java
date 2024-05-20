package br.com.registro.dataAccessObject;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.registro.connection.Conexao;
import br.com.registro.model.Usuario;

public class UsuarioDAO {

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
	
}
