package ch10;

import java.awt.GridLayout;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ex1 extends JFrame {

	public Ex1( ) {
		
		setSize(600,400);
		setTitle("���̺� �׽�Ʈ");
		setLocationRelativeTo(null); //â�� ��� ������
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		
		
		JLabel L1 = new JLabel();
		JLabel L2 = new JLabel();
		JLabel L3 = new JLabel();
		
		// src ���� �ȿ� ���� ���ϵ��� ������ �ȴ�!!!!!!!!!!!!!!!
		ImageIcon icon1 = new ImageIcon("C:\\Users\\82102\\OneDrive\\���� ȭ��\\workspace\\SecondJava\\hellojava\\src\\���ȭ��\\venom2.jpg");
		ImageIcon icon2 = new ImageIcon("C:\\Users\\82102\\OneDrive\\���� ȭ��\\workspace\\SecondJava\\hellojava\\src\\���ȭ��\\venom3.jpg");
		ImageIcon icon3 = new ImageIcon("C:\\Users\\82102\\OneDrive\\���� ȭ��\\workspace\\SecondJava\\hellojava\\src\\���ȭ��\\venom4.jpg");
		
		
		L1.setIcon(icon1);
		L2.setIcon(icon2);
		L3.setIcon(icon3);
		
		add(panel);
		panel.add(L1);
		panel.add(L2);
		panel.add(L3);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex1 f = new Ex1();
	}

}
