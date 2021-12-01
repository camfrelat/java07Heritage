package java07Heritage;

public abstract class Vehicule {
	
	// attributes
	private String brand;
	private int kilometers;
	
	// constructor
	public Vehicule(String brand, int kilometers) {
		this.brand = brand;
		this.kilometers = kilometers; 
	}
	
	// getters and setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	
	// methods
	public abstract String doStuff();

}
