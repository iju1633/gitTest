package ch5class;

class Rect { // ó���� �긦 RectArrayTest�ȿ� �������. �׷��� �Ʒ��� ���� ������ ��
	/*
	 * No enclosing instance of type RectArrayTest is accessible. Must qualify the
	 * allocation with an enclosing instance of type RectArrayTest (e.g. x.new A()
	 * where x is an instance of RectArrayTest).
	 */
	int width, height;

	public Rect(int w, int h) {
		this.width = w;
		this.height = h;
	}

	double calcArea() {
		return (double) width * height;
	}
}

public class RectArrayTest {

	public static void main(String[] args) {
		Rect[] list;
		list = new Rect[5];

		for (int i = 0; i < list.length; i++) {
			list[i] = new Rect(i, i);
		}

		for (int i = 0; i < list.length; i++) {
			System.out.println(i + "��° �簢���� ���� = " + list[i].calcArea());
		}
	}

}
