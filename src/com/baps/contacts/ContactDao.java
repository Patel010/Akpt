package com.baps.contacts;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class ContactDao implements IContactDao{

	@Override
	public void save(ContactModel contactModel) {
//		ContactModel contactModel1 = new ContactModel(); 
//		contactModel1.set
		Configuration configuration = new Configuration();
		configuration.configure();
		org.hibernate.service.ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(contactModel);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<ContactModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContactModel findByName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ContactModel> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

}
