package com.baps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.baps.model.ShoppingCart;
import com.baps.model.AkptBook;
import com.baps.service.AkptService;

@Controller
@Scope ("request")
public class CartManagmentController {

	@Autowired
	private AkptService akptservice;
	
	@Autowired // because we have @Component tag on ShoppingCart class, so we have Bean of that class available to autovire here.
	 private ShoppingCart shoppingcart;
	
	@RequestMapping ("/addToCart")
	public ModelAndView addToCart (@RequestParam ("id")int id){
		
	AkptBook booksById = akptservice.findBook(id);
	shoppingcart.addItem(booksById);
	return new ModelAndView ("/book-added-to-cart", "title", booksById.getBookName());
		
	}
	
	@RequestMapping ("/viewCart")
	public ModelAndView viewCart (){
		
		List <AkptBook> cart = shoppingcart.getAllCartItem();
		
		return new ModelAndView ("view-cart", "cart" , cart);
	}
	
}
