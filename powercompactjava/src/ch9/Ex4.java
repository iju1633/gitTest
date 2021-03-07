package ch9;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex4 extends JFrame implements ActionListener, KeyListener {
	JPanel panel, buttonPanel;
	JButton left, right;
	
	class Round extends JFrame {
		int x, y, w;

		public Round(int x, int y, int w) {
			this.x = x;
			this.y = y;
			this.w = w;
		}

		public void paint(Graphics g) {
			g.setColor(Color.red);
			g.fillOval(x, y, w, w);
		}

		void up() {
			y -= 10;
		}

		void down() {
			y += 10;
		}

		void left() {
			x -= 10;
		}

		void right() {
			x += 10;
		}
		
	}

	class roundHandler1 implements KeyListener {
		Round r;
		public roundHandler1(Round r) {
			this.r = r;
			r.addKeyListener(this);
		}

		public void keyTyped(KeyEvent e) {
		}

		public void keyReleased(KeyEvent e) {
		}

		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				r.up();
				break;
			case KeyEvent.VK_DOWN:
				r.down();
				break;
			case KeyEvent.VK_RIGHT:
				r.right();
				break;
			case KeyEvent.VK_LEFT:
				r.left();
				break;
			}
			//r.repaint();
		}

	}
	
	class roundHandler2 implements ActionListener {
		Round r;
		JButton b;
		public roundHandler2(Round r) {
			this.r  = r;
			left.addActionListener(this);
			right.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
			b = (JButton) e.getSource();
			
			if (b == left) {
				r.left();
			} else if (b == right) {
				r.right();
			}
			//r.repaint();
		}
		
	}

	public Ex4() {
		
		panel = new JPanel();
		panel.setBackground(Color.yellow);
		buttonPanel = new JPanel();
		
		left = new JButton("왼쪽으로 이동");
		right = new JButton("오른쪽으로 이동");
		
		buttonPanel.add(left);
		buttonPanel.add(right);

		Round r = new Round(125, 40, 50);
		new roundHandler1(r);
		new roundHandler2(r);
		
		r.setTitle("원움직이기");
		r.setSize(400, 150);
		r.setLocationRelativeTo(null);
		
		r.setVisible(true);
		r.add(panel, BorderLayout.CENTER);
		r.add(buttonPanel, BorderLayout.SOUTH);
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new Ex4();
	}

}
