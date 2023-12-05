/**
 * 
 */
package br.com.kezia;

import br.com.kezia.dao.ClienteDAO;
import br.com.kezia.dao.IClienteDAO;
import br.com.kezia.domain.Cliente;
import br.com.kezia.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertTrue;


public class ClienteDAOTest {
	
	private IClienteDAO clienteDao;

	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDAO();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Kezia");
		cliente.setCidade("Goiânia");
		cliente.setEnd("End");
		cliente.setEstado("GO");
		cliente.setNumero(11);
		cliente.setTel(992567011L);
		clienteDao.cadastrar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setCpf(58269856949L);
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Kezia Victoria");
		clienteDao.alterar(cliente);
		Assert.assertEquals("Kezia Victoria", cliente.getNome());
	}
	
	@Test
	public void buscarTodos() {
		Collection<Cliente> list = clienteDao.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);
	}
}
