/**
 * 
 */
package br.com.kezia.dao;

import br.com.kezia.dao.generic.IGenericDAO;
import br.com.kezia.domain.Produto;


public interface IProdutoDAO extends IGenericDAO<Produto, String>{

    Class<Produto> getTipoClasse();

    void atualizarDados(Produto entity, Produto entityCadastrado);
}
