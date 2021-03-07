package interfaceEx;

public abstract class Predator extends Animal {
	public abstract String getFood(); // 인터페이스 규칙, 메소드의 이름과 입출력에 대한 정의만 있고 그 내용은 없다.
	//그 이유는 인터페이스는 규칙이기 때문이다. 
	//위에서 설정한 getFood라는 메소드는 인터페이스를 implements한 클래스들이 구현해야만 하는 것이다.
	public boolean isPredator() {
		return true;
	}
}
