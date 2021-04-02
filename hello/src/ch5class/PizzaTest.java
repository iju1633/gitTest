package ch5class;

class Pizza {
	String toppings;
	static int count = 0;

	public Pizza(String toppings) {
		this.toppings = toppings;
		count++;
	}
}

public class PizzaTest {

	public static void main(String[] args) {
		Pizza p1 = new Pizza("Super Supreme");
		Pizza p2 = new Pizza("Cheese");
		Pizza p3 = new Pizza("Pepperoni");

		int n = Pizza.count;
		System.out.println("����1 ���� : " + p1.toppings);
		System.out.println("����2 ���� : " + p2.toppings);
		System.out.println("����3 ���� : " + p3.toppings);
		System.out.println("���ݱ��� �Ǹŵ� ���� ���� = " + n);
	}

}
