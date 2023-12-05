/**
 * 
 */
package br.com.kezia.dao;

import br.com.kezia.dao.generic.GenericDAO;
import br.com.kezia.domain.Produto;
import br.com.kezia.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {
	
	public ProdutoDAO() {
		super();
	}

	@Override
	public Class<Produto> getTipoClasse() {
		return Produto.class;
	}


	@Override
	public void atualizarDados(Produto entity, Produto entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setDescricao(entity.getDescricao());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setValor(entity.getValor());
	}

}
