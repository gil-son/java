package as02;

public class Teacher {
	private String name;
	private String specialty;
	private Seminary[] seminarys; // You can create an array from the Seminary class
	
	
	
	public Teacher() {
		
	}
	
	public Teacher(String name, String specialty) {
		this.name = name;
		this.specialty = specialty;
	}
	
	public void print() {
		System.out.println(
				"\n------------- Relatory of Teacher -------------\n"+
				"Name of teacher: "+this.name+
				"\nSpecialty: "+this.specialty+
				"\nSeminarys: "
				);
		
		for(Seminary sem : seminarys ) {
			System.out.print(sem.getTitle());
		}
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

	public Seminary[] getSeminarys() {
		return seminarys;
	}

	public void setSeminarys(Seminary[] seminarys) { // Receive an array of object
		this.seminarys = seminarys;
	}

	
}
