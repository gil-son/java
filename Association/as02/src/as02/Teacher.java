package as02;

public class Teacher {
	private String name;
	private String specialty;
	private Seminary seminary;
	
	
	
	public Teacher() {
		
	}
	
	public Teacher(String name, String specialty) {
		this.name = name;
		this.specialty = specialty;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public Seminary getSeminary() {
		return seminary;
	}

	public void setSeminary(Seminary seminary) {
		this.seminary = seminary;
	}
	
	
	
	
	
}
