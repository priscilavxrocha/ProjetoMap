package br.com.projeto.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import br.com.projeto.modelo.Atendente;
import br.com.projeto.utils.JPAUtils;


public class AtendenteDaoImpl {

	EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();
	EntityManager factory = null;
	
	public void save(Atendente atendente) throws Exception {
		this.factory = emf.createEntityManager();

		try {
			factory.getTransaction().begin();
			if (atendente.getId() == null) {
				factory.persist(atendente);
			} else {
				factory.merge(atendente);
			}
			factory.getTransaction().commit();

		} catch (Exception e) {
			e.getMessage();
			this.factory.getTransaction().rollback();
			
		} finally {
			factory.close();
		}
		
	}

	public Atendente findById(Long id) throws Exception {

		this.factory = emf.createEntityManager();
		Atendente atendente = new Atendente();
		try {
			atendente = factory.find(Atendente.class, id);
			return atendente;

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
		Atendente atendente = new Atendente();

		try {

			atendente = factory.find(Atendente.class, id);
			factory.getTransaction().begin();
			factory.remove(atendente);
			factory.getTransaction().commit();

		} catch (Exception e) {
			e.getMessage();
			this.factory.getTransaction().rollback();
		} finally {
			factory.close();
		}

		
	}

	public void update(Atendente atendente) throws Exception {

		this.factory = emf.createEntityManager();

		try {
			factory.getTransaction().begin();
			factory.merge(atendente);
			factory.getTransaction().commit();

		} catch (Exception e) {
			e.getMessage();
			this.factory.getTransaction().rollback();
		} finally {
			factory.close();
		}
		
	}

	public Collection<Atendente> listAll() throws Exception {

		this.factory = emf.createEntityManager();
		List<Atendente> atendente = new ArrayList<Atendente>();
		try {
			factory.getTransaction().begin();
			TypedQuery<Atendente> query = factory.createNamedQuery("Atendente.findAll", Atendente.class);
			atendente = query.getResultList();
			factory.getTransaction().commit();
//			
//			return this.factory.createQuery("SELECT c FROM Atendente c", Atendente.class).getResultList();

		} catch (Exception e) {
			e.getMessage();
			this.factory.getTransaction().rollback();
		} finally {
			factory.close();
		}

		return atendente;
		
	}
	
	
}
