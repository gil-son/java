package as02;

public class Student {
	private String name;
	private int idade;
	private Seminary seminary;
	
	public Student() {
		
	}
	
	public Student(String name, int idade) {
		this.name = name;
		this.idade = idade;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
