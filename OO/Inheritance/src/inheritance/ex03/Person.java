package inheritance.ex03;

/*
 * Classe Abstrata
 * 
 * � uma classe de modelo para outras classes
 * Permite atributos internos
 * Seus m�todos tamb�m devem ser abstratos
 * 
 * Aten��o:
 * 
 * N�o � poss�vel criar um objeto a partir da classe abstrata
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



