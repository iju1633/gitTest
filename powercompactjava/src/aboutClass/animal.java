package aboutClass;

public class animal { // class
String name;
	public void setName(String name) { // method
		this.name = name;
	}
	public static void main(String[] args) {
		animal cat = new animal(); // ��ü
		animal dog = new animal(); // ��ü
		
		cat.setName("body"); // .�� �̿��Ͽ� setName �޼��忡 ����
		dog.setName("happy"); // .�� �̿��Ͽ� setName �޼��忡 ����
		System.out.println(cat.name);
		System.out.println(dog.name); // key point : ��ü���� name�� ���� �ȵ�!!!
	}
}
