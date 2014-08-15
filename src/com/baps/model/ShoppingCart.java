package com.baps.model;

import java.util.ArrayList;
import java.util.List;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // to make this "ShoppingCart" class's bean, so we dont have	to declare bean of this class in "Aksharpith-servlet.xml"*/
@Scope ("session")
public class ShoppingCart {
	
	private  List <AkptBook> shopping = new ArrayList <AkptBook> ();
	
	public void addItem (AkptBook newItem){
		
		this.shopping.add(newItem);
	}

	public List <AkptBook> getAllCartItem (){
		
		return shopping;
	}
	
	public void clear (){
		
		this.shopping.clear();
	}
}
