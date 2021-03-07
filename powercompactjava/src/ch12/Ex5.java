package ch12;

import java.util.ArrayList;

public class Ex5 {

	class MyThread extends Thread {
		public void run() {
			int index = 0; // try구문에 있으면 계속 0으로 초기화돼서 10만 나왔던 거야!!
			while (index <= 10) {
				try {
					ArrayList<Integer> array = new ArrayList<Integer>();
					for (int i = 10; i >= 0; i--) {
						array.add(i);
					}

					System.out.print(array.get(index) + " ");
					index++;
					MyThread.sleep(1000);

				} catch (InterruptedException e) {
					System.out.println("오류입니다.");
				}
			}
		}
	}

	public Ex5() {
		MyThread t = new MyThread();
		t.start();
	}

	public static void main(String[] args) {
		new Ex5();
	}
}
