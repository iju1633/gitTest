package aboutClass;


public class Dog extends animal {
	
	public void sleep() {
		System.out.println(this.name + " ...zzz"); // this로 animal class의 name 호출
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy"); // 상속받으므로 animal class의 setName 메서드 사용가능.
		
		System.out.println(dog.name);
		dog.sleep();
	}
} 
