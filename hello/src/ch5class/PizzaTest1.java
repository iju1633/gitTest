package ch5class;

class Pizza1 {
	int radius;

	Pizza1(int r) {
		radius = r;
	}

	Pizza1 whosLargest(Pizza1 p) { // ���°� ����� �� �ִµ� whosLargest�� �ż����̰� �տ� Pizza1�� �������� ��ȯ�ϴ� ���� Pizza1�� ��ü�� ��ȯ�ϱ� ����
		if (this.radius > p.radius) {
			return this;
		} else
			return p;
	}
}

public class PizzaTest1 {

	public static void main(String[] args) {

		Pizza1 obj1 = new Pizza1(14);
		Pizza1 obj2 = new Pizza1(18);

		Pizza1 large = obj2.whosLargest(obj1); // this�� obj1 �ּҸ� �ǹ�(. �տ� ���� this�� �ش�)
		System.out.println(large.radius + "��ġ ���ڰ� �� ŭ."); // large -> obj2 ����Ŵ
	}

}
