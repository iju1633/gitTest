package ch10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex5 extends JFrame implements ItemListener {
	
	JPanel panel;
	JCheckBox check1,check2,check3,check4;
	JLabel label;
	int sum = 0;
	
	public Ex5() {
		setSize(570, 140);
		setTitle("ChechBoxDemo");
		setLocationRelativeTo(null);
		
		panel = new JPanel();
		check1 = new JCheckBox("�������� ��ȯ");
		check2 = new JCheckBox("�ڵ����ӱ���ϱ�ȯ");
		check3 = new JCheckBox("���������ͱ�ȯ");
		check4 = new JCheckBox("Ÿ�̾� ��ȯ");
		
		check1.addItemListener(this);
		check2.addItemListener(this);
		check3.addItemListener(this);
		check4.addItemListener(this);
	
		label = new JLabel("��������� ������0�Դϴ�.");
		label.setFont(new Font(getName(), Font.ITALIC, 30)); // ������ ����� �ٲ� �κ�!
		add(panel);
		panel.add(check1);
		panel.add(check2);
		panel.add(check3);
		panel.add(check4);
		panel.add(label, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
		public void itemStateChanged(ItemEvent e) {
			if(e.getItem() == check1) { // checkBox�� getText()�� �ƴ϶� getItem()�� ����^^
			 sum += 45000; // good idea
			 label.setText("��������� ������" + sum + "�Դϴ�."); // label�� �������ִ� �ڵ�.
			 panel.add(label, BorderLayout.CENTER);
			}
			else if(e.getItem() == check2) {
				sum += 80000;
				label.setText("��������� ������" + sum + "�Դϴ�.");
				panel.add(label, BorderLayout.CENTER);
			}
			else if(e.getItem() == check3) {
				sum += 30000;
				label .setText("��������� ������" + sum + "�Դϴ�.");
				panel.add(label, BorderLayout.CENTER);
			}
			else if(e.getItem() == check4) {
				sum += 100000;
				label.setText("��������� ������" + sum + "�Դϴ�.");
				panel.add(label, BorderLayout.CENTER);
			}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex5 ex5 = new Ex5();
	}

}
