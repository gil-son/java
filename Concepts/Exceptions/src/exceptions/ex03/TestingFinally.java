package exceptions.ex03;
//	'finally' is execute independent of result

public class TestingFinally {

	public static void main(String[] args) {
		
		
		
		int numbers[] = {4, 8, 16, 32, 64, 128};
		int denominators[] = {2, 0, 8, 4, 0};
		
		
		for(int i=0 ; i < numbers.length; i++) {
			try {
				System.out.println(numbers[i]+" / "+denominators[i]+" = "+(numbers[i]/denominators[i]));
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getLocalizedMessage());
			}finally {
				System.out.println("This row is printed after the 'try' or 'catch'");
			}
		}
	}
}
