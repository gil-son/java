package inheritance.ex01;

public class Mother {
	
    private String eyes;
	private String nose;
	private String mouth;
	private String hair;
	
	// m�todo construtor padr�o = atributos vazios
	// default constructor method = empty attributes
	
	public Mother() {
		
	}
	
	
	// m�todo construtor com atributos inicializados
	// constructor method with attributes initialized
	
	public Mother(String eyes, String nose, String mouth, String hair) {
		this.eyes = eyes;
		this.nose = nose;
		this.mouth = mouth;
		this.hair = hair;
	}
	
	
	// m�todos comuns
	// common methods
	
	public void falar() {
		System.out.println("Mother is talking");
	}
	
	public String andar() {
		return "mother is walking";
	}
	
	
	// m�todos de acesso
	// access methods
	
	public String getOlhos() {
		return eyes;
	}
	public void setOlhos(String eyes) {
		this.eyes = eyes;
	}
	public String getNariz() {
		return nose;
	}
	public void setNariz(String nose) {
		this.nose = nose;
	}
	public String getBoca() {
		return mouth;
	}
	public void setBoca(String mouth) {
		this.mouth = mouth;
	}
	public String getCabelo() {
		return hair;
	}
	public void setCabelo(String hair) {
		this.hair = hair;
	}
	
	// O retorno do m�todo ser� sobrescrito
	// Method return will be overwritten
	
	@Override
	public String toString() {
		return "\n -- Attributes --\n eyes: "+eyes+"\n nose: "+this.nose+"\n mouth"+getBoca()+"\n hair:"+this.getCabelo()+"\n";
	}
}
