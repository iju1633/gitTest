package ch5;

	class Plane{
		private String corporation;
		private String model;
		private int maxPeople;
		private static int planes;
		
		protected Plane(String corporation, String model, int maxPeople) {
			this.corporation = corporation;
			this.model = model;
			this.maxPeople = maxPeople;
			planes++; 						// important idea!!
		}
		protected Plane(String corporation, String model) {
			this.corporation = corporation;
			this.model = model;
			planes++;
		}
		protected Plane(String model) {
			this.model = model;
			planes++;
		}
		protected Plane() {
			planes++;
		}
		protected int getPlanes() {
			return planes;
		}
		protected String getCorporation() {  //  �ڷ��� �°� �����
			return this.corporation;              // important idea!!
		}
		protected String getModel() {
			return this.model;
		}
		protected int getMaxPeople() {
			return this.maxPeople;
		}
		
	}

	public class ex4 {
	
		public static void main(String[] args) {
	
			Plane p1 = new Plane("������ ���", "aa", 123);
			System.out.println("�ĺ���ȣ: " + p1.getPlanes() + " ��: " + p1.getModel() + " �°� ��: " + p1.getMaxPeople());

			Plane p2 = new Plane("���̺����", "bb", 300);
			System.out.println("�ĺ���ȣ: " + p2.getPlanes() + " ��: " + p2.getModel() + " �°� ��: " + p2.getMaxPeople());

			Plane p3 = new Plane("���̺����", "cc", 150);
			System.out.println("�ĺ���ȣ: " + p3.getPlanes() + " ��: " + p3.getModel() + " �°� ��: " + p3.getMaxPeople());
			
		}
	
	}
