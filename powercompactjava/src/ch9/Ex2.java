package ch9;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex2 extends JFrame {

	public Ex2() {
		
		setSize(300,150);
		setLocation(450, 300);
		setTitle("이벤트 예제");
		JPanel p = new JPanel();
		
		JButton b1 = new JButton("노란색");
		
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				p.setBackground(Color.yellow);
				
			}
		});
		JButton b2 = new JButton("핑크색");
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				p.setBackground(Color.pink);
			}
		});
		add(p);
		p.add(b1);
		p.add(b2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex2 f = new Ex2();
	}

}
