package ch11;

import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;
import java.awt.*;


public class Ex9 extends JFrame {
	
	public Ex9() {
		setSize(600, 200);
		setTitle(null);
		setLocationRelativeTo(null);
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		
		JButton button = new JButton("DRAW");
		
		add(t1); add(t2); add(t3);
		add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double a = Double.parseDouble(t1.getText());
				double b = Double.parseDouble(t2.getText());
				double c = Double.parseDouble(t3.getText());
				
				if(e.getSource() == button) {
					
				}
				repaint();
			}
		});
		
		
		public void paint(Graphics g) {
			this.drawLine(g);
			this.graph(g);
		}
	}
	public void drawLine(Graphics g) {
		
	}
	public void graph(Graphics g) {
		
	}
	public static void main(String args[]) {
		new Ex9();
	}
	
}
