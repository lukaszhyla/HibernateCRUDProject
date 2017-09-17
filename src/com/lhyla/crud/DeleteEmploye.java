package com.lhyla.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteEmploye {

	public void delete(int id) {

		SessionFactoryConfiguration sessionFactoryConfiguration = new SessionFactoryConfiguration();
		SessionFactory sessionFactory = sessionFactoryConfiguration.getConfiguredEmployeSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();
			
			session.createQuery("DELETE FROM Employe WHERE id=" + id).executeUpdate();
			
			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}
	}
}
