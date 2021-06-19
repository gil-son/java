package managelistcars.ex01;

public class Car {
	
	private String model;
	private String brand;
	private int year;
	private int code;
	
	public Car() {
		
	}
	
	public Car(String model, String brand, int year,int code) {
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.code = code;
	}
	
	public void setModel(String m) {
		model = m;
	}
	
	public String getModel() {
		return model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Status of passaded car \n"
				+ "\n Model: "+ getModel()
				+ "\n Brand: "+ getBrand()
				+ "\n Year: "+ getYear()
				+ "\n Code: "+getCode();
	}
	
	
}          
