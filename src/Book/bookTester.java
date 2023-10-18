package Book;
import java.util.*;

public class bookTester {
	public static void main(String[] args) {
		Book b = new Book();
		
		Book b1 = new Book(123, "OOP with C++", "Rajesh", 700);
		b1.display();
		
		Book b2 = new Book();
		Scanner sc =  new Scanner(System.in);
		String bnm, auth;
		int id;
		double price;
		
		System.out.println("Enter Book id.: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Book name: ");
		bnm = sc.nextLine();
		System.out.println("Enter Author: ");
		auth = sc.nextLine();
		System.out.println("Enter Price: ");
		price = sc.nextDouble();
		
		b2.setID(id);
		b2.setBname(bnm);
		b2.setAuthor(auth);
		b2.setPrice(price);
		
		System.out.println("Book id.: "+ b2.getID(id));
		System.out.println("Book name: "+ b2.getBname(bnm));
		System.out.println("Author: "+ b2.getAuthor(auth));
		System.out.println("Price: "+ b2.getPrice(price));
	
	}
}
