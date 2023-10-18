/*3. Create a class Book with data members as bname,id,author,price. Write getters and setters for all the 
data members. Also add the display function. Create Default and Parameterized constructors. Create 
the object of this class in main method and invoke all the methods in that class. */
package Book;


public class Book {
	private String bname, author;
	private int id; 
	private double price;
	
	public Book() {
		System.out.println("This is the default constructor.");
	}
	public Book(int id, String bname, String author, double price) {
		this.id = id;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getID(int id) {
		return id;
	}
	public String getBname(String bname) {
		return bname;
	}
	public String getAuthor(String author) {
		return author;
	}
	public double getPrice(double price) {
		return price;
	}
	
	public void display() {
		System.out.println("Book id.: "+ id);
		System.out.println("Book name: "+ bname);
		System.out.println("Author: "+ author);
		System.out.println("Price: "+ price);
	}
	
}
