package ch5class;

class Circle {
	int radius;
	Point center;

	class Point { // ������ ���� Ŭ����
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	static class Line { // ���� ���� Ŭ����
		int x1, x2, y1, y2;

		public Line(int a, int b, int c, int d) {
			this.x1 = a;
			this.x2 = b;
			this.y1 = c;
			this.y2 = d;
		}
	}

	public Circle(int radius, int x, int y) { // ������
		this.radius = radius;
		this.center = new Point(x, y);
	}

	double calcArea() { // ���� Ŭ����
		class C {
			String name;
		}

		C c = new C();

		return (radius * radius * 3.14);

	}
}

public class InnerTest {

	public static void main(String[] args) {

		Circle obj = new Circle(10, 0, 0);
		System.out.println(obj.calcArea());
		
		Circle.Point p = obj.new Point(10,10);
		Circle.Line l = new Circle.Line(10,10,20,20);
	}

}
