package as01;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private Endereco endereco;
	
	public Pessoa() {
		this.endereco = new Endereco(); // Evita o NullPointerException (não há na memória), pois sempre cria um objeto com a classe que vai utilizar
	}
	
	public Pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.endereco = new Endereco();
	}
	
	public Pessoa(String nome, int idade, char sexo, Endereco endereco) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String imprimir() {
		return "Info:" + this.nome + ", " + this.idade + ", " + this.sexo + "\n Endereco: " + endereco.imprimir()  ; // objeto endereco
	}

}
