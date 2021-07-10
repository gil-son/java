package ex03;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		ContactDAO contactDAO = new ContactDAO();
		Optional<Contact> result = contactDAO.searchByName("Leon");
		
		Contact contact = result.orElse(new Contact("Fulano"));
		
		System.out.println(contact.getName());
		
	}
}
