package br.com.projeto.business;

import java.util.Collection;

import br.com.projeto.dao.PacienteDaoImpl;
import br.com.projeto.modelo.Paciente;

public class PacienteDaoFacade {
	
	private PacienteDaoImpl dao;

	public PacienteDaoFacade() {
		this.dao = new PacienteDaoImpl();
	}
	
	public void save(Paciente paciente) throws Exception  {
		this.dao.save(paciente);
	}
	
	public void update(Paciente paciente) throws Exception  {
		this.dao.update(paciente);
	}
	
	public Collection<Paciente> listAll() throws Exception {
		return this.dao.listAll();
	}
	
	public Paciente findById(Long id) throws Exception {
		return this.dao.findById(id);
	}
	
	public void deleteById(Long id) throws Exception {
		this.dao.deleteById(id);
	}

}
