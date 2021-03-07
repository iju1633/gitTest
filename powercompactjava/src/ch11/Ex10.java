package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Star1() {
	int index = 0;
	int[] x = { 210, 175, 60, 150, 110, 210, 310, 270, 360, 245, 210 };
	int[] y = { 60, 160, 160, 225, 340, 270, 340, 225, 160, 160, 60 };
	int[] a = new int[11];
	int[] b = new int[11];
}

public void MyStar(Star1 a) {
	
	public void paint(Graphics g) {

		g.setColor(Color.gray);
		g.fillPolygon(a, b, 10); // 별그리기
		g.setColor(Color.green);
		g.fillPolygon(x, y, 10); // 별그리기
	}
}

public class Ex10 extends JFrame {
	

	public Ex10() {
		setSize(900, 900);
		setTitle("MyFrame");
		setLocationRelativeTo(null);

		setBackground(Color.yellow);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Ex10 ex10 = new Ex10();
	}

}
