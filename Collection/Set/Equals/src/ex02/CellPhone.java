package ex02;

public class CellPhone {
	private String name;
	private String code;
	
	
	
	
	public CellPhone(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	
	
	// Equals:
	
	// Reflexive = x.equals(x) should be true for everything that is different of 'null'
	// Symmetric to 'x' and 'y' differents of 'null', if x.equals(y) == true, then y.equals(x) is true 
	// Transitivity, x, y and z are differents of 'null', and if x.equals(y) == true, and y.equals(z) == true, then z.equals(x) == true
	// Consistent: x.equals(y) should return ever the same value
	// For 'x' other than 'null' x.equals(null) must return false
	// Equals is override
	
	// Create my own 'equals'
	@Override
	public boolean equals(Object obj) {
		if(obj == null)  return false;
		if(this == obj) return true; // this = x and y = obj. Same memory address
		if(this.getClass() != obj.getClass()) return false; // Verify if class is the same of object
		
		// After these checks
		CellPhone othercellphone = (CellPhone) obj;
		
		// 						   This equals are native, can use because 'code' is String
		return code != null && code.equals(othercellphone.getCode());  // or return code != null ? code.equals(othercellphone.getCode()) : false;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setIMEI(String code) {
		this.code = code;
	}
	
	
	
}
