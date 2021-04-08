package ex02;
// https://angeliski.com.br/2014/01/05/equals-e-hashcode/#:~:text=O%20hashCode%20%C3%A9%20uma%20ferramenta,de%20hash%20de%20modo%20correto.
public class Person {
	
	 private String name;
	 private String lastName;
	 private String age;
	
	 
	 
	 
	 
	 public Person(String name, String lastName, String age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}


	/* How can we define that two people are "significantly equal"? 
	  * Let's say that everyone with the same name and the same age is the same,
	  * modifying our class it looks like this:
	  */
	 
	 @Override // overwrite sobrescreveu/reescreveu o método em sua composição original
	 public boolean equals(Object obj) {
		 if(obj == null) return false;
		 if(!(obj instanceof Person)) return false;
		 
		 Person other = (Person) obj;
		 if(!this.lastName.equals(other.name) || !this.age.contentEquals(other.age))
			 return false;
		 return true;
		 
	 }
	 
	 
	 public static void main( String []args) {
		 Person p1 = new Person("Aaa","Aaa-of-a","10");  
		 Person p2 = new Person("Bbb","Bbb-of-b","20");
		 Person p3 = new Person("Aaa","Aaa-of-a","10");
		 
		 
		 System.out.printf("p1.equals(p2)? %s\n",p1.equals(p2));
		 System.out.printf("p1.equals(p3)? %s\n",p1.equals(p3));
	 }
}
