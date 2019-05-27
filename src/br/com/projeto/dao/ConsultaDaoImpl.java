package br.com.projeto.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import br.com.projeto.modelo.Consulta;
import br.com.projeto.utils.JPAUtils;

public class ConsultaDaoImpl implements IConsultaDao{

	EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();
	EntityManager factory = null;
	
	public void save(Consulta consulta) throws Exception {
		this.factory = emf.createEntityManager();

		try {
			factory.getTransaction().begin();
			if (consulta.getId() == null) {
				factory.persist(consulta);
			} else {
				factory.merge(consulta);
			}
			factory.getTransaction().commit();

		} catch (Exception e) {
			e.getMessage();
			this.factory.getTransaction().rollback();
			
		} finally {
			factory.close();
		}
		
	}

	public Consulta findById(Long id) throws Exception {

		this.factory = emf.createEntityManager();
		Consulta consulta = new Consulta();
		try {
			consulta = factory.find(Consulta.class, id);
			return consulta;

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
		Consulta consulta = new Consulta();

		try {

			consulta = factory.find(Consulta.class, id);
			factory.getTransaction().begin();
			factory.remove(consulta);
			factory.getTransaction().commit();

		} catch (Exception e) {
			e.getMessage();
			this.factory.getTransaction().rollback();
		} finally {
			factory.close();
		}

		
	}

	public void update(Consulta consulta) throws Exception {

		this.factory = emf.createEntityManager();

		try {
			factory.getTransaction().begin();
			factory.merge(consulta);
			factory.getTransaction().commit();

		} catch (Exception e) {
			e.getMessage();
			this.factory.getTransaction().rollback();
		} finally {
			factory.close();
		}
		
	}

	public Collection<Consulta> listAll() throws Exception {

		this.factory = emf.createEntityManager();
		List<Consulta> consulta = new ArrayList<Consulta>();
		try {
			factory.getTransaction().begin();
			TypedQuery<Consulta> query = factory.createNamedQuery("Consulta.findAll", Consulta.class);
			consulta = query.getResultList();
			factory.getTransaction().commit();
//			
//			return this.factory.createQuery("SELECT c FROM Consulta c", Consulta.class).getResultList();

		} catch (Exception e) {
			e.getMessage();
			this.factory.getTransaction().rollback();
		} finally {
			factory.close();
		}

		return consulta;
		
	}

	

}
