package ch6class;

class Parent {
	public void print() {
		System.out.println("부모 클래스의 print()");
	}
}

class Child extends Parent {
	public void print(){
		super.print();
		System.out.println("자식 클래스의 print()");
	}
}
public class ChildTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.print();
	}

}
