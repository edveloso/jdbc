package br.com.infnet.jdbc;

import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Field;

import org.apache.commons.lang.reflect.FieldUtils;
import org.junit.Test;

public class ProdutoDAOTest {

	@Test
	public void testConexao() throws Exception {
		ProdutoDAO dao = new ProdutoDAO();
		Field conF = FieldUtils.getDeclaredField(ProdutoDAO.class, "conexao", true);
		assertNotNull( conF.get(dao) );
	}

}
