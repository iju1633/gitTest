package ch6;

	interface Animal{
		
		void walk();
		void fly();
		void sing();
		
	};
	
	class Bird implements Animal{

		
		public void walk() {
			System.out.println("���� �� ����");
		}

		public void fly() {
			System.out.println("���� �� ����");
		}

		public void sing() {
			System.out.println("�뷡�� �θ� �� ����");
		}
		
	}
	
	public class ex3 {
	
		public static void main(String[] args) {
	
			Bird bird = new Bird();
			bird.walk();
			bird.fly();
			bird.sing();
			
		}
	
	}
