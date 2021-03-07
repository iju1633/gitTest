package polymorphism;

import interfaceEx.Crocodile;
import interfaceEx.Lion;
import interfaceEx.Tiger;

public class Bouncer {

	public void barkAnimal(Barkable animal) {
		animal.bark();
	}
	
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Lion lion  = new Lion();
		Crocodile crocodile = new Crocodile();
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(crocodile);
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
	}

}
