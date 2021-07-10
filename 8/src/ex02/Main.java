package ex02;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		ContactDAO contactDAO = new ContactDAO();
		Optional<Contact> result = contactDAO.searchByName("Leon");
		
		if(result.isPresent()) {
			Contact contact = result.get(); // Received an object | Declarative code
			contact.setName("Test");
			System.out.println(contact.getName()); 
			System.out.println(result.get().getName()); // Imperative code
		}
	}
}
