package br.com.projeto.dao;

import java.util.Collection;

import br.com.projeto.modelo.Usuario;

public interface IUsuarioDao extends GenericDao<Usuario, Long> {

	public void save(Usuario usuario) throws Exception;
	
	public Usuario findById(Long id) throws Exception;
	
	public void deleteById(Long id) throws Exception;
	
	public void update(Usuario paciente) throws Exception;
	
	public Collection<Usuario> listAll() throws Exception;
}
