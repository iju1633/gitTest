package aboutClass;


public class Dog extends animal {
	
	public void sleep() {
		System.out.println(this.name + " ...zzz"); // this�� animal class�� name ȣ��
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy"); // ��ӹ����Ƿ� animal class�� setName �޼��� ��밡��.
		
		System.out.println(dog.name);
		dog.sleep();
	}
} 
