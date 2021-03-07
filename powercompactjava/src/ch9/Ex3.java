package ch9;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex3 extends JFrame {
	
	public Ex3() {
		setSize(480,150);
		setLocation(450,300);
		setTitle("Mile->Km");
		
		JPanel p = new JPanel();
		JLabel L1 = new JLabel("마일을 입력하시오");
		JTextField mile = new JTextField(15);
		JLabel L3 = new JLabel("->");
		JTextField L4 = new JTextField(15);
		JButton b = new JButton("변환");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = Double.toString(Double.parseDouble(mile.getText())*1.609344) + "km";
				L4.setText(input);
			}
		});
		add(p);
		p.add(L1);
		p.add(mile);
		p.add(L3);
		p.add(L4);
		p.add(b,BorderLayout.CENTER);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex3 f = new Ex3();
	}
}
