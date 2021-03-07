package ch11;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Ex2 extends JFrame {

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			// ��
			g.setColor(Color.RED); //���� ���� ���ϰ� �׸��� �׷��ߵ�.
			g.fillOval(30,30,70,70);
			// �۾�
			g.setColor(Color.black);
			g.drawString("�����", 150, 55);
			g.drawString("���л�", 150, 70);
			g.drawString("����ø����б�", 150, 85);
		}
	}
	
	public Ex2() {
		setSize(600, 200);
		setTitle("MyFrame");
		setLocationRelativeTo(null);
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex2 ex2 = new Ex2();
	}

}
