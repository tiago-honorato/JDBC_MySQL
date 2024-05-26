package br.com.registro.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Conexao {
	
	private static Connection conn;
	
	public static Connection getConexao() {
		
		try {
			
			if(conn == null) {
				
				Properties prop = getProperties();
				
				final String URL = prop.getProperty("database.url");
				final String USER = prop.getProperty("database.user");
				final String PASSWORD = prop.getProperty("database.password");
				
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
	
	private static Properties getProperties() throws IOException {
		
		Properties prop = new Properties();
		
		String path = "/conexao.properties";
		
		prop.load(Conexao.class.getResourceAsStream(path));
		
		return prop;
	}
	
}
