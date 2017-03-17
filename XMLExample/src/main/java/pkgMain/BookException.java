package pkgMain;

import pkgLibrary.Book;

public class BookException extends Exception{
	private String id;
	private Book b;
	
	
	public BookException(String id){
		super();
		this.id = id;
		b = new Book(id);
	}
	public String getiD() {
		return id;
	}
	public Book getb(){
		return b;
	}
}
