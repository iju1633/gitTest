package ch5Assignment;

class Plane { // PlaneTest 클래스에서 Plane 객체 3대를 생성(인자없는 생성자 호출)하고, 설정자와 접근자를 호출하시오.라는 표현이 있는데
				// main()이 들어가있는 클래스가 EX5_2다 보니, PlaneTest 클래스에서 Plane 객체 3대를 생성할 수는 있는데, 설정자와
				// 접근자 또한 접근을 못해서 질문드립니다.
				// 그러하여 저 같은 경우에는 PlaneTest에서 객체를 생성하고, main()에서 PlaneTest 객체 생성 후에 설정자와 접근자를
				// 호출했습니다.

	private String manufacturer;
	private String model;
	private int passengers;
	static int planes = 0;

	Plane() {
		planes++;
	}

	Plane(String manufacturer, String model, int passengers) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.passengers = passengers;
		planes++;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	static int getPlanes() {
		return planes;
	}

}

class PlaneTest {

	Plane p1 = new Plane();
	Plane p2 = new Plane();
	Plane p3 = new Plane();

}

public class EX5_2 {

	public static void main(String[] args) {

		PlaneTest test = new PlaneTest();

		test.p1.setManufacturer("에어버스");
		test.p1.setModel("A380");
		test.p1.setPassengers(500);

		test.p2.setManufacturer("보잉");
		test.p2.setModel("B777");
		test.p2.setPassengers(400);

		test.p3.setManufacturer("보잉");
		test.p3.setModel("B747");
		test.p3.setPassengers(300);

		System.out.println("제작사: " + test.p1.getManufacturer() + " 모델: " + test.p1.getModel() + " 최대승객: "
				+ test.p1.getPassengers() + "명");
		System.out.println("제작사: " + test.p2.getManufacturer() + " 모델: " + test.p2.getModel() + " 최대승객: "
				+ test.p2.getPassengers() + "명");
		System.out.println("제작사: " + test.p3.getManufacturer() + " 모델: " + test.p3.getModel() + " 최대승객: "
				+ test.p3.getPassengers() + "명");
		System.out.println("항공기 대수 = " + Plane.getPlanes() + "대");
	}

}
