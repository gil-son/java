package inheritance.ex01;

public class Child extends Mother {
	
	// M�todo construtor padr�o = atributos vazios
	// default constructor method = empty attributes
	
	public Child() {
		
	}

	// M�todo Construtor com atributos inicializados
	// constructor method with attributes initialized
	
	public Child(String olhos, String nariz, String boca, String cabelo) {
		super(olhos, nariz, boca, cabelo);
		
	}
	
	// Sobrescrevendo os m�todos comuns
	// Overriding common methods
	
	@Override
	public void falar() {
		System.out.println("\nChild is talking");
	}
	
	@Override
	public String andar() {
		return "\nChild is walking";
	}
	
	// M�todo exclusivo da filha
	// Daughter's exclusive method
	
	public String dancar() {
		return "Child is dancing";
	}
	
}
