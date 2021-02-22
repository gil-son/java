package as02;

public class Local {
	
	private String street;
	private String district;
	
	
	public Local() {
		
	}
	
	public Local(String street, String district) {
		this.street = street;
		this.district = district;
	}
	
	public void print() {
		System.out.println(
				"\n------------- Relatory of Local -------------\n"+
				"\nStreet:"+this.street+
				"\nDistrict: "+this.district
				);
	}
	
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
}
