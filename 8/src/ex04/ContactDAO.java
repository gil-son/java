package ex04;

import java.util.Optional;


public class ContactDAO {

	public Optional<Contact> searchByName(String name) {
		return Optional.ofNullable(new Contact(name));
	}
}
