package br.com.projeto.dao;

import java.util.Collection;

import br.com.projeto.modelo.Atendente;

public interface IAtendenteDao extends GenericDao<Atendente, Long> {

	public void save(Atendente atendente) throws Exception;
	
	public Atendente findById(Long id) throws Exception;
	
	public void deleteById(Long id) throws Exception;
	
	public void update(Atendente atendente) throws Exception;
	
	public Collection<Atendente> listAll() throws Exception;
}

