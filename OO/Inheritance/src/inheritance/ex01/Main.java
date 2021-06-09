package inheritance.ex01;

public class Main {
	public static void main(String[] args) {
		
		
		Mother mother = new Mother("Brown","Medium","Medium","Dark Brown");
		System.out.println(mother.toString());
		
		mother.falar();
		System.out.println(mother.andar());
		
		
		Child child = new Child("Blue","Big","Small","Blonde");
		System.out.println(child.toString());
		
		child.falar();
		System.out.println(child.andar());
		System.out.println(child.dancar());
		
	}
}
