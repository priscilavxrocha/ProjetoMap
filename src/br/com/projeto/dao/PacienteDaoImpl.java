package br.com.projeto.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import br.com.projeto.modelo.Paciente;
import br.com.projeto.utils.JPAUtils;

public class PacienteDaoImpl implements IPacienteDao{

	EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();
	EntityManager factory = null;
	
	public void save(Paciente paciente) throws Exception {
		this.factory = emf.createEntityManager();

		try {
			factory.getTransaction().begin();
			if (paciente.getId() == null) {
				factory.persist(paciente);
			} else {
				factory.merge(paciente);
			}
			factory.getTransaction().commit();

		} catch (Exception e) {
			e.getMessage();
			this.factory.getTransaction().rollback();
			
		} finally {
			factory.close();
		}
		
	}

	public Paciente findById(Long id) throws Exception {

		this.factory = emf.createEntityManager();
		Paciente paciente = new Paciente();
		try {
			paciente = factory.find(Paciente.class, id);
			return paciente;

		} catch (Exception e) {
			e.getMessage();
			this.factory.getTransaction().rollback();
		} finally {
			factory.close();
		}
		return null;
		
	}

	public void deleteById(Long id) throws Exception {

		this.factory = emf.createEntityManager();
		Paciente paciente = new Paciente();

		try {

			paciente = factory.find(Paciente.class, id);
			factory.getTransaction().begin();
			factory.remove(paciente);
			factory.getTransaction().commit();

		} catch (Exception e) {
			e.getMessage();
			this.factory.getTransaction().rollback();
		} finally {
			factory.close();
		}

		
	}

	public void update(Paciente paciente) throws Exception {

		this.factory = emf.createEntityManager();

		try {
			factory.getTransaction().begin();
			factory.merge(paciente);
			factory.getTransaction().commit();

		} catch (Exception e) {
			e.getMessage();
			this.factory.getTransaction().rollback();
		} finally {
			factory.close();
		}
		
	}

	public Collection<Paciente> listAll() throws Exception {

		this.factory = emf.createEntityManager();
		List<Paciente> paciente = new ArrayList<Paciente>();
		try {
			factory.getTransaction().begin();
			TypedQuery<Paciente> query = factory.createNamedQuery("Paciente.findAll", Paciente.class);
			paciente = query.getResultList();
			factory.getTransaction().commit();
//			
//			return this.factory.createQuery("SELECT c FROM Paciente c", Paciente.class).getResultList();

		} catch (Exception e) {
			e.getMessage();
			this.factory.getTransaction().rollback();
		} finally {
			factory.close();
		}

		return paciente;
		
	}

}
