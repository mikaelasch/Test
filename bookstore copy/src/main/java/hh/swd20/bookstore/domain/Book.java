package hh.swd20.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String author;
	private String year;
	private String isbn;
	private String price;
	
	public Book() {
		
		this.title = null;
		this.author = null;
		this.year = null;
		this.isbn = null;
		this.price = null;
		
	}
	
	public Book (String title, String author, String string, String string2, String string3) {
		this.title = title;
		this.author = author;
		this.year = string;
		this.isbn = string2;
		this.price = string3;
		
	}
	public void setId (Long id) {
		this.id = id;
	}
	
	public void setTitle (String title) {
		this.title = title;
		
	}
	
	public void setAuthor (String author) {
		this.author = author;
		
	}
	
	public void setYear (String year) {
		this.year = year;
		
	}
	
	public void setIsbn (String isbn) {
		this.isbn = isbn;
		
	}
	
	public void setPrice (String price) {
		this.price = price;
		
	}
	public Long getId() {
		return id;
	
	}
	
	public String getTitle() {
		return title;
		
	}
	
	public String getAuthor() {
		return author;
		
	}
	
	public String getYear() {
		return year;
		
	}
	
	public String getIsbn() {
		return isbn;
		
	}
	
	public String getPrice() {
		return price;
	}
	
	
	
	
	
}
