package ch5Assignment;

class Plane { // PlaneTest Ŭ�������� Plane ��ü 3�븦 ����(���ھ��� ������ ȣ��)�ϰ�, �����ڿ� �����ڸ� ȣ���Ͻÿ�.��� ǥ���� �ִµ�
				// main()�� ���ִ� Ŭ������ EX5_2�� ����, PlaneTest Ŭ�������� Plane ��ü 3�븦 ������ ���� �ִµ�, �����ڿ�
				// ������ ���� ������ ���ؼ� �����帳�ϴ�.
				// �׷��Ͽ� �� ���� ��쿡�� PlaneTest���� ��ü�� �����ϰ�, main()���� PlaneTest ��ü ���� �Ŀ� �����ڿ� �����ڸ�
				// ȣ���߽��ϴ�.

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

		test.p1.setManufacturer("�������");
		test.p1.setModel("A380");
		test.p1.setPassengers(500);

		test.p2.setManufacturer("����");
		test.p2.setModel("B777");
		test.p2.setPassengers(400);

		test.p3.setManufacturer("����");
		test.p3.setModel("B747");
		test.p3.setPassengers(300);

		System.out.println("���ۻ�: " + test.p1.getManufacturer() + " ��: " + test.p1.getModel() + " �ִ�°�: "
				+ test.p1.getPassengers() + "��");
		System.out.println("���ۻ�: " + test.p2.getManufacturer() + " ��: " + test.p2.getModel() + " �ִ�°�: "
				+ test.p2.getPassengers() + "��");
		System.out.println("���ۻ�: " + test.p3.getManufacturer() + " ��: " + test.p3.getModel() + " �ִ�°�: "
				+ test.p3.getPassengers() + "��");
		System.out.println("�װ��� ��� = " + Plane.getPlanes() + "��");
	}

}
