package ch6;



	class Animal {
		void walk() {
			System.out.println("걸을 수 있음");
		}
	}
	
	class Bird extends Animal{
		void fly() {
			System.out.println("날을 수 있음");
		}
		void sing() {
			System.out.println("노래 부를 수있음");
		}
	}
	
	
	public class ex2 {
	
		public static void main(String[] args) {
	
			Bird bird = new Bird();
			bird.walk();
			bird.fly();
			bird.sing();
			
		}
	
	}
