package com.baps.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="akptModel")
public class AkptModel {
	
	@Id
	@GeneratedValue
	private int ID ;
	@ElementCollection
	private Set <AkptBook> listofbooks = new HashSet ();

	public Set<AkptBook> getListofbooks() {
		return listofbooks;
	}

	public void setListofbooks(Set<AkptBook> listofbooks) {
		this.listofbooks = listofbooks;
	}
	
	
}
