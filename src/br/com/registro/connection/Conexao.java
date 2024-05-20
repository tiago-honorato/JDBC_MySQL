package br.com.registro.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	//caminho do banco de dados
	private static final String URL = "jdbc:mysql://localhost:3306/registrosdb";
	//nome do usuario do mysql
	private static final String USER = "root";
	//senha do banco de dados
	private static final String PASSWORD = "senha123";
	
	private static Connection conn;
	
	public static Connection getConexao() {
		
		try {
			
			if(conn == null) {
				
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				return conn;
				
			}else{
				
				return conn;
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		
	}
	
}
