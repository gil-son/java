package ex03;

public class Monitoring {

	public static void main(String[] args) {
		
		Ordered ord1 = new Ordered(1,"Item 1",100.00); 
		Ordered ord2 = new Ordered(2,"Item 2",200.00);
		
		Sales sal = new Sales();
		
		sal.addRegisterToList(ord1);
		sal.addRegisterToList(ord2);
		
		sal.showList();

	}

}
