package inheritance.ex03;

/*
 * Classe Abstrata
 * 
 * É uma classe de modelo para outras classes
 * Permite atributos internos
 * Seus métodos também devem ser abstratos
 * 
 * Atenção:
 * 
 * Não é possível criar um objeto a partir da classe abstrata
 * 
 */

public abstract class Person { 

	protected String name;
	protected double height;
	protected double weight;
	protected double salary;
	protected double bonus;
	
	public abstract void speak();
	
	public abstract void salaryBonus();
	
	
}



