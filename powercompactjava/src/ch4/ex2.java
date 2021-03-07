package ch4;


	class Dog {
		String breed;
		int age;
		String color;
		
		void showInfo() {
			System.out.println("(" + breed + "," + age + "," + color + ")");
		}
		
		void barking(){
			System.out.println("barking()");
		}
		void hungry(){
			System.out.println("hungry()");
		}
		void sleeping(){
			System.out.println("sleeping()");
		}
		
	}
	
	
	public class ex2 {
	
		public static void main(String[] args) {
			
			Dog dog = new Dog();
			dog.breed = "york";
			dog.age = 1;
			dog.color = "orange";
			
			dog.showInfo();
			dog.barking();
			dog.hungry();
			dog.sleeping();
		}
		
	
	}
