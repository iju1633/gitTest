package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex4 extends JFrame {
	public Ex4() {
		setSize(450, 150);
		setTitle("숫자게임");
		setLocationRelativeTo(null);
		
		JPanel upPanel = new JPanel();
		JPanel middlePanel = new JPanel();
		JPanel downPanel = new JPanel();
		JLabel label = new JLabel("숫자를 추측하시오: ");
		JTextField text = new JTextField(15);
		JTextField result = new JTextField(9);
		result.setText("결과란입니다!");
		result.setBackground(Color.red);
		
		text.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int answer = (int) (Math.random()*100+ 0); // 난수 설정
				if(Integer.parseInt(text.getText()) == answer) { // 어떻게 비교하는 지 잘봐.
					result.setText("정답입니다!");
				}
				else if(Integer.parseInt(text.getText()) < answer) {
					result.setText("너무 낮습니다!");
				}
				else {
					result.setText("너무 높습니다!");
				}
			}
		});
		
		JButton b1 = new JButton("새 게임");
		JButton b2 = new JButton("종료");
		
		upPanel.add(label); // panel을 세가지로 나누니 나중에 frame 창에 더욱 깔끔히 보임. 서로 같의 간격도 조금 있고)
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
