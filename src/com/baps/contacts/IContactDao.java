package com.baps.contacts;

import java.util.List;

public interface IContactDao {
	
	void save(ContactModel contactModel);
	List<ContactModel> findAll();
	ContactModel findByName(String firstName, String lastName);
	List<ContactModel> findByFirstName(String firstName);
	

}
