package ch10;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;


@SuppressWarnings("serial")  // 이미지의 세로높이와 버튼들의 높이를 합친 높이가 서로 같아야 나란하게 배치됨. 내 이미지는 노트북 배경화면 사진으로 엄청 큼.그래서 그럼.
public class Ex3 extends JFrame implements ActionListener { // 라디오 버튼이 달라질때마다 event가 있어야하므로 이 방식이 적절.
	JLabel label = new JLabel(); // keypoint!! event를 처리할 곳에서 통용될 수 있게하기 미리 설정.
	JPanel panel;
	JPanel leftPanel;
	JPanel imagePanel;
	JRadioButton b1;
	JRadioButton b2;
	JRadioButton b3;
	JRadioButton b4;
	
	public Ex3() {
		
		setSize(600, 600);
		setTitle("RadiobuttonDemo");
		setLocationRelativeTo(null);
		panel = new JPanel();
		leftPanel = new JPanel();
		imagePanel = new JPanel();
		
		add(panel);
		
		b1 = new JRadioButton("venom2");
		b2 = new JRadioButton("venom3");
		b3 = new JRadioButton("venom4");
		b4 = new JRadioButton("venom5");
		
		ButtonGroup group = new ButtonGroup(); // 한개만 선택할 수 있게 하는 과정(라디오 버튼이니깐)
		
		group.add(b1);
		group.add(b2);
		group.add(b3);
		group.add(b4); 
		
		leftPanel.add(b1);
		leftPanel.add(b2);
		leftPanel.add(b3);
		leftPanel.add(b4);
		
		b1.addActionListener(this); // key point!! event 처리할 곳에서 할 것이란 걸 명시해야함.
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		panel.add(leftPanel);
		panel.add(label, BorderLayout.EAST);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// 요 중괄호 문법 중요했다잉
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b1) { //라디오 버튼에서 선택한것이 b1이라면
				ImageIcon icon1 = new ImageIcon("C:\\Users\\82102\\OneDrive\\바탕 화면\\workspace\\SecondJava\\hellojava\\src\\배경화면\\venom2.jpg");
				label.setIcon(icon1);
				panel.add(label);
			}
			else if(e.getSource() == b2) {
				ImageIcon icon2 = new ImageIcon("C:\\Users\\82102\\OneDrive\\바탕 화면\\workspace\\SecondJava\\hellojava\\src\\배경화면\\venom3.jpg");
				label.setIcon(icon2);
				panel.add(label);
			}
			if(e.getSource() == b3) {
				ImageIcon icon3 = new ImageIcon("C:\\Users\\82102\\OneDrive\\바탕 화면\\workspace\\SecondJava\\hellojava\\src\\배경화면\\venom4.jpg");
				label.setIcon(icon3);
				panel.add(label);
			}
			if(e.getSource() == b4) {
				ImageIcon icon4 = new ImageIcon("C:\\Users\\82102\\OneDrive\\바탕 화면\\workspace\\SecondJava\\hellojava\\src\\배경화면\\venom5.jpg");
				label.setIcon(icon4);
				panel.add(label);
			}
		}
		
	public static void main(String[] args) {
		new Ex3();
	}

}

