package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import model.Aeroport;
import util.Context;

public class DaoAeroportJpaImpl implements DaoAeroport {

	@Override
	public void create(Aeroport obj) {
		EntityManager em = Context.getIntsance().getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.persist(obj);
			tx.commit();
		} catch (Exception e) {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			if (em != null && em.isOpen()) {
				em.close();
			}
		}

	}

	@Override
	public Aeroport findByKey(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aeroport update(Aeroport obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Aeroport obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByKey(Integer key) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Aeroport> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
