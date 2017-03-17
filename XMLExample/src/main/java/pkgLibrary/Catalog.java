package pkgLibrary;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import pkgMain.BookException;

import pkgMain.XMLReader;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)


public class Catalog {

	@XmlAttribute
	int id;	
	
	@XmlElement(name="book")
	ArrayList<Book> books;
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	private Book GetBook(String id) throws BookException{
		Book b = null;
		try{
			for (Book a : books){
				if (b.getId().equals(id)){
					a = b;
				}
			}
		
			if (b==null){
				throw new BookException(id);
			}
		}
		catch(BookException e){
			System.out.println("Book not in Catalog");
		}
		return (b);
		
	}
	private ArrayList AddBook(Book b){
		try{
			for(Book a : books){
				if(b.getId()==a.getId()){
					throw new BookException(b.getId());	
				}
			}
		}
		catch (BookException e){
			System.out.println("Book already in Catalog");
		}
		books.add(b);
		return books;
	}

	
	


	
	
	
	
}
