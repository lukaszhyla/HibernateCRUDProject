package com.lhyla.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.lhyla.entity.Employe;

public class AddEmploye {

	public void addEmploye(String firstName, String lastName, String email) {

		System.out.println("AddEmploye addEmploye()");
		SessionFactory sessionFactory = new SessionFactoryConfiguration().getConfiguredEmployeSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();
			System.out.println("AddEmploye addEmploye() session.beginTransaction()");
			
			session.save(new Employe(firstName, lastName, email));
			
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
