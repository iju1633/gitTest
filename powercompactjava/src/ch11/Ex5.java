package ch11;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Ex5 extends JFrame {
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Font f1 = new Font("Serif", Font.PLAIN, 20 );
			Font f2 = new Font("SanSerif", Font.BOLD, 20 );
			Font f3 = new Font("Monospaced", Font.ITALIC, 20 );
			Font f4 = new Font("Dialog", Font.BOLD | Font.ITALIC, 20 );
			Font f5 = new Font("DialogInput", Font.BOLD, 20 );
			
			g.setFont(f1);
			g.drawString("Serif 20 points PLAIN", 10, 40);
			g.setFont(f2);
			g.drawString("SanSerif 20 points BOLD", 10, 60);
			g.setFont(f3);
			g.drawString("Monospaced 20 points ITALIC", 10, 80);
			g.setFont(f4);
			g.drawString("Dialog 20 points BOLD + ITALIC", 10, 100);
			g.setFont(f5);
			g.drawString("DialgInput 20 points BOLD", 10, 120);
			
		}
	}
	
	public Ex5() {
		setSize(600,200);
		setTitle("Font Test");
		setLocationRelativeTo(null);
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex5 ex5 = new Ex5();
	}

}
