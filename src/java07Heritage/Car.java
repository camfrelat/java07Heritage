package java07Heritage;

public class Car extends Vehicule {

	public Car(String brand, int kilometers) {
		super(brand, kilometers);
	}
	
	@Override
	public String doStuff() {
		return "I am " + getBrand() + " and I go zoom zoom zoom!";
	}

}
