package ex03;
// https://www.youtube.com/watch?v=mtdUbmp7uec&t=555s
public class Person {
	private String firstName;
	private String lastName;
	private int code;
	
	public Person(String firstName, String lastName, int code) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.code = code;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getCode() {
		return code;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Person)) return false;
		Person other = (Person) obj; 
		
		//System.out.println(other.getFirstName());
		//System.out.println(((Person) obj).getFirstName());
		
		return	this.firstName.equalsIgnoreCase(other.getFirstName()) &&
				this.lastName.equalsIgnoreCase(other.getLastName()) &&
				this.code == other.getCode();
	}
	
	
	
	public static void main(String[] args) {
		Person p1 = new Person("Aaa","of A",1);
		Person p2 = new Person("Bbb","of B",2);
		Person p3 = new Person("Aaa","of A",1);
		
		System.out.printf("p1 == p2? %s%n",p1==p2); // Objects are distinct in space Heap
		System.out.printf("p1.equals(p2) %s%n",p1.equals(p2));
		
		
		System.out.printf("p1 == p3? %s%n",p1==p3);
		System.out.printf("p1.equals(p3) %s%n",p1.equals(p3));
		
		
		
	}
	
	
	
}
