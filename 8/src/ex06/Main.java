package ex06;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		ContactDAO contactDAO = new ContactDAO();
		Optional<Contact> result = contactDAO.searchByName("Leon");
		
		Contact contact = result.orElseThrow(IllegalArgumentException::new);
		System.out.println(contact.getName());
		
	}
	
	
	public static Contact createContact() {
		System.out.println("Created an object in memory");
		return new Contact("Fulano");
	}
	
}
