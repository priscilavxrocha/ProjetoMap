package br.com.projeto.business;

import java.util.Collection;

import br.com.projeto.dao.AtendenteDaoImpl;
import br.com.projeto.modelo.Atendente;

public class AtendenteDaoFacade {
	
	private AtendenteDaoImpl dao;

	public AtendenteDaoFacade() {
		this.dao = new AtendenteDaoImpl();
	}
	
	public void save(Atendente atendente) throws Exception  {
		this.dao.save(atendente);
	}
	
	public void update(Atendente atendente) throws Exception  {
		this.dao.update(atendente);
	}
	
	public Collection<Atendente> listAll() throws Exception {
		return this.dao.listAll();
	}
	
	public Atendente findById(Long id) throws Exception {
		return this.dao.findById(id);
	}
	
	public void deleteById(Long id) throws Exception {
		this.dao.deleteById(id);
	}

}
