package interfaceEx;

import polymorphism.Barkable;

public class Tiger extends Predator implements Barkable {
	public String getFood() {
		return "Apple";
	}
	public void bark() {
		System.out.println("¾îÈï");
	}
}
