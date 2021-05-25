package casting.ex01;

public class PrimitiveTypeCasting {
	
	public static void main( String [] args) {
		
		int x = 10; int y = 6; int z = 3;
		
		double a = 3; double b = 1.0; double c = x / y;
		
		System.out.println("\t\t\n---- Without Casting ----");
		
		System.out.println("\tInt type:\n");
		
	     System.out.println(" x = "+ x);
	     System.out.println(" y = "+ y);
	     System.out.println(" z = "+ z);
	     
	     System.out.println("\tDouble type:\n");
			
	     System.out.println(" a = "+ a);
	     System.out.println(" b = "+ b);
	     System.out.println(" c = "+ c);
		
	     System.out.println("\t\t\n---- With Casting ----");
	     
	     
	     System.out.println("Invalid Casting:");
	     /*
	      * First the operation is calculated and after returned a type int then the casting try 
	      * covert and "succeed", but the 1 int to double is 1.0. However we lost the float value
	      */
	     
	     c = (double) (x / y); 
	     System.out.println(" c = "+ c);
	     
	     /*
	      * First x is converted to double type and after return a double divided by int type, 
	      * then the casting operation occurs before of the result
	      */
	     
	     System.out.println("Convert int to double:");
	     c = (double) x / y;
	     System.out.println(" c = "+ c);
	     
	     // c = 1.66666666667
	     // h = 1 = (int) c 
	     
	     System.out.println("Convert double to int:");
	     int h = (int) c;
	     System.out.println(" h = "+ h);
	} 	
	
}
