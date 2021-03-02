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
		int i = 1;
		//            bs to each item in listBooks
		for(BookStore bs : listBooks) {
			saida += "\n ===== LIVRO Nº "+ (i++) +" =====\n" + bs.print()+"\n";
		}
		
		
		return saida;
	}
	
	// Research how many books exist there by genre
	static public int search(String genre) {
		int amount = 0;
		//            bs to each item in listBooks
		for(BookStore bs : listBooks ) {
			if(bs.getGenre().equalsIgnoreCase(genre)) {
				amount++;
			}
		}
		
		return amount;
	}
	
	// Research how many prices between value insert exist there (Overload)
	
	static public int search(double initialPrice, double finalPrice) {
		int amount = 0 ;
		
		for(BookStore bs : listBooks) {
			if(bs.getPrice() >= initialPrice && bs.getPrice() <= finalPrice ) {
				amount++;
			}
		}
		
		return amount;
	}
	
	// Remove object/book by title
	
	static public boolean remover(String title) {
		for(BookStore bs : listBooks) {
			if(bs.getTitle().equalsIgnoreCase(title)) {
				listBooks.remove(bs);
				return true;
			}
		}
		return false;
		
	}
	
	
	// Total price 
	static double calculateTotalCollection() {
		double total = 0;
		for(BookStore bs : listBooks) {
			total += bs.getPrice();
		}
		
		return total;
		
	}
}
