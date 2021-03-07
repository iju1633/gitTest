package ch11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

class Rocket extends JPanel {
	int x, y;

	public Rocket(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void paint(Graphics g) {
		g.drawImage(window.roc, x, y, 100, 100, this);
	}

	public void update() {
			x += 30;
			y -= 10;
	}
}

public class window extends JFrame implements ActionListener {
	static final int speed = 1000;
	Timer timer;
	ImageIcon img;
	static Image roc;
	Rocket r;

	ImageIcon imageSetSize(ImageIcon icon, int i, int j) {
		Image ximg = icon.getImage();
		Image yimg = ximg.getScaledInstance(i, i, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}

	public window() {
		setSize(500, 300);
		setTitle("Animation");

		img = new ImageIcon("C:\\Users\\82102\\OneDrive\\바탕 화면\\배경화면\\venom5.jpg");
		roc = img.getImage();
		r = new Rocket(10, 100);
		setVisible(true);

		class Mypanel extends JPanel {
			public Mypanel() {
				setBackground(Color.BLACK);
			}

			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				r.paint(g);
			}
		}
		add(new Mypanel());
		timer = new Timer(speed, this);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		r.update();
		repaint();
	}

	public static void main(String[] args) {
		window f = new window();
	}

}
