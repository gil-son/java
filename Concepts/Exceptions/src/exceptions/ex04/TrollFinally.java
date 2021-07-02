package exceptions.ex04;

/*	'finally' is execute independent of result, but System.exit(0); will stop 
 * 	 the execution of system before 'finally' is executed 
 */

public class TrollFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numbers[] = {4, 8, 16, 32, 64, 128};
		int denominators[] = {2, 0, 8, 4, 0};
		
		
		for(int i=0 ; i < numbers.length; i++) {
			try {
				System.out.println(numbers[i]+" / "+denominators[i]+" = "+(numbers[i]/denominators[i]));
				System.exit(0);
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getLocalizedMessage());
				System.exit(0);
			}finally {
				System.out.println("This row is printed after the 'try' or 'catch'");
			}
		}
	}
}
