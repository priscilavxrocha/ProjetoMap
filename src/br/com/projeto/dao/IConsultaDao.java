package br.com.projeto.dao;

import java.util.Collection;

import br.com.projeto.modelo.Consulta;

public interface IConsultaDao extends GenericDao<Consulta, Long> {

	public void save(Consulta consulta) throws Exception;
	
	public Consulta findById(Long id) throws Exception;
	
	public void deleteById(Long id) throws Exception;
	
	public void update(Consulta consulta) throws Exception;
	
	public Collection<Consulta> listAll() throws Exception;
}


