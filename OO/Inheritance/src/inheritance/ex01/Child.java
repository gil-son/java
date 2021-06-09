package inheritance.ex01;

public class Child extends Mother {
	
	// Método construtor padrão = atributos vazios
	// default constructor method = empty attributes
	
	public Child() {
		
	}

	// Método Construtor com atributos inicializados
	// constructor method with attributes initialized
	
	public Child(String olhos, String nariz, String boca, String cabelo) {
		super(olhos, nariz, boca, cabelo);
		
	}
	
	// Sobrescrevendo os métodos comuns
	// Overriding common methods
	
	@Override
	public void falar() {
		System.out.println("\nChild is talking");
	}
	
	@Override
	public String andar() {
		return "\nChild is walking";
	}
	
	// Método exclusivo da filha
	// Daughter's exclusive method
	
	public String dancar() {
		return "Child is dancing";
	}
	
}
