package br.com.infnet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexao {

	private Logger log = Logger.getLogger(Conexao.class.getName());
	
	public Connection getConexao() {
		String usuario = "root", 
				senha = "123456", 
				url = "jdbc:mysql://localhost:3306/infnet";
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, usuario, senha);
			log.info("Banco conectado");
		}catch(Exception ex){
			log.log(Level.SEVERE, "Conexao nao pode ser estabelecida", ex);
		}
		return con;
	}
	
}
