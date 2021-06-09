package inheritance.ex03;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Cloud",1.75,70,1000,"Typer");
		
		System.out.println(employee.toString());
		employee.salaryBonus();
		
		
		Manager manager = new Manager("Alexia",1.60,58,3000,true);
		
		System.out.println(manager.toString());
		manager.salaryBonus();
	}

}
