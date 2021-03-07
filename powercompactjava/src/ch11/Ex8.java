package ch11;

import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;

class Venom extends JPanel {
	int x, y;

	public Venom(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void paint(Graphics g) {
		g.drawImage(Ex8.venom, x, y, 150, 150, this);
	}

	public void update() {

		x += 30;
		y -= 10;
	}
}

public class Ex8 extends JFrame implements ActionListener {
	static final int speed = 1000;
	Timer timer;
	ImageIcon img;
	static Image venom;
	Venom v;
	

	public Ex8() {
		setSize(600, 200);
		setTitle("Animation");

		setLocationRelativeTo(null);

		//JPanel panel = new JPanel();
		//JLabel label = new JLabel();
		
		img = new ImageIcon("C:\\Users\\82102\\OneDrive\\바탕 화면\\배경화면\\venom5.jpg");
		venom = img.getImage();
		v = new Venom(10, 100);
		setVisible(true);
		//label.setIcon(img);
		
		//add(panel);
		//panel.setBackground(Color.black);
		//panel.add(label);
		

		class MyPanel extends JPanel {
			public MyPanel() {
				setBackground(Color.black);
			}
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				v.paint(g);
			}
		}

		add(new MyPanel());
		timer = new Timer(speed, this);
		timer.start();

	}

	public void actionPerformed(ActionEvent e) {
		v.update();
		repaint();
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex8 ex8 = new Ex8();
	}

}
