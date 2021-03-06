package ex01;

public class CellPhone {
	private String name;
	private String code;
	
	
	
	public CellPhone(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	
	// To hashCode:
	
	// a. If x.equals(y) == true, then y.hashCode() == x.hashCode();
	// b. If y.hashCode() == x.hashCode(), then no necessary are equal. 
	// c. When searching between 2 identical codes, one hour returns true
	// d. If x.equals(y) == false. Then hashCode() can be empty
	// e. y.hashCode() != x.hashCode(). Then equals() must be false
	
	@Override
	public int hashCode() {
		return code != null ? code.hashCode() : 1; // Or return 1; Because equals verify if are != null
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)  return false;
		if(this == obj) return true; // this = x and y = obj. Same memory address
		if(this.getClass() != obj.getClass()) return false; // a. Verify if class is the same of object
		
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
