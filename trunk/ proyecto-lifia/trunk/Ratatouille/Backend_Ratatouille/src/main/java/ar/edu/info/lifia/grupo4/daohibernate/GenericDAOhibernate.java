package ar.edu.info.lifia.grupo4.daohibernate;

import ar.edu.info.lifia.grupo4.dao.GenericDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class GenericDAOhibernate implements GenericDAO {
	
	private SessionFactory sessionFactory;

	public void save(Object o) {
		Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(o);
        tx.commit();
        session.close();

	}

	public void delete(Object o) {
		// TODO Auto-generated method stub

	}

	public void update(Object o) {
		// TODO Auto-generated method stub

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
