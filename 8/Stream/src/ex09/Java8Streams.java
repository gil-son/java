package ex09;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Streams {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,4,6,7,8,9);
		
		Person p1 = new Person("aaa",15); 
		Person p2 = new Person("bbb",18); 
		Person p3 = new Person("ccc",20);
		
		List<Person> listPerson = new ArrayList<>();
		
		listPerson.add(p1);
		listPerson.add(p2);
		listPerson.add(p3);
		
		// Java 8
		
		listPerson.stream()
		.filter(e -> e.getAge() % 3 == 0)
		.forEach(l -> System.out.println(l.getName()));
			
		
			
		/*
		for(int i = 0 ; i < listPerson.size(); i++) {
			System.out.println(listPerson.get(i).getName());
		}
		*/
			
	}
	
}

 class Person{
	
	private String name;
	private int age;
	 
	public Person() {}
	 
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
}
 
 
 class ListPerson{
	 
	 private List<Person> listPersons = new ArrayList<>();
	 
 }
 