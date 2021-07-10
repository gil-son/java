package ex01;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		ContactDAO contactDAO = new ContactDAO();
		Optional<Contact> result = contactDAO.searchByName("Leon");
		
		// result.ifPresent(it ->System.out.println(it.getName()));
	
		result.ifPresent(it -> {
			// it.setName("Test");
			System.out.println(it.getName());
		});
	}
}
