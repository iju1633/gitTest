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
		check1 = new JCheckBox("엔진오일 교환");
		check2 = new JCheckBox("자동변속기오일교환");
		check3 = new JCheckBox("에어콘필터교환");
		check4 = new JCheckBox("타이어 교환");
		
		check1.addItemListener(this);
		check2.addItemListener(this);
		check3.addItemListener(this);
		check4.addItemListener(this);
	
		label = new JLabel("현재까지의 가격은0입니다.");
		label.setFont(new Font(getName(), Font.ITALIC, 30)); // 글자의 모양을 바꾼 부분!
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
			if(e.getItem() == check1) { // checkBox니 getText()가 아니라 getItem()이 맞지^^
			 sum += 45000; // good idea
			 label.setText("현재까지의 가격은" + sum + "입니다."); // label을 갱신해주는 코드.
			 panel.add(label, BorderLayout.CENTER);
			}
			else if(e.getItem() == check2) {
				sum += 80000;
				label.setText("현재까지의 가격은" + sum + "입니다.");
				panel.add(label, BorderLayout.CENTER);
			}
			else if(e.getItem() == check3) {
				sum += 30000;
				label .setText("현재까지의 가격은" + sum + "입니다.");
				panel.add(label, BorderLayout.CENTER);
			}
			else if(e.getItem() == check4) {
				sum += 100000;
				label.setText("현재까지의 가격은" + sum + "입니다.");
				panel.add(label, BorderLayout.CENTER);
			}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex5 ex5 = new Ex5();
	}

}
