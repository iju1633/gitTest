package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex4 extends JFrame implements ActionListener {
	
	Rectangle box;
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			int R = (int)(Math.random()*256); //������ ������
			int G = (int)(Math.random()*256); //������ ����
			int B = (int)(Math.random()*256); //���� �� 
			Color color = new Color(R, G, B); //�ִ�. key point
			g.setColor(color);
			g.fillRect(15, 15, 580, 175);
		}
	}
	
	public Ex4() {
		setSize(600,200);
		setTitle("Color Test");
		setLocationRelativeTo(null);
		
		add(new MyPanel(), BorderLayout.CENTER);
		JButton b = new JButton("���� ����");
		add(b, BorderLayout.SOUTH);
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b) {
					repaint(); // key point!!!!!!
				}
			}
		});
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex4 ex4 = new Ex4();
	}

	@Override
	public void actionPerformed(ActionEvent e) {}
}
