package ch6;



	class Animal {
		void walk() {
			System.out.println("���� �� ����");
		}
	}
	
	class Bird extends Animal{
		void fly() {
			System.out.println("���� �� ����");
		}
		void sing() {
			System.out.println("�뷡 �θ� ������");
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
