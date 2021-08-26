package ex01;

public class GenericsMain {

	public static void main(String[] args) {
	
		Generics<String> hw = new Generics("Hello","World");
		System.out.println(hw.getFirst()+" "+hw.getSecond()+"!!");
		
		Generics<Integer> nu = new Generics(1,2);
		System.out.println(nu.getFirst()+nu.getSecond());
		
	}

}
