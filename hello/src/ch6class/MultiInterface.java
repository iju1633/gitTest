package ch6class;

interface Printable { // ���蹮�� ������ ���ٰ� ��, MultiInterface���� draw ���� ���ϸ� �ٸ� ������ draw() ���ٸ� default�� Shape draw ��µ�.
					  // ���⼭ default�� ���� ���ϸ� Shape3���� ������ draw() ���. ��ӹ޾ұ� ����.
					  // �� �� ����(interface, �θ�class, �ڽ�class)������ �ڽ� Ŭ������ ȭ���� ���� ����մϴٰ� ��µ�.
	void print();
}

interface Drawable {
	default void draw() { // ���� �Ʒ����� draw() �޼��带 ���� ���� ���, �̰� ���ڴٴ� ��
						  // �׸��� �̰� �س����� �Ʒ� ���� void draw();�� �ʿ䰡 ������?(����)
		System.out.println("Default draw");
	}
}

class Shape3 {
	int x, y;

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void draw() {
		System.out.println("Shape draw");
	}
}

public class MultiInterface extends Shape3 implements Printable, Drawable {

	public void print() {
		System.out.println("�����ͷ� ���� ����մϴ�");
	}

//	public void draw() {
//		System.out.println("ȭ�鿡 ���� �׸��ϴ�");
//	}

	public static void main(String[] args) {
		MultiInterface obj = new MultiInterface();
		obj.print();
		obj.draw();

		Printable p = obj;
		p.print();
		// p.draw();

		Drawable d = obj;
		d.draw();
		// d.print();
	}

}
