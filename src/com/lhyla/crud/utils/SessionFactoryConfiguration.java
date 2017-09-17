package com.lhyla.crud.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lhyla.entity.Employe;

public class SessionFactoryConfiguration {

	public SessionFactory getConfiguredEmployeSessionFactory() {
		return new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employe.class)
				.buildSessionFactory();
	}

}
