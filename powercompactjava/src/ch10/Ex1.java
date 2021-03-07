package ch10;

import java.awt.GridLayout;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ex1 extends JFrame {

	public Ex1( ) {
		
		setSize(600,400);
		setTitle("레이블 테스트");
		setLocationRelativeTo(null); //창이 가운데 나오게
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		
		
		JLabel L1 = new JLabel();
		JLabel L2 = new JLabel();
		JLabel L3 = new JLabel();
		
		// src 파일 안에 사진 파일들을 넣으면 된다!!!!!!!!!!!!!!!
		ImageIcon icon1 = new ImageIcon("C:\\Users\\82102\\OneDrive\\바탕 화면\\workspace\\SecondJava\\hellojava\\src\\배경화면\\venom2.jpg");
		ImageIcon icon2 = new ImageIcon("C:\\Users\\82102\\OneDrive\\바탕 화면\\workspace\\SecondJava\\hellojava\\src\\배경화면\\venom3.jpg");
		ImageIcon icon3 = new ImageIcon("C:\\Users\\82102\\OneDrive\\바탕 화면\\workspace\\SecondJava\\hellojava\\src\\배경화면\\venom4.jpg");
		
		
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
