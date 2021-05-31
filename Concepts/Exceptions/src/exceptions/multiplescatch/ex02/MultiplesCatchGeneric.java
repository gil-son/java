package exceptions.multiplescatch.ex02;

public class MultiplesCatchGeneric {

	public static void main(String[] args) {
		
		int numbers[] = {4, 8, 16, 32, 64, 128};
		int denominators[] = {2, 0, 8, 4, 0};
		
		
		for(int i=0 ; i < numbers.length; i++) {
			try {
				System.out.println(numbers[i]+" / "+denominators[i]+" = "+(numbers[i]/denominators[i]));
			}catch(ArithmeticException e) {
				System.out.println(e.getLocalizedMessage());
				
			// If I don't know the exception, use the Throwable, that is the super class about exception/errors
			
			// Because Throwable is Generic, must be use after others
			}catch(Throwable e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}
}
