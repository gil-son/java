package ex02;
import java.util.Scanner;

public class AppBookStoreArrayListStatic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
	
		int menu = 0;
		double initialPrice, finalPrice;
		
		// Reference classe BookStore
		BookStore objBook;
		
		String title, author, genre;
		float price;
		int code;
		
		
		do {
			showMenu();
			menu = input.nextInt();
			
			switch(menu) {
				// Register Book
				case 1: 
					System.out.println("===== Register Book =====");
					System.out.println("Type the title:");
					title = inputString.nextLine();
					System.out.println("Type the author:");
					author = inputString.nextLine();
					System.out.println("Type the genre:");
					genre = inputString.nextLine();
					System.out.println("Type the code:");
					code = input.nextInt();
					System.out.println("Type the price:");
					price = input.nextFloat();
					
					// Initial object
					objBook = new BookStore(title, author, code, genre, price);
					
					// Record in Arraylist 
					Collection.addBook(objBook); // Because it is static, no instance is required

					
					;break;
				case 2: 
					System.out.println("===== List Book =====");
					System.out.println(Collection.showList());
					;break;
				case 3: 
					System.out.println("===== Remove Book =====");
					System.out.println("Type the title:");
					title = inputString.nextLine();
					
					
					if(!(Collection.getListBooks().isEmpty())) {
						System.out.println("There are books");
						
						if(Collection.remover(title)) {
							System.out.println("The book has been removed!");
						}else {
							System.out.println("But there is no such title.");
						}
						
					}else {
						System.out.println("There are no books");
					}
					
					;break;
				case 4: 
					System.out.println("===== Search for genre =====");
					System.out.println("Type the genre:");
					genre = inputString.nextLine();
					System.out.println("There are "+Collection.search(genre)+" genre(s)!");
					
					;break;
				case 5: 
					System.out.println("===== Search by price range =====");
					System.out.println("Type the inital price and final:");
					initialPrice = inputString.nextDouble();
					finalPrice = inputString.nextDouble();
					
					System.out.println("There are "+Collection.search(initialPrice, finalPrice)+
							" bettween "+String.format("$ %.2f and $ %.2f",initialPrice, finalPrice));
					;break;
				case 6: 
					System.out.println("===== Total ====="+
					"\nIs:"+String.format("$ %.2f",Collection.calculateTotalCollection()));
					;break;
				case 7: 
					System.out.println("Exiting...");
					;break;
				default: System.out.println("Invalid Option!"); ;
			}
			
		}while(menu != 7);
		
		
	} // End main

	static void showMenu() {
		System.out.println(
				"============== BOOK STORE =============="+
				"\n 1 - Register Book"+
				"\n 2 - List Book "+
				"\n 3 - Remove Book"+
				"\n 4 - Search for genre"+
				"\n 5 - Search by price range"+
				"\n 6 - Calculate the total of the collection"+
				"\n 7 - Exit"+
				"\n Choose an option"
				);
	}
}
