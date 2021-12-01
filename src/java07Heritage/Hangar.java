package java07Heritage;

public class Hangar {

	public static void main(String[] args) {
		Car clio = new Car("Clio", 700);
		Boat queenElizabethII = new Boat ("Queen Elisabeth 2", 10000);
		
		System.out.println(clio.doStuff());
		System.out.println(queenElizabethII.doStuff());
	}

}
