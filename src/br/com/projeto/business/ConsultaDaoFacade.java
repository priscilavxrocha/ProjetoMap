package br.com.projeto.business;

import java.util.Collection;

import br.com.projeto.dao.ConsultaDaoImpl;
import br.com.projeto.modelo.Consulta;

public class ConsultaDaoFacade {
	
	private ConsultaDaoImpl dao;

	public ConsultaDaoFacade() {
		this.dao = new ConsultaDaoImpl();
	}
	
	public void save(Consulta consulta) throws Exception  {
		this.dao.save(consulta);
	}
	
	public void update(Consulta consulta) throws Exception  {
		this.dao.update(consulta);
	}
	
	public Collection<Consulta> listAll() throws Exception {
		return this.dao.listAll();
	}
	
	public Consulta findById(Long id) throws Exception {
		return this.dao.findById(id);
	}
	
	public void deleteById(Long id) throws Exception {
		this.dao.deleteById(id);
	}

}
