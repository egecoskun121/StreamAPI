import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		Book b1 = new Book("A",245,"Ege",LocalDate.of(2022, 1, 17));
		Book b2 = new Book("B",100,"Hazal",LocalDate.of(2022, 2, 1));
		Book b3 = new Book("C",50,"Cetin",LocalDate.of(2021, 3, 11));
		Book b4 = new Book("D",345,"Aytac",LocalDate.of(2025, 12, 13));
		Book b5 = new Book("E",20,"Efe",LocalDate.of(2027, 12, 10));
		Book b6 = new Book("F",260,"Yagiz",LocalDate.of(2021, 8, 28));
		Book b7 = new Book("G",500,"Dilan",LocalDate.of(2025, 7, 1));
		Book b8 = new Book("X",150,"Sinem",LocalDate.of(2028, 6, 8));
		Book b9 = new Book("Y",60,"Ulas",LocalDate.of(2021, 5, 19));
		Book b10 = new Book("Z",24,"Kekwait",LocalDate.of(2024, 1, 10));
		
		
		
		
		ArrayList<Book> books = new ArrayList<>();
	    books.add(b10);
	    books.add(b9);
	    books.add(b8);
	    books.add(b7);
	    books.add(b6);
	    books.add(b5);
	    books.add(b4);
	    books.add(b3);
	    books.add(b2);
	    books.add(b1);
	    Map<String,String> list = new HashMap<String,String>();
	    ArrayList<Book> booksOrdered=new ArrayList<>();
	    
	    
	    books.stream().forEach(b -> list.put(b.getBookName(), b.getAuthorName()));
	    books.stream().filter(b -> b.getBookPage()>100).forEach(b -> booksOrdered.add(b));
	    
	    
	    
	    for (Book book : booksOrdered) {
			System.out.println(book.getBookPage());
		}
	    System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
	    for (String i : list.keySet()) {
	    	  System.out.println("key: " + i + " value: " + list.get(i));
	    	}
	    
	    

	}

}
