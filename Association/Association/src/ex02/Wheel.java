package ex02;

public class Wheel {
	
	private String texture;
	
	// empty constructor 
	public Wheel() {
		
	}
	
	// constructor with parameter
	public Wheel(String texture) {
		this.texture = texture;
	}
	
	// getter and setter
	
	public String getTexture() {
		return texture;
	}
	
	public void setTexture(String texture) {
		this.texture = texture;
	}
	
}
