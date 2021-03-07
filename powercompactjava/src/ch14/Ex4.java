package ch14;

import java.util.Scanner;

class BusReservation implements Runnable {
	int customer;
	int requiredSeats = 0;
	String name;
	static Scanner num1 = new Scanner(System.in);
	static int seats = num1.nextInt();

	public BusReservation(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public synchronized int getSeats() { // key point : synchronized
		seats -= requiredSeats;
		return seats;
	}

	public static synchronized int getAmount() { 

		return seats;
	}

	@Override
	public void run() {
		System.out.println("--------------------------------------------------");
		System.out.println(getName() + "�� ������");

		System.out.print("������ �¼��� : " + getSeats() + " ");

		System.out.print("��û�¼��� : ");
		Scanner num2 = new Scanner(System.in);
		requiredSeats = num2.nextInt();

		if (seats < requiredSeats || getSeats() < 0) { // �����ִ� �¼��� �䱸�Ǵ� �¼����� ���� �� Ȥ�� ���� �ڸ��� ���� ��( == 0�̶��ϸ� �����¼��� ��δ� ���� ����)
			System.out.println("�¼������� �Ұ����մϴ�.");
		} else {
			System.out.println(requiredSeats + " �¼��� ����Ǿ���.");
		}
		System.out.println(getName() + "�� �����ϴ�.");
		System.out.println("--------------------------------------------------");
	}
}

public class Ex4 {

	public static void main(String[] args) {

		System.out.print("������ �¼� ���� �������ּ��� : ");
		BusReservation.getAmount(); // getSeats() �ϰԵǸ� requiredSeats�� �� ���� ������ �ȵ�. NICE CATCH!

		Thread t1 = new Thread(new BusReservation("Thread-0"));
		Thread t2 = new Thread(new BusReservation("Thread-1"));
		Thread t3 = new Thread(new BusReservation("Thread-2"));

		t1.start();

		try {
			t1.join(); // t1 ���������� ��ٷ��޶�.
			t2.start();
			t2.join();
			t3.start();
		} catch (InterruptedException ie) {
			System.out.println("������ �����ϴ�.");
		}
	}

}
