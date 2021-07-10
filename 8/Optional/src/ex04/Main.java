package ex04;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		ContactDAO contactDAO = new ContactDAO();
		Optional<Contact> result = contactDAO.searchByName("Leon");
		
		Contact contact = result.orElse(createContact());
		
		System.out.println(contact.getName());
		
	}
	
	
	/*  'or Else()' will create a new object independent if 'result' is an object, 
	 *  then the memory will accumulated * inutillited objects
	 */
	public static Contact createContact() {
		System.out.println("Created an object in memory");
		return new Contact("Fulano");
	}
	
}
