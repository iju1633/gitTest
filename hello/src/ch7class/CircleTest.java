package ch7class;

class Circle {
	int x, y;
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return "Circle(r=" + radius + ")";
	}

	public boolean equals(Circle c) {
		if (radius == c.radius) {
			return true;
		} else
			return false;
	}
}

public class CircleTest {

	public static void main(String[] args) {

		Circle obj1 = new Circle(10);
		Circle obj2 = new Circle(20);

		System.out.println(obj1); // toString() 호출
		System.out.println(obj2);

		if (obj1.equals(obj2)) {
			System.out.println("2개의 원은 같습니다.");
		} else
			System.out.println("2개의 원은 같지 않습니다.");

		// 내가 궁금해서 해본 것
		System.out.println(obj1.getClass()); // class ch7class.Circle
		System.out.println(obj1.getClass().getName()); // ch7class.Circle

	}

}
