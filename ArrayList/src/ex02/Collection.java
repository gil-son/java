package ex02;

import java.util.ArrayList;

public class Collection {
	
	private static ArrayList<BookStore> listBooks = new ArrayList();

	
	// method GET
	public static ArrayList<BookStore> getListBooks() {
		return Collection.listBooks; // listBooks
	}

	
	
	// Add object to list
	static public void addBook( BookStore bs) {
		listBooks.add(bs);
	}
	
	// show all data of list object
	
	static public String showList() {
		String saida = "";
		
		//            bs to each item in listBooks
		for(BookStore bs : listBooks) {
			saida += bs.print();
		}
		
		
		return saida;
	}
	
	
	
}
