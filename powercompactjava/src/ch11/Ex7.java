package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

class Car {
	int x, y;
}

public class Ex7 extends JFrame implements KeyListener {

	int x;
	int y;
	Car[] array = new Car[100];
	static Car r;
	int index = 0;
	ArrayList<Integer> a = new ArrayList<Integer>();

	public Ex7() {
	
		setSize(600, 200);
		setTitle(null);
		setLocationRelativeTo(null);

		class MyPanel extends JPanel {

			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				// ÀÚµ¿Â÷¸¦ ±×·ÁºÃ´Ù.
				for (Car r : array) {
					if (r != null) {
						g.setColor(Color.red);
						g.fillRect(r.x, r.y, 60, 20); // Â÷ À§ ¶Ñ²±

						g.setColor(Color.yellow);
						g.fillRect(r.x - 11, r.y + 20, 96, 30); // Â÷ ¸öÅë

						g.setColor(Color.red);
						g.fillOval(r.x, r.y + 45, 30, 30); // µÞ ¹ÙÄû
						g.fillOval(r.x + 45, r.y + 45, 30, 30); // ¾Õ ¹ÙÄû
					}
				}
			}
		}

		addMouseListener(new MouseListener() {

			@Override
			public void mousePressed(MouseEvent e) {
				if (index > 100)
					return;
				array[index] = new Car();
				array[index].x = e.getX();
				array[index].y = e.getY();
				index++;
				repaint();
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

		});

		addKeyListener(new KeyListener() { // ²À ¹öÆ° ¸¸µé¾î¼­ ÇÒ ÇÊ¿ä ¾ø´ÙÀ×.!

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					for(int i=0; i<a.size(); i++) {
					r.x -= 10;
					}
					repaint();
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					array[index].x += 10;
					repaint();
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

		});
		this.requestFocus();
		setFocusable(true);
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex7 ex7 = new Ex7();
	}

}
