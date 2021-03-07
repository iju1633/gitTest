package ch11;

import javax.swing.*;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Ex1 extends JFrame {
	
	class MyPanel extends JPanel {
		
		public void paintComponent(Graphics g) {
			int recWidth = 150;
			int recHeight = 100;
			super.paintComponent(getGraphics());
			//지붕
			g.drawLine(50,50,125,25); // (50,50)에서 (125,25)
			g.drawLine(125,25,200,50); // (125,25)에서 (200,50) 
			// 집 토대
			g.drawRect(50,50,recWidth, recHeight);
			// 집 문
			g.drawRect(125,75,35,65);
			// 집 창문
			g.drawRect(70,70,15,15);
		}
	}

	public Ex1() {
		setSize(500, 215);
		setTitle("MyFrame");
		setLocationRelativeTo(null);
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex1 ex1 = new Ex1();
	}

}
