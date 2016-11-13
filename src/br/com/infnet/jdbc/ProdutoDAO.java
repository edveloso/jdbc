package br.com.infnet.jdbc;

import java.sql.Connection;

public class ProdutoDAO {
	
	private Connection conexao;

	public ProdutoDAO() {
		this.conexao = new Conexao().getConexao();
	}
	
	
	

}
