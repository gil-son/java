package inheritance.ex03;

public class Employee extends Person{

	String job;
	
	public Employee() {
		// inheritance
	}
	
	public Employee(String name, double height, double weight, double salary, String job) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.salary = salary;
		this.job = job;
	}
	
	@Override
	public void speak() {
		System.out.println("Employee is speaking");
	}

	@Override
	public void salaryBonus() {
		bonus = 0.25 * salary;
		System.out.println("\n\t Bonus\n Salary: "+salary+ "\n The bonus is 25%, then : "+bonus+"\n Total: "+(salary+bonus));
	}
	
	@Override
	public String toString() {
		
		return "\n\n\t\t Data Register \n Name: "+name
										 +"\n Height: "+height
										 +"\n Weight: "+weight
										 +"\n Salary: "+salary
										 +"\n Job: "+job;	
	}
}
