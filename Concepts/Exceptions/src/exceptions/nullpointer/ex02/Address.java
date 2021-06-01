package exceptions.nullpointer.ex02;

public class Address {
	public String street;
	public String locality;
	
	public Address(String street, String locality) {
		this.street = street;
		this.locality = locality;
	}
	
	public String getAllAddress() {
		return street + ", "+locality;
	}
	
	
	
	
	
	
}

