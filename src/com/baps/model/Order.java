package com.baps.model;

import java.io.Serializable;
import java.util.List;

public class Order  {
	
	private List <AkptBook>  booksOrdered ;
	private Customer customer ;
	private boolean giftWarp ;
	
	
	public Order (){
		
		this.customer = new Customer() ;
		
	}
	
	
	
	
	public List<AkptBook> getBooksOrdered() {
		return booksOrdered;
	}
	public void setBooksOrdered(List<AkptBook> booksOrdered) {
		this.booksOrdered = booksOrdered;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customerDetails) {
		this.customer = customerDetails;
	}
	public boolean isGiftWarp() {
		return giftWarp;
	}
	public void setGiftWarp(boolean giftWarp) {
		this.giftWarp = giftWarp;
	}
	
	
	
	
	
	
	
	
	
	
	

}
