package aboutClass;

public class test {
//	public int sum(int a, int b) {
//		return a + b;
//	}

	public String say() { // ()없애면 void method으로 취급
		return "Hi";
	}

	public void tell() {
		System.out.println("Hi");
	}

	public void sum(int a, int b) { // a,b는 로컬변수. 메서드에서만 사용된다는 의미. 변수 a는 메소드 안에서만 쓰이는 변수이지 메소드 밖의 변수 a가 아니라는 말이다.
		System.out.println(a + " 와 " + b + "의 합은 " + (a + b) + "입니다.");
	}
	/*
	 * 아마도 여러분은 다음과 같은 질문을 할지도 모른다. "3과 4의 합은 7입니다." 라는 문장을 출력해 주었는데 리턴값이 없는 것인가? 이
	 * 부분이 초보자들이 혼동스러워 하는 부분이기도 한데 System.out.println 문은 메소드내에서 사용되어지는 문장일 뿐이다. 돌려주는
	 * 값은 당연히 없다. 돌려주는 값은 return 명령어로만 가능하다.
	 */

	// 메소드를 빠져나가기를 원할 때 return만 단독으로 써서 메소드를 즉시 빠져나갈 수 있다.
	public void say_nick(String name) {
		if (name.equals("fool")) {
			return;
		}
		System.out.println("나의 별명은 " + name + "입니다.");
	}
	
	public int varTest(int a) {
		a++;
		return a; // int가 아니고 void이며 return a;가 없는 경우, a는 로컬변수이므로 아무런 효과가 없다.
	}

	public static void main(String[] args) {
		int a = 3;
		int b = 4;

		test t = new test();

//		int c = t.sum(a, b); // sum method를 사용하기 위해 test 객체 t를 만듦.
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
 * public 리턴자료형 메소드명(입력자료형1 입력변수1, 입력자료형2 입력변수2, ...) { ... return 리턴값; //
 * 리턴자료형이 void 인 경우에는 return 문이 필요없다. }
 */