package com.lhyla.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.lhyla.crud.utils.SessionFactoryConfiguration;
import com.lhyla.entity.Employe;

public class UpdateEmploye {

	public Employe update(int id, String firstName, String lastName, String email) {

		SessionFactoryConfiguration sessionFactoryConfiguration = new SessionFactoryConfiguration();
		SessionFactory sessionFactory = sessionFactoryConfiguration.getConfiguredEmployeSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();
			
			Employe employe = session.get(Employe.class, id);
			
			employe.setFirstName(firstName);
			employe.setLastName(lastName);
			employe.setEmail(email);

			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

		return null;
	}
}
