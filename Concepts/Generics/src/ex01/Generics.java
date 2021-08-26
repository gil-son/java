package ex01;


public class Generics<T> {

	private T first;
	private T second;
	
	 Generics(T first, T second) {
		this.first = first;
		this.second = second; 
	}
	
	public T getFirst() {
		return first;
	}
	
	public T getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return "Generics [first=" + first + ", second=" + second + "]";
	}

}
