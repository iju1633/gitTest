package ch6class;

abstract class Shape2 { // Shape2���� �߻��� ���� ���⿡�� draw�� Shape2 Draw ������� �����س���, Rectangle2�� ������ �κ��� �����
						// arrayOfShape2[i].draw(); ���� �� Shape2 Draw ��µ�
	int x, y;

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract void draw();
}

class Rectangle2 extends Shape2 {
	int width, height;

	public void draw() {
		System.out.println("Rectangle draw");
	}
}

class Triangle extends Shape2 {
	int base, height;

	public void draw() {
		System.out.println("Triangle draw");
	}
}

class Circle2 extends Shape2 {
	int radius;

	public void draw() {
		System.out.println("Cirlce draw");
	}
}

public class ShapeTest {

	public static void main(String[] args) {

		Shape2 s;
		// s = new Shape2(); Shape2�� �߻� Ŭ�����̱� ������ ��ü ������ �ȵ�
		s = new Rectangle2();
		s.x = 10;
		s.y = 20;
		// s.width = 10; // �θ� Ŭ�������� �ڽ� Ŭ������ ��� ���� �Ұ�
		// s.height = 10;

		Rectangle2 r;
		r = new Rectangle2();
		r.x = 10; // �ڽĿ��� �θ�� ��
		r.y = 20;
		r.width = 10;
		r.height = 10;

		Shape2 arrayOfShape2[] = new Shape2[3];
		arrayOfShape2[0] = new Rectangle2();
		arrayOfShape2[1] = new Triangle();
		arrayOfShape2[2] = new Circle2();

		for (int i = 0; i < arrayOfShape2.length; i++) { // ���� ���ε�
			arrayOfShape2[i].draw();

			if (arrayOfShape2[i] instanceof Rectangle2) { // ��ü Ÿ�� ���ϴ� ������ true�� false�� ��ȯ
				System.out.println("Rectangle object");
			} else if (arrayOfShape2[i] instanceof Triangle) {
				System.out.println("Triangle object");
			} else if (arrayOfShape2[i] instanceof Circle2) {
				System.out.println("Circle2 object");
			}

		}

	}

}
