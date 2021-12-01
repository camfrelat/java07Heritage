package java07Heritage;

public class Boat extends Vehicule{

	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
	}
	
	@Override
	public String doStuff() {
		return "I am " + getBrand() + " and I go glug glug!";
	}

	
}
