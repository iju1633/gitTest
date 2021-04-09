package ch6class;

class Shape1 {
	protected int x, y;

	public void print() {
		System.out.println(x + " " + y);
	}
}

class Rectangle1 extends Shape1 {
	int width, height;

	double calcArea() {
		return width * height;
	}

	void draw() {
		System.out.println("Shape���� ������ " + x + " �� " + y);
	}
	
	@Override // �̷��� ���� ��(��ġ!)
	public void print() {
		super.print(); // 0 0
		System.out.println("§");
	}
}

public class Rectangle {
	public static void main(String[] args) {
		Rectangle1 rc = new Rectangle1();
		rc.print(); // 0 0 \n §
		rc.draw(); // Shape���� ������ 0 �� 0
	}

}
