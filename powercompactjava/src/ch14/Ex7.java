package ch14;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class Ex7 extends JFrame {

	class MyPanel extends JPanel {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(200, 50, 190, 100);
		}
	}

	class MyPanel2 extends JPanel {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(250, 90, 100, 100);
		}
	}

	class Thread1 extends Thread {
		public void run() {
			add(new MyPanel());
			while (true) {
				try {
					Thread1.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("에러입니다.");
				}
			}
		}
	}

	class Thread2 extends Thread {
		public void run() {
			add(new MyPanel2());
			while (true) {
				try {
					Thread2.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("에러입니다.");
				}
			}
		}
	}

	public Ex7() {
		setSize(500, 150);
		setTitle(null);
		setLocationRelativeTo(null);

		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Ex7 ex7 = new Ex7();
	}

}
