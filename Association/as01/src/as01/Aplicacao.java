package as01;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); // Quando há uma entrada String seguida de uma Inteiro, ele pega o 'Enter'
		Scanner entradaString = new Scanner(System.in); // Para evitar dupla chamada de entrada, separou
		
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		
		System.out.println("Digite o seu nome:");
		pessoa.setNome(entradaString.nextLine());
		System.out.println("Digite o seu idade:");
		pessoa.setIdade(entrada.nextInt());
		System.out.println("Digite o seu sexo:");
		pessoa.setSexo(entrada.next().charAt(0));
		
		
		System.out.println("Digite o seu logradouro:");
		endereco.setLogradouro(entradaString.nextLine());
		
		System.out.println("Digite o seu número:");
		endereco.setNumero(entrada.nextInt());
		
		System.out.println("Tem complemento?");
		char resposta = entrada.next().charAt(0);
		
		if( resposta == 's') {
			System.out.println("Digite o complemento:");
			endereco.setComplemento(entradaString.nextLine());
		}else {
			endereco.setComplemento("");
		}
		
		System.out.println("Digite o seu cep:");
		endereco.setCep(entradaString.nextLine());
		
		
		// Associação Pessoa e Endereco
		pessoa.setEndereco(endereco);
		
		System.out.println(pessoa.imprimir());
	
		
		
		
		
		
		
		
		
		
		/*
		 * Modo "manual", mas sempre será preciso criar o endereço antes, se não houver a instância do objeto no construtor
		 * por ter a criação do objeto Endereço dentro da classe Pessoa, não vai funcionar se instanciar o objeto aqui
		 * 
			Endereco endereco2 = new Endereco();
			
			endereco2.setLogradouro("Logradouro A");
			endereco2.setNumero(1);
			endereco2.setComplemento("Complemento A");
			endereco2.setCep("0000-000");
			Pessoa pessoa2 = new Pessoa("Fulano A",10,"m" , endereco2);
		*/
		
		
	}

}
