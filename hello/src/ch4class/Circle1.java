package ch4class;

public class Circle1 { // ���� CircleTest�� �ٸ��� �ϳ��� class�ȿ� �� �ۼ�
	int radius;

	void setRadius(int r) {
		this.radius = r;
	}

	double calcArea() {
		return 3.14 * radius * radius;
	}

	void print() {
		System.out.println("���� ������: " + radius);
		System.out.println("���� ����: " + calcArea());
	}

	public static void main(String[] args) {
		Circle1 obj = new Circle1();
		obj.setRadius(100);

		obj.print();
	}

}
