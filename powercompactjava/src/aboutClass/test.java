package aboutClass;

public class test {
//	public int sum(int a, int b) {
//		return a + b;
//	}

	public String say() { // ()���ָ� void method���� ���
		return "Hi";
	}

	public void tell() {
		System.out.println("Hi");
	}

	public void sum(int a, int b) { // a,b�� ���ú���. �޼��忡���� ���ȴٴ� �ǹ�. ���� a�� �޼ҵ� �ȿ����� ���̴� �������� �޼ҵ� ���� ���� a�� �ƴ϶�� ���̴�.
		System.out.println(a + " �� " + b + "�� ���� " + (a + b) + "�Դϴ�.");
	}
	/*
	 * �Ƹ��� �������� ������ ���� ������ ������ �𸥴�. "3�� 4�� ���� 7�Դϴ�." ��� ������ ����� �־��µ� ���ϰ��� ���� ���ΰ�? ��
	 * �κ��� �ʺ��ڵ��� ȥ�������� �ϴ� �κ��̱⵵ �ѵ� System.out.println ���� �޼ҵ峻���� ���Ǿ����� ������ ���̴�. �����ִ�
	 * ���� �翬�� ����. �����ִ� ���� return ��ɾ�θ� �����ϴ�.
	 */

	// �޼ҵ带 ���������⸦ ���� �� return�� �ܵ����� �Ἥ �޼ҵ带 ��� �������� �� �ִ�.
	public void say_nick(String name) {
		if (name.equals("fool")) {
			return;
		}
		System.out.println("���� ������ " + name + "�Դϴ�.");
	}
	
	public int varTest(int a) {
		a++;
		return a; // int�� �ƴϰ� void�̸� return a;�� ���� ���, a�� ���ú����̹Ƿ� �ƹ��� ȿ���� ����.
	}

	public static void main(String[] args) {
		int a = 3;
		int b = 4;

		test t = new test();

//		int c = t.sum(a, b); // sum method�� ����ϱ� ���� test ��ü t�� ����.
//		System.out.println(c);

		String str = t.say();
		System.out.println(str);

		t.sum(a, b);
		t.tell();

		t.say_nick("full");
		
		test myTest  = new test();
		
		/*
		int c = 1;
		myTest.varTest(c);
		System.out.println(c);
		*/
		
		int c = 1;
		c = myTest.varTest(c);
		System.out.println(c);
		
		
	}

}
/*
 * public �����ڷ��� �޼ҵ��(�Է��ڷ���1 �Էº���1, �Է��ڷ���2 �Էº���2, ...) { ... return ���ϰ�; //
 * �����ڷ����� void �� ��쿡�� return ���� �ʿ����. }
 */