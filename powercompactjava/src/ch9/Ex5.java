package ch9;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex5 extends JFrame {
	
	public Ex5() {
		setSize(400,150);
		setLocation(400, 250);
		setTitle("���� ����");
		
		JPanel p = new JPanel(); 		// panel ������ �ȵ�)
		JLabel L1 = new JLabel("������ �Է��Ͻÿ�");
		JTextField input = new JTextField(8);
		JLabel L2 = new JLabel("������ �Է��Ͻÿ�");
		JTextField interestRate = new JTextField(8);
		
		JButton b = new JButton("��ȯ");
		JTextField interest = new JTextField(18);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  // key point
				String result = "���ڴ� �� " + Double.parseDouble(input.getText()) * Double.parseDouble(interestRate.getText()) + "���� �Դϴ�.";
				interest.setText(result);
			}
		});
		add(p);
		p.add(L1);
		p.add(input);
		p.add(L2);
		p.add(interestRate);
		p.add(b);
		p.add(interest);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex5 f = new Ex5();
	}

}
