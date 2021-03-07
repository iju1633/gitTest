package ch8;

import javax.swing.*;

@SuppressWarnings("serial")
public class ex3 extends JFrame {
	
	public ex3() {
		setSize(500,150);
		setTitle("My Frame");
		
		JPanel p1 = new JPanel(); // label 추가할 예정
		add(p1);
		JLabel label = new JLabel("자바 호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요.");
		p1.add(label);
		
		JPanel p2 = new JPanel(); // button 추가할 예정 
		add(p2);
		for(int i = 0; i<5 ; i++) {
			JButton button = new JButton(i + "일");
			p2.add(button);
		}
		
		JPanel p = new JPanel(); // 배경 panel
		add(p);
		p.add(p1);
		p.add(p2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ex3 f = new ex3();
	}

}
