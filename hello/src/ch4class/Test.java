package ch4class;

class A {
	private int a;
	int b;
	public int c;
}

public class Test {

	public static void main(String[] args) {
		A obj = new A();
		// obj.a = 10; �� private�̶� ���� �ȵ�. �׷��Ƿ� private ����ų� �ؾߵ�
		obj.b = 10;
		obj.c = 10;
	}

}
