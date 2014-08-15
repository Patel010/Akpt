package com.baps.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table (name="akptBook")
public class AkptBook {

	@Id
	@GeneratedValue
	private int bookId;
	
	@NotEmpty (message="Come on !! specify the book name !!")
	@Size (min=2,max=10, message="Must be between 2 and 10 char.")
	private String bookName;
	
	@NotNull (message="Nice try!! But book is not free !")
	private long bookPrice;
	
	@NotEmpty (message="Come on !! Who wrote it ?!?!")
	@Size (min=2,max=10, message="Must be between 2 and 10 char.")
	private String bookAuthor;
	
	private String bookDescription;
	
	@NotEmpty(message="Come on !! What type ?!?!")
	@Size (min=2,max=10, message="Must be between 2 and 10 char.")
	private String bookType ;
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public long getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(long bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	
}
