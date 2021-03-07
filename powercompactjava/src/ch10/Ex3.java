package ch10;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;


@SuppressWarnings("serial")  // �̹����� ���γ��̿� ��ư���� ���̸� ��ģ ���̰� ���� ���ƾ� �����ϰ� ��ġ��. �� �̹����� ��Ʈ�� ���ȭ�� �������� ��û ŭ.�׷��� �׷�.
public class Ex3 extends JFrame implements ActionListener { // ���� ��ư�� �޶��������� event�� �־���ϹǷ� �� ����� ����.
	JLabel label = new JLabel(); // keypoint!! event�� ó���� ������ ���� �� �ְ��ϱ� �̸� ����.
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
		
		ButtonGroup group = new ButtonGroup(); // �Ѱ��� ������ �� �ְ� �ϴ� ����(���� ��ư�̴ϱ�)
		
		group.add(b1);
		group.add(b2);
		group.add(b3);
		group.add(b4); 
		
		leftPanel.add(b1);
		leftPanel.add(b2);
		leftPanel.add(b3);
		leftPanel.add(b4);
		
		b1.addActionListener(this); // key point!! event ó���� ������ �� ���̶� �� ����ؾ���.
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		panel.add(leftPanel);
		panel.add(label, BorderLayout.EAST);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// �� �߰�ȣ ���� �߿��ߴ���
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b1) { //���� ��ư���� �����Ѱ��� b1�̶��
				ImageIcon icon1 = new ImageIcon("C:\\Users\\82102\\OneDrive\\���� ȭ��\\workspace\\SecondJava\\hellojava\\src\\���ȭ��\\venom2.jpg");
				label.setIcon(icon1);
				panel.add(label);
			}
			else if(e.getSource() == b2) {
				ImageIcon icon2 = new ImageIcon("C:\\Users\\82102\\OneDrive\\���� ȭ��\\workspace\\SecondJava\\hellojava\\src\\���ȭ��\\venom3.jpg");
				label.setIcon(icon2);
				panel.add(label);
			}
			if(e.getSource() == b3) {
				ImageIcon icon3 = new ImageIcon("C:\\Users\\82102\\OneDrive\\���� ȭ��\\workspace\\SecondJava\\hellojava\\src\\���ȭ��\\venom4.jpg");
				label.setIcon(icon3);
				panel.add(label);
			}
			if(e.getSource() == b4) {
				ImageIcon icon4 = new ImageIcon("C:\\Users\\82102\\OneDrive\\���� ȭ��\\workspace\\SecondJava\\hellojava\\src\\���ȭ��\\venom5.jpg");
				label.setIcon(icon4);
				panel.add(label);
			}
		}
		
	public static void main(String[] args) {
		new Ex3();
	}

}

