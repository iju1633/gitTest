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
		System.out.println(getName() + "가 들어왔음");

		System.out.print("가능한 좌석수 : " + getSeats() + " ");

		System.out.print("요청좌석수 : ");
		Scanner num2 = new Scanner(System.in);
		requiredSeats = num2.nextInt();

		if (seats < requiredSeats || getSeats() < 0) { // 남아있는 좌석이 요구되는 좌석보다 작을 때 혹은 남은 자리가 없을 때( == 0이라하면 남는좌석을 모두는 예매 못함)
			System.out.println("좌석예약이 불가능합니다.");
		} else {
			System.out.println(requiredSeats + " 좌석이 예약되었음.");
		}
		System.out.println(getName() + "가 나갑니다.");
		System.out.println("--------------------------------------------------");
	}
}

public class Ex4 {

	public static void main(String[] args) {

		System.out.print("가능한 좌석 수를 설정해주세요 : ");
		BusReservation.getAmount(); // getSeats() 하게되면 requiredSeats를 또 뺴기 때문에 안됨. NICE CATCH!

		Thread t1 = new Thread(new BusReservation("Thread-0"));
		Thread t2 = new Thread(new BusReservation("Thread-1"));
		Thread t3 = new Thread(new BusReservation("Thread-2"));

		t1.start();

		try {
			t1.join(); // t1 끝날때까지 기다려달라.
			t2.start();
			t2.join();
			t3.start();
		} catch (InterruptedException ie) {
			System.out.println("오류가 났습니다.");
		}
	}

}
