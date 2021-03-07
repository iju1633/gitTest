package ch14;

import java.util.ArrayList;

class Thread1 extends Thread {
	int sum1 = 0;

	public void run() {
		ArrayList<Integer> array = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			array.add(i);
		}
		for (int j = 0; j < 50; j++) {
			sum1 += array.get(j);
		}
	}

	int getSum() { // keypoint : 합을 반환한다.
		return sum1;
	}
}

class Thread2 extends Thread {
	int sum2 = 0;

	public void run() {
		ArrayList<Integer> array = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			array.add(i);
		}
		for (int j = 50; j < 100; j++) {
			sum2 += array.get(j);
		}
	}

	int getSum() { // 합을 반환한다.
		return sum2;
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		t1.start();
		try {
			t1.join();
			t2.start();
		} catch (InterruptedException ie) {
			System.out.println("오류가 났습니다.");
		}
		System.out.println("합계: " + (t1.getSum() + t2.getSum()));

	}
}