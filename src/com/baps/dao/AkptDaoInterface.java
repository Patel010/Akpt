package com.baps.dao;

import com.baps.model.AkptBook;

public interface AkptDaoInterface {
	
	public AkptBook addBook (AkptBook akptmodel);
	public AkptBook findBook (int id);
	public AkptBook deleteBook (int id);
	public AkptBook updateBook (AkptBook akptmodel);
	

}
