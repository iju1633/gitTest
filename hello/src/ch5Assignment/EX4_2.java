package ch5Assignment;

class Complex {
	int real;
	int image;

	Complex() {
		real = 0;
		image = 0;
	}

	void setReal(int real) {
		this.real = real;
	}

	void setImage(int image) {
		this.image = image;
	}

	void print() {
		System.out.println(real + "+" + image + "i");
	}
}

public class EX4_2 {

	public static void main(String[] args) {

		Complex complex = new Complex();
		complex.setReal(10);
		complex.setImage(20);
		complex.print();

	}

}
