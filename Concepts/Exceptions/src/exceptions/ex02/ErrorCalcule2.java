package exceptions.ex02;

import java.util.Scanner;

public class ErrorCalcule2 {
	/* Tratamento do ArithmeticException
	 * 
	 *  dividendo / divisor
	 *         2  /   2    =       1
	 * 
	 *        2   /   0    = infinito ou indeterminado
	 */
	public static void main(String [] args) {
		
		System.out.println("\t\t Divisor de n�meros");
		
		int dividendo;
		int divisor;
		int verificador = 1;
		
		Scanner entradaTipoInteiro = new Scanner(System.in); 
		
		while(verificador == 1) {
			try {
				
				System.out.print("\nDigite o dividendo:");
				dividendo = entradaTipoInteiro.nextInt();
				
				System.out.print("\nDigite o divisor:");
				divisor = entradaTipoInteiro.nextInt();
				
				System.out.println("\n"+dividendo+" / "+divisor+" = "+(dividendo/divisor));
				
				System.out.print("\n Deseja continuar com a divis�o?"
						+ "\n Caso sim, digite 1"
						+ "\n Caso n�o, digite qualquer n�mero:");
				
				verificador = entradaTipoInteiro.nextInt();
				
			}catch(ArithmeticException erro) {
				
				System.out.print("\n Mensagem de Erro"+erro.getMessage());
				System.out.print("\n Ops! Zero n�o pode ser o divisor! Por gentileza tente novamente!");
			
				System.out.print("\n Vamos repetir o processo. Fa�a com aten��o :D");
				
				System.out.print("\nDigite o dividendo:");
				dividendo = entradaTipoInteiro.nextInt();
				
				System.out.print("\n Chegou a grande hora, n�o vacila de novo! Digite o divisor:");
				divisor = entradaTipoInteiro.nextInt();
				
				System.out.println("\n"+dividendo+" / "+divisor+" = "+(dividendo/divisor));
				
				System.out.print("\n Deseja continuar com a divis�o?"
						+ "\n Caso sim, digite 1"
						+ "\n Caso n�o digite qualquer n�mero:");
				
				verificador = entradaTipoInteiro.nextInt();
			}
		}
		
		System.out.print("\n\n Muito obrigado por utilizar a nossa aplica��o :D");
		
	}
	
}
