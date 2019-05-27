package br.com.projeto.dao;

import java.io.Serializable;
import java.util.Collection;

public interface GenericDao <T, ID extends Serializable>{

	public void save(T instance) throws Exception;
	
	public T findById(ID id) throws Exception;
	
	public void deleteById (ID id) throws Exception;
	
	public void update (T instance) throws Exception;
	
	public Collection<T> listAll() throws Exception;
}
