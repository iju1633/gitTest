package interfaceEx;

import polymorphism.Barkable;

public class Crocodile extends Predator implements Barkable {
	public String getFood() {
		return "tomato";
	}
	public void bark() {
		System.out.println("ehhhhh");
	}
}
