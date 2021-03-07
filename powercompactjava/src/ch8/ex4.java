package ch8;

import javax.swing.*;

@SuppressWarnings("serial")
public class ex4 extends JFrame {
	
	public ex4() {
		setSize(300, 150);
		setTitle("My Frame");
		
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null); // 배치 관리자를 설정하지 않음으로서 절대 위치를 사용할 수 있음. 이 문구를 안 쓸 경우 자동으로 배치 관리자가 설정되는데,그러면 정렬됨. 
		JLabel[] label = new JLabel[30]; // 총 30개의 수가 들어갈 것임.
		
		for(int i=0 ; i<30 ; i++) {
			label[i] = new JLabel("" + i); // JLabel 안에 문자를 넣어주기 위해 i에다가 ""를 넣어 문자로 인식하게 함 -> i라는 문자가 label이라는 배열에 들어가게끔하는 함수
			int x = (int) (300*Math.random());
			int y = (int) (150*Math.random());
			label[i].setBounds(x, y, 20, 20); // 배열의 위치는 불규칙하게 될 것임.
			panel.add(label[i]);
		}
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ex4 f = new ex4();
	}

}
