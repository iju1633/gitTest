package ch4class;

public class Complex {
	int real;
	int imag;

	public Complex() { // �����Բ��� �ʵ� ���� ��, �����ڿ��� 0���� �ʱ�ȭ�϶�� �Ͻ�
		real = 0;
		imag = 0;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}

	public void print() {
		System.out.println(real + "+" + imag + "i"); // �����Բ��� ���Ҽ� ��Ģ���� �ʿ���ٰ� �Ͻ�
	}

	public static void main(String[] args) {
		Complex c = new Complex();
		c.setReal(10);
		c.setImag(20);
		c.print();
	}

}
