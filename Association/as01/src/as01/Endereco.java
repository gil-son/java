package as01;

public class Endereco {
	private String logradouro;
	private String complemento;
	private int numero;
	private String cep;
	
	public void setLogradouro( String logradouro) {
		this.logradouro = logradouro;
	}
	
	
	public String getLogradouro() {
		return this.logradouro;
	}
	
	
	public void setComplemento( String complemento) {
		this.complemento = complemento;
	}
	
	
	public String getComplemento() {
		return this.complemento;
	}
	
	
	public void setNumero( int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getCep() {
		return this.cep;
	}
	
	public void setCep( String cep) {
		this.cep = cep;
	}
	
	
	public String imprimir() { 
		return this.getLogradouro() + ',' + this.getComplemento() + ',' + this.getNumero() + ',' + this.getCep();
	}
	
	
	
	
	
}
