package com.baps.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.baps.dao.AkptDao;
import com.baps.model.AkptBook;
import com.baps.model.AkptModel;

@Component
public class AkptService {
	
	@Autowired
	AkptDao akptdao ;
	
	public AkptModel saveCollection (AkptBook akptbookS){
		
		 akptdao.addBookCollection(akptbookS);
		 return null;
	}
	
	public List<AkptBook> showAllBooks (){
		
		List <AkptBook> akptbookSetArray = akptdao.showallBooks();
		return akptbookSetArray;
	}
	
	public List<AkptBook> findByPrise (long min, long max){
		
		List <AkptBook> akptbookSetArray =akptdao.findByPrise(min, max);
		return akptbookSetArray;
		
	}
	
	public AkptBook updateBook (AkptBook book) {
		
		AkptBook updatedBook = akptdao.updateBook(book);
		return updatedBook;
	}

	public AkptBook findBook (int id){
		
		AkptBook akptbook = akptdao.findBook(id);
		return akptbook;
	}
	
	public AkptBook delete (int id){
		
		AkptBook akptbook = akptdao.delete(id);
		return akptbook;
	}
}
