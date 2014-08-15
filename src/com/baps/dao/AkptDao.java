package com.baps.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Component;

import com.baps.model.AkptBook;
import com.baps.model.AkptModel;

@Component
public class AkptDao {
	
	public AkptModel addBookCollection(AkptBook akptbook) {
		AkptModel akptmodelC = new AkptModel();
		akptmodelC.getListofbooks().add(akptbook);
		
		Configuration configuration = new Configuration();
		configuration.configure();
		org.hibernate.service.ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(akptbook);
		session.getTransaction().commit();
		session.close();
		return akptmodelC;
	}
	
	public List<AkptBook> showallBooks() {
		
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
		
		Criteria criteria = session.createCriteria(AkptBook.class);
		List <AkptBook> akptbookSetArray = (List <AkptBook>) criteria.list();
		session.getTransaction().commit();
		session.close();
		return akptbookSetArray ;
	}
	
	public List<AkptBook> findByPrise(long min, long max) {
		
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
		
		Criteria criteria = session.createCriteria(AkptBook.class);
		criteria.add(Restrictions.between("bookPrice", min, max));
		List <AkptBook> akptbookSetArray = (List <AkptBook>) criteria.list();
		session.getTransaction().commit();
		session.close();
		return akptbookSetArray ;
	}
	
	public AkptBook updateBook(AkptBook book) {

		Configuration configuration = new Configuration();
		configuration.configure();
		org.hibernate.service.ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
        session.saveOrUpdate(book);
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
		session.close();
		return book;

	}
	
	public AkptBook findBook(int id) {

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
		AkptBook akptbook = (AkptBook) session.get(AkptBook.class, id);
		session.getTransaction().commit();
		session.close();
		return akptbook;
	}
	
	public AkptBook delete (int id){
		
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
		AkptBook akptbook = (AkptBook) session.get(AkptBook.class, id);
		session.delete(akptbook);
		session.getTransaction().commit();
		session.close();
		return akptbook;
		
		
	}

}
