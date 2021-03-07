package ch11;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Ex2 extends JFrame {

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			// 원
			g.setColor(Color.RED); //색깔 먼저 정하고 그림을 그려야돼.
			g.fillOval(30,30,70,70);
			// 글씨
			g.setColor(Color.black);
			g.drawString("임재욱", 150, 55);
			g.drawString("대학생", 150, 70);
			g.drawString("서울시립대학교", 150, 85);
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
