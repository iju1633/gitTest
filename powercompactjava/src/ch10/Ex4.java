package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex4 extends JFrame {
	public Ex4() {
		setSize(450, 150);
		setTitle("���ڰ���");
		setLocationRelativeTo(null);
		
		JPanel upPanel = new JPanel();
		JPanel middlePanel = new JPanel();
		JPanel downPanel = new JPanel();
		JLabel label = new JLabel("���ڸ� �����Ͻÿ�: ");
		JTextField text = new JTextField(15);
		JTextField result = new JTextField(9);
		result.setText("������Դϴ�!");
		result.setBackground(Color.red);
		
		text.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int answer = (int) (Math.random()*100+ 0); // ���� ����
				if(Integer.parseInt(text.getText()) == answer) { // ��� ���ϴ� �� �ߺ�.
					result.setText("�����Դϴ�!");
				}
				else if(Integer.parseInt(text.getText()) < answer) {
					result.setText("�ʹ� �����ϴ�!");
				}
				else {
					result.setText("�ʹ� �����ϴ�!");
				}
			}
		});
		
		JButton b1 = new JButton("�� ����");
		JButton b2 = new JButton("����");
		
		upPanel.add(label); // panel�� �������� ������ ���߿� frame â�� ���� ����� ����. ���� ���� ���ݵ� ���� �ְ�)
		upPanel.add(text);
		
		middlePanel.add(result);
		
		downPanel.add(b1);
		downPanel.add(b2);
		
		add(upPanel, BorderLayout.NORTH);
		add(middlePanel, BorderLayout.CENTER);
		add(downPanel, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex4 ex4 = new Ex4();
	}
}
