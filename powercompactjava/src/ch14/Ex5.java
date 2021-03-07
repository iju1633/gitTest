package ch14;

import java.awt.Font;
import javax.swing.*;
import java.util.*;

public class Ex5 extends JFrame {
	static JLabel label = null;
	String time;
	
	class MyThread extends Thread {
		public void run() {
			while (true) {
				try {
					Calendar now = Calendar.getInstance(); // ���� �����ְ� ���� ���� ���� ��� ������ �ϹǷ� ����� ������ �� �־�� ��. GOOD CATCH!
					int hrs = now.get(Calendar.HOUR_OF_DAY);
					int min = now.get(Calendar.MINUTE);
					int sec = now.get(Calendar.SECOND);
					time = "     " + hrs + ":" + min + ":" + sec;
					label.setText(time);

					MyThread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("�����Դϴ�.");
				}
			}
		}
	}

	public Ex5() {
		setSize(600, 100);
		setTitle("Digital Clock");
		setLocation(450,300);
		
		label = new JLabel();
		label.setFont(new Font("Serif", Font.BOLD, 40));
		
		add(label);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyThread t = new MyThread();
		t.start(); // ����� ��
	}

	public static void main(String[] args) {
		Ex5 ex5 = new Ex5();
	}

}
