package com.baps.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
import com.baps.model.AkptBook;
import com.baps.model.AkptUser;

public class AkptUserDao {
	
	
	public AkptUser addUser (AkptUser akptuser) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		org.hibernate.service.ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(akptuser);
		session.getTransaction().commit();
		session.close();
		return akptuser;
	}


	public AkptUser deleteUser(String un) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		org.hibernate.service.ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		session = sessionFactory.openSession();
		session.beginTransaction();
		AkptUser akptuser = (AkptUser)session.load(AkptBook.class, un);
		session.delete(akptuser);
		session.getTransaction().commit();
		session.close();
		return akptuser;
	}
	
	public AkptUser find (String un) {

		Configuration configuration = new Configuration();
		configuration.configure();
		org.hibernate.service.ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		session = sessionFactory.openSession();
		session.beginTransaction();
		AkptUser akptuser = (AkptUser) session.get(AkptUser.class, un);

		return akptuser;
	}



}
