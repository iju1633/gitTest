package ch14;

import java.util.ArrayList;

class MyThread extends Thread {
	int max = 0;

	public void run() {
		ArrayList<Integer> array = new ArrayList<>();
		int randomNum = (int) (Math.random() * (100));
		for (int i = 0; i < 100; i++) {
			array.add(randomNum);
		}
		int j = 0;
		while (j != 50) { // ��� MyThread1������ ���ο� ArrayList�� ���� ������ ���� ���̱� ������ index�� �ǹ̾���.
			if (max < array.get(j)) {
				max = array.get(j);
			}
			j++;
		}
	}

	int getMax() { // �ִ��� ��ȯ�Ѵ�.
		return max;
	}
}

class MyThread1 extends Thread {
	int max = 0;

	public void run() {
		ArrayList<Integer> array = new ArrayList<>();
		int randomNum = (int) (Math.random() * (100));
		for (int i = 0; i < 100; i++) {
			array.add(randomNum);
		}
		int j = 50;
		while (j != 100) {
			if (max < array.get(j)) {
				max = array.get(j);
			}
			j++; // Good idea!
		}
	}

	int getMax() { // �ִ��� ��ȯ�Ѵ�.
		return max;
	}
}

public class Ex3 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread1 t2 = new MyThread1();

		t1.start();
		try {
			t1.join();
			t2.start();
		} catch (InterruptedException ie) {
			System.out.println("������ �����ϴ�.");
		}
		if (t1.getMax() >= t2.getMax()) {
			System.out.println("�ִ��: " + t1.getMax());
		} else {
			System.out.println("�ִ��: " + t2.getMax());
		}

	}
}