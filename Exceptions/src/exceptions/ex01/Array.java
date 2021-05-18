package exceptions.ex01;

public class Array {

	public static void main(String [] args) {
		// tamanho 4 de 0 at� 3, ou seja, � n-1 |0|1|2|3|
		
		System.out.println("\t\tIn�cio");
		
			try {
				int[] vetor = new int[4];
				
				vetor[4] = 1;
				
				System.out.println("Essa parte n�o aparecer�");
			
			}catch(ArrayIndexOutOfBoundsException objetoErro ) {
				
				System.out.println("\nEssa parte aparece. O Erro ser� tratado daqui pra frente!");
				
				System.out.println(objetoErro.getMessage());
				
			}
	}
}
