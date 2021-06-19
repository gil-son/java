package managelistcars.ex01;

import java.util.Scanner;

public class ManageListCar {
	
	public static void main(String args[]) {
		
		int validation = 0;
		Scanner scanner = new Scanner(System.in);
		
		Scanner scannerString = new Scanner(System.in);
		Scanner scannerInt = new Scanner(System.in);
		
		
		
		do {
			
			System.out.println("\t\t Menu Options"
					+ "\n Choose a respective number:"
					+ "\n 1. To add a car to garage"
					+ "\n 2. To remove a car to garage"
					+ "\n 3. To show list of cars"
					+ "\n Any other number to exit");
			
			validation = scanner.nextInt();
			
			switch(validation) {
				case 1: 
					
					// Car car = new Car();
					
					System.out.println("Type the model of car:");
					String model;
					model = scannerString.nextLine();
					// car.setModel(model);
					
					System.out.println("Type the brand of car:");
					String brand;
					brand = scannerString.nextLine();
					// car.setBrand(brand);
					
					
					System.out.println("Type the year of car:");
					int year;
					year = scannerInt.nextInt();
					// car.setYear(year);
					
					System.out.println("Type the code of car:");
					int code;
					code = scannerInt.nextInt();
					// car.setCode(code);
					
					Car car = new Car(model, brand, year, code);
					
					// System.out.println(car.toString());
					
					Garage garage = new Garage();
					garage.addCar(car);
					
					System.out.println(" The car was Added "); break;
				
				
				
				case 2: System.out.println(" The car was Removed "); break;
				case 3: System.out.println(" Show List "); break;
				default: System.out.println(" See you later. Bye! ");break;
			}
			
			
			
		}while(validation >= 1 && validation <= 3);
		
		scannerString.close();
		scannerInt.close();
		scanner.close();
	}
}
