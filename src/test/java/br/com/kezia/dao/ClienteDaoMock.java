package br.com.kezia.dao;

import br.com.kezia.domain.Cliente;
import br.com.kezia.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ClienteDaoMock implements IClienteDAO {

	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {

		return true;
	}

	@Override
	public void excluir(Long valor) {

		
	}

	@Override
	public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {

		
	}

	@Override
	public Cliente consultar(Long valor) {
		Cliente cliente = new Cliente();
		cliente.setCpf(valor);
		return cliente;
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		return null;
	}


}
