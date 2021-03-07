package ch11;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex6 extends JFrame implements KeyListener {

	class Dice extends JFrame {
		int x, y;

		public Dice(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public void paint(Graphics g) {
			x = (int)(Math.random()*600);
			y = (int)(Math.random()*200);
			// 주사위 1
			g.setColor(Color.white);
			g.fillRect(x, y, 50, 50);

			// 주사위 2
			g.setColor(Color.white);
			g.fillRect(x + 100, y - 10, 50, 50);
		}

	}

	class DiceHandler implements KeyListener {
		Dice d;
		
		
		public DiceHandler(Dice d) {
			this.d = d;
			d.addKeyListener(this);
		}

		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				new Dice(getX(), getY());
			}
		}
	}

	public Ex6() {
		
		Dice d = new Dice(100,80);
		new DiceHandler(d);
		
		setSize(600, 200);
		setTitle("MyFrame");
		setLocationRelativeTo(null);
		
		d.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex6 ex6 = new Ex6();
	}
	
}
