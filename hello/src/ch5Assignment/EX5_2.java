package ch5Assignment;

class Plane {

	private String manufacturer;
	private String model;
	private int passengers;
	static int planes = 0;

	Plane() {
		planes++; // �����ڰ� �ΰ��ε� ��� ������ �����ڸ� ����ϴ� �װ��� ����� 1�� �÷�����
	}

	Plane(String manufacturer, String model, int passengers) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.passengers = passengers;
		planes++; // �����ڰ� �ΰ��ε� ��� ������ �����ڸ� ����ϴ� �װ��� ����� 1�� �÷�����
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

	public static int getPlanes() {
		return planes;
	}

}

public class EX5_2 {

	public static void main(String[] args) {

		Plane p1 = new Plane("�������", "A380", 500); // �ٸ� ������ ���,�ּ����� ó���� �κа� ���� ��� ����
		Plane p2 = new Plane();
		Plane p3 = new Plane();

//		p1.setManufacturer("�������"); 
//		p1.setModel("A380");
//		p1.setPassengers(500);

		p2.setManufacturer("����");
		p2.setModel("B777");
		p2.setPassengers(400);

		p3.setManufacturer("����");
		p3.setModel("B747");
		p3.setPassengers(300);

		System.out.println(
				"���ۻ�: " + p1.getManufacturer() + " ��: " + p1.getModel() + " �ִ�°�: " + p1.getPassengers() + "��");
		System.out.println(
				"���ۻ�: " + p2.getManufacturer() + " ��: " + p2.getModel() + " �ִ�°�: " + p2.getPassengers() + "��");
		System.out.println(
				"���ۻ�: " + p3.getManufacturer() + " ��: " + p3.getModel() + " �ִ�°�: " + p3.getPassengers() + "��");
		System.out.println("�װ��� ��� = " + Plane.getPlanes() + "��");
	}

}
