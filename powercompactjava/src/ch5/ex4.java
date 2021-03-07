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
		protected String getCorporation() {  //  자료형 맞게 써야지
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
	
			Plane p1 = new Plane("가나다 산업", "aa", 123);
			System.out.println("식별번호: " + p1.getPlanes() + " 모델: " + p1.getModel() + " 승객 수: " + p1.getMaxPeople());

			Plane p2 = new Plane("종이비행기", "bb", 300);
			System.out.println("식별번호: " + p2.getPlanes() + " 모델: " + p2.getModel() + " 승객 수: " + p2.getMaxPeople());

			Plane p3 = new Plane("종이비행기", "cc", 150);
			System.out.println("식별번호: " + p3.getPlanes() + " 모델: " + p3.getModel() + " 승객 수: " + p3.getMaxPeople());
			
		}
	
	}
