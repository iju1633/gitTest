package ch6;


	class Circle {
		protected int radius;
		public Circle(int r) {
			radius = r;
		}
	}
	class Pizza extends Circle{
		String name;
		
		public Pizza(String name, int r) {
			super(r); // ���� �����ؾ��ϰ� key point
			this.name = name;
		}
		
		public void print() {
			System.out.println("������ ����: " + this.name + ", " + "������ ũ��: " + super.radius);
		}
		
		}
		
	

	
	public class ex1 {
	
		public static void main(String[] args) {
			
			Pizza obj = new Pizza("pepperoni", 20);
			obj.print();
		}
	
	}
