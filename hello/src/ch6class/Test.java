package ch6class;


class Base {
	public Base() {
		System.out.println("Base ������ ȣ��");
	}
}

class Derived extends Base {
	public Derived() {
		System.out.println("Derived ������ ȣ��");
	}
}
public class Test {

	public static void main(String[] args) {
		Derived r = new Derived();
	}

}
