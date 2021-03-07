package ch14;

import java.awt.Color;
import javax.swing.*;

public class Ex6 extends JFrame {
	JPanel panel;
	JLabel label;
	int x = 50; // label의 초기위치 설정
	int y = 70;

	class Mythread extends Thread {
		public void run() {

			while (true) {
				try {
					ImageIcon icon = new ImageIcon(
							"C:\\Users\\82102\\OneDrive\\바탕 화면\\배경화면\\venom3.jpg");
					label.setIcon(icon);
					label.setBounds(x, y, 250, 150);
					panel.add(label);
					x += 10;
					y -= 10;
					Mythread.sleep(1000);

				} catch (InterruptedException e) {
					System.out.println("오류입니다.");
				}
			}
		}
	}

	public Ex6() {
		setSize(600, 200);
		setTitle("Java Animation");
		setLocationRelativeTo(null);
		
		panel = new JPanel();
		label = new JLabel();
		panel.setBackground(Color.BLACK);
		add(panel); // 처음에 사진이 크게 생겼다가 작게되는 것을 막기위해 여기에 말고 try에 label 만드는 과정을 다 갖다놓음. Good IDEA!

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Mythread t = new Mythread();
		t.start();
	}

	public static void main(String[] args) {
		Ex6 ex6 = new Ex6();
	}

}
