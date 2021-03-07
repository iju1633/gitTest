package aboutClass;

public class animal { // class
String name;
	public void setName(String name) { // method
		this.name = name;
	}
	public static void main(String[] args) {
		animal cat = new animal(); // 객체
		animal dog = new animal(); // 객체
		
		cat.setName("body"); // .를 이용하여 setName 메서드에 접근
		dog.setName("happy"); // .를 이용하여 setName 메서드에 접근
		System.out.println(cat.name);
		System.out.println(dog.name); // key point : 객체변수 name은 공유 안됨!!!
	}
}
