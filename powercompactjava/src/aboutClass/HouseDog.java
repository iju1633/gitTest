package aboutClass;

public class HouseDog extends Dog{
	
	public HouseDog(String name) { // constructor(생성자) 생성, 메소드명이 클래스명과 동일하고 리턴 자료형이 없는 메소드를 생성자(Constructor)라고 말한다.
		this.setName(name);
	}
	
	public HouseDog(int type) {
		if(type == 1) {
			this.setName("yok");
			System.out.println(this.name);
		}
		if(type == 2) {
			this.setName("bulldog");
			System.out.println(this.name);
		}
	}
	
	public void sleep() { // overriding
		System.out.println(this.name + "...zzz in house");
	}
	public void sleep(int hours) {
		System.out.println(this.name + "sleeps for " + hours + " hour"); //입력항목이 다른 경우 이와 같이 메서드 오버라이딩 할 수 있음.
	}

	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog("puppy"); // 이렇듯 생성자를 사용했을 때 얻게 되는 이득은 setName("happy")와 같은 
		// 필수적인 행동을 객체 생성시에 제어할 수 있게 된다는 점이다.
		
		System.out.println(houseDog.name); // 바로 윗 문장에서 houseDog라는 객체를 만들었는데 그거 이용해야지ㅡㅡ 헷갈리지마
		
		HouseDog bulldog = new HouseDog(2);
	}
	// 그렇다면 name이라는 변수에 내용을 넣어야만 객체가 생성될 수 있도록 할 수 있는 방법은 없을까?  -> constructor 생성이 있다.
}
