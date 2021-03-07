package interfaceEx;

public class Zookeeper {
	public void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}

	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Crocodile crocodile = new Crocodile();

		zookeeper.feed(tiger);
		zookeeper.feed(lion);
		zookeeper.feed(crocodile);
		System.out.println(tiger.isPredator());
		System.out.println(crocodile.isPredator()); 
		System.out.println(lion.isPredator());
	}
}
