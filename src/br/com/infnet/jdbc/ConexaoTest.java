package br.com.infnet.jdbc;


import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class ConexaoTest {

	@Test
	public void testGetConexao() {
		assertNotNull(new Conexao().getConexao());
	}

}
