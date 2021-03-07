package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class RectangleMove extends JComponent implements MouseListener, MouseMotionListener {

	Rectangle box;
	boolean isDragged;
	int offX, offY;

	public RectangleMove() {

		box = new Rectangle(0, 0, 100, 80);
		isDragged = false;
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.red);
		g.drawRect(box.x, box.y, box.width, box.height);
	}

	public void mousePressed(MouseEvent me) {
		if (box.contains(new Point(me.getX(), me.getY()))) {
			offX = me.getX() - box.x;
			offY = me.getY() - box.y;
			isDragged = true;
		}
	}

	public void mouseReleased(MouseEvent me) {
		isDragged = false;
	}

	public void mouseDragged(MouseEvent me) {
		if (isDragged) {
			box.x = me.getX() - offX;
			box.y = me.getY() - offY;
		}
		repaint();

	}

	public void mouseMoved(MouseEvent me) {
	}

	public void mouseClicked(MouseEvent me) {
	}

	public void mouseEntered(MouseEvent me) {
	}

	public void mouseExited(MouseEvent me) {
	}

	public static void main(String[] args) {

		JFrame f = new JFrame("그래픽 기초 프로그램");
		f.setBounds(0, 0, 300, 300);
		f.add(new RectangleMove());
		f.setVisible(true);
	}
}
