package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class Ex3 extends JComponent implements MouseListener, MouseMotionListener {

	int x, y;
	int mouseX, mouseY;
	boolean isDragged;
	Rectangle box;

	public Ex3() {
		box = new Rectangle(x, y, 80, 80);
		isDragged = false;
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		g.drawString("마우스를 클릭하면 사각형이 그려집니다.!", 15, 15);
		g.setColor(Color.black);
		g.drawRect(box.x, box.y, box.width, box.height);
		g.setColor(Color.red);
		g.fillRect(box.x, box.y, box.width, box.height);
	}

	public void mousePressed(MouseEvent e) {
		if (box.contains(new Point(e.getX(), e.getY()))) {
			mouseX = e.getX() - box.x;
			mouseY = e.getY() - box.y;
			isDragged = true;
		}
	}

	public void mouseDragged(MouseEvent e) {
		if (isDragged) {
			box.x = e.getX() - mouseX;
			box.y = e.getY() - mouseY;
		}
		repaint();
	}

	public void mouseReleased(MouseEvent e) {
		isDragged = false;
	}
	
	public void mouseMoved(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {
		box = new Rectangle(x, y, 80, 80);
		box.x = e.getX();
		box.y = e.getY();
		repaint();
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}

	public static void main(String[] args) {
		JFrame f = new JFrame("그래픽 기초 프로그램");
		f.setBounds(0, 0, 600, 200);
		f.add(new Ex3());
		f.setVisible(true);
	}
}
