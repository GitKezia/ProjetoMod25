/**
 * 
 */
package br.com.kezia.services.generic;

import br.com.kezia.dao.Persistente;
import br.com.kezia.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericService <T extends Persistente, E extends Serializable> {
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    public void excluir(E valor);


    public void alterar(T entity) throws TipoChaveNaoEncontradaException;


    public T consultar(E valor);


    public Collection<T> buscarTodos();

}
