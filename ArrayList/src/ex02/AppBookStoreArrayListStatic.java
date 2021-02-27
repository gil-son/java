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
					
					System.out.println("Type the title:");
					title = inputString.nextLine();
					System.out.println("Type the autrhor:");
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
					;break;
				case 3: 
					;break;
				case 4: 
					;break;
				case 5: 
					;break;
				case 6: 
					;break;
				case 7: 
					;break;
				default: System.out.println("Opção do menu inválida!"); ;
			}
			
		}while(menu != 7);
		
		
	} // End main

	static void showMenu() {
		System.out.println(
				"============== BOOK STORE =============="+
				"\n 1 - Register"+
				"\n 2 - List "+
				"\n 3 - Delete"+
				"\n 4 - Search for genre"+
				"\n 5 - Search by price range"+
				"\n 6 - Calculate the total of the collection"+
				"\n 7 - Exit"+
				"\n Choose an option"
				);
	}
}
