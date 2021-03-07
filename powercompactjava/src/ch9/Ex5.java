package ch9;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex5 extends JFrame {
	
	public Ex5() {
		setSize(400,150);
		setLocation(400, 250);
		setTitle("이자 계산기");
		
		JPanel p = new JPanel(); 		// panel 없으면 안돼)
		JLabel L1 = new JLabel("원금을 입력하시오");
		JTextField input = new JTextField(8);
		JLabel L2 = new JLabel("이율을 입력하시오");
		JTextField interestRate = new JTextField(8);
		
		JButton b = new JButton("변환");
		JTextField interest = new JTextField(18);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  // key point
				String result = "이자는 연 " + Double.parseDouble(input.getText()) * Double.parseDouble(interestRate.getText()) + "만원 입니다.";
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
