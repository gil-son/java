package as02;

public class Student {
	private String name;
	private int age;
	private Seminary seminary;
	
	public Student() {
		
	}
	
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public void print() {
		System.out.println(
				"\n------------- Relatory of Students -------------\n"+
				"\nName: "+this.name+
				"\nAge: "+this.age);
		
		if(this.seminary == null)
			System.out.println("Student not subscribed in the seminary ");
		else					
			System.out.println("Seminary subscribed: "+this.seminary.getTitle());
			
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public Seminary getSeminary() {
		return seminary;
	}

	public void setSeminary(Seminary seminary) {
		this.seminary = seminary;
	}
	
	
}
