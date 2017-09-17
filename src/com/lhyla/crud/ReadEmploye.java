package com.lhyla.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.lhyla.entity.Employe;

public class ReadEmploye {

	public Employe readEmploye(int id) {
		
		SessionFactoryConfiguration sessionFactoryConfiguration = new SessionFactoryConfiguration();
		SessionFactory sessionFactory = sessionFactoryConfiguration.getConfiguredEmployeSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Employe employe;
		try{
			session.beginTransaction();
			
			employe = session.get(Employe.class, id);
			
			session.getTransaction().commit();
		} 
		finally{
			sessionFactory.close();
		}
		

		return employe;
	}
}
