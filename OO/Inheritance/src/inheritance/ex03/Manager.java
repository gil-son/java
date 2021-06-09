package inheritance.ex03;

public class Manager extends Person{

	boolean estrategy;
	
	public Manager() {
		
	}
	
	public Manager(String name, double height, double weight, double salary, boolean estrategy) {
		/* super(); não funciona, pois não há método construtor na classe acima (Super Classe)
		 * Isso porque a classe acima é abstrata e não cria objeto
		 */
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.salary = salary;
		this.estrategy = estrategy;
	}

	
	@Override
	public void speak() {
		
	}

	@Override
	public void salaryBonus() {
		 bonus = 0.5 * salary;
		 System.out.println("\n\t Bonus\n Salary: "+salary+ "\n The bonus is 50%, then : "+bonus+"\n Total: "+(salary+bonus));
	}

	@Override
	public String toString() {
		
		return "\n\n\t\t Data Register \n Name: "+name
										 +"\n Height: "+height
										 +"\n Weight: "+weight
										 +"\n Salary: "+salary
										 +"\n Estrategy: "+estrategy;
				
	}
	
	
}
