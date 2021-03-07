package ch14;

import java.awt.Color;
import javax.swing.*;

public class Ex6 extends JFrame {
	JPanel panel;
	JLabel label;
	int x = 50; // label�� �ʱ���ġ ����
	int y = 70;

	class Mythread extends Thread {
		public void run() {

			while (true) {
				try {
					ImageIcon icon = new ImageIcon(
							"C:\\Users\\82102\\OneDrive\\���� ȭ��\\���ȭ��\\venom3.jpg");
					label.setIcon(icon);
					label.setBounds(x, y, 250, 150);
					panel.add(label);
					x += 10;
					y -= 10;
					Mythread.sleep(1000);

				} catch (InterruptedException e) {
					System.out.println("�����Դϴ�.");
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
		add(panel); // ó���� ������ ũ�� ����ٰ� �۰ԵǴ� ���� �������� ���⿡ ���� try�� label ����� ������ �� ���ٳ���. Good IDEA!

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Mythread t = new Mythread();
		t.start();
	}

	public static void main(String[] args) {
		Ex6 ex6 = new Ex6();
	}

}
