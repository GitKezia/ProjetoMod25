/**
 * 
 */
package br.com.kezia.dao;

import br.com.kezia.dao.generic.GenericDAO;
import br.com.kezia.dao.generic.IGenericDAO;
import br.com.kezia.domain.Cliente;
import br.com.kezia.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super();
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		return Cliente.class;
	}

	@Override
	public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
		entityCadastrado.setCidade(entity.getCidade());
		entityCadastrado.setCpf(entity.getCpf());
		entityCadastrado.setEnd(entity.getEnd());
		entityCadastrado.setEstado(entity.getEstado());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setNumero(entity.getNumero());
		entityCadastrado.setTel(entity.getTel());
		
	}

}
