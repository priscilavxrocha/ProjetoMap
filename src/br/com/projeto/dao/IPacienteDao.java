package br.com.projeto.dao;

import java.util.Collection;

import br.com.projeto.modelo.Paciente;

public interface IPacienteDao extends GenericDao<Paciente, Long>{

			public void save(Paciente paciente) throws Exception;
			
			public Paciente findById(Long id) throws Exception;
			
			public void deleteById(Long id) throws Exception;
			
			public void update(Paciente paciente) throws Exception;
			
			public Collection<Paciente> listAll() throws Exception;

	
}
