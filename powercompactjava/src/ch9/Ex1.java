package ch9;

import javax.swing.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class Ex1 extends JFrame {

	public Ex1() {
		setSize(400,150);
		setLocation(450, 300);
		setTitle("�̺�Ʈ ����");
		
		
		JPanel p = new JPanel();
		add(p);
		JButton b = new JButton("��ư�� �����ÿ�");
		
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				b.setText("��ħ�� ��ư�� ���������ϴ�.");
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
