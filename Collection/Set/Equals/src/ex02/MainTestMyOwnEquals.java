package ex02;

public class MainTestMyOwnEquals {

	public static void main(String[] args) {
		/* Well, a variable when compared to the object, returns false, because it has different memory
		 * In this case, you will use your own 'equals' creation method to revert it
		 * 
		 */

		CellPhone c1 = new CellPhone("LG","123");
		CellPhone c2 = new CellPhone("LG","123");
		
		
		System.out.println(c1 == c2);
		
		System.out.println(c1.equals(c2));
		
	}

}
