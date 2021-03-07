package ch9;

import javax.swing.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class Ex1 extends JFrame {

	public Ex1() {
		setSize(400,150);
		setLocation(450, 300);
		setTitle("이벤트 예제");
		
		
		JPanel p = new JPanel();
		add(p);
		JButton b = new JButton("버튼을 누르시오");
		
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				b.setText("마침에 버튼이 눌러졌습니다.");
			}
		});
		p.add(b);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex1 f = new Ex1();
	}

}
