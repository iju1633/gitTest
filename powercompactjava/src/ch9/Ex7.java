package ch9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial") // panel을 많이 만들면 그만큼의 여백이 생김.
public class Ex7 extends JFrame implements ActionListener {
	JButton[] buttons;
	JTextField text;
	int oldNum, temp;
	double result;
	String func; // 연산자 버튼을 눌렀을 때 내용을 func에 저장하여 =을 눌렀을때 비교할 수 있게함. good idea!

	public Ex7() {
		setSize(400, 150);
		setTitle("Java Calculator");
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel(); // button 들어갈 자리(GridLayout 써야하니깐)
		add(panel, BorderLayout.CENTER);

		// TextField 생성

		text = new JTextField(30);
		add(text, BorderLayout.NORTH); // panel 만들어서 넣지말고 BorderLayout을 통해 바로 넣자.

		// panel2 생성
		panel.setLayout(new GridLayout(0, 4));
		buttons = new JButton[15];

		String[] string = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "C", "=" };
		int index = 0;
		for (int i = 0; i < 15; i++) {
			buttons[i] = new JButton(string[index]);
			buttons[i].addActionListener(this); // idea!!
			panel.add(buttons[i]);
			index++;
		}

		// 마무리
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 이벤트 구현
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource(); // idea!

		if (button == buttons[0]) { // 1 고르면
			oldNum = 1;
			text.setText("1");
		}
		else if (button == buttons[1]) { // 2 고르면
			oldNum = 2;
			text.setText("2");
		}
		else if (button == buttons[2]) { // 3 고르면
			oldNum = 3;
			text.setText("3");
		}
		else if (button == buttons[3]) { // 4 고르면
			oldNum = 4;
			text.setText("4");
		}
		else if (button == buttons[4]) { // 5 고르면
			oldNum = 5;
			text.setText("5");
		}
		else if (button == buttons[5]) { // 6 고르면
			oldNum = 6;
			text.setText("6");
		}
		else if (button == buttons[6]) { // 7 고르면
			oldNum = 7;
			text.setText("7");
		}
		else if (button == buttons[7]) { // 8 고르면
			oldNum = 8;
			text.setText("8");
		}
		else if (button == buttons[8]) { // 9 고르면
			oldNum = 9;
			text.setText("9");
		}
		else if (button == buttons[9]) { // + 고르면
			func = "+";
			temp = oldNum;
			text.setText(" 더하기 ");
		}
		else if (button == buttons[10]) { // - 고르면
			func = "-";
			temp = oldNum;
			text.setText(" 빼기 ");
		}
		else if (button == buttons[11]) { // * 고르면
			func = "*";
			temp = oldNum;
			text.setText(" 곱하기 ");
		}
		else if (button == buttons[12]) { // / 고르면
			func = "/";
			temp = oldNum;
			text.setText(" 나누기 ");
		}
		else if (button == buttons[13]) { // C 고르면
			text.setText("초기화되었습니다.");
			oldNum = 0;
			temp = 0;
			result = 0;
			
		}
		else if (button == buttons[14]) { // = 고르면
			if(func.equals("+")) {
				result = temp + oldNum;
				text.setText(Integer.toString(temp) + " + " + Integer.toString(oldNum) + " = " + Integer.toString((int)result));
			}
			else if(func.equals("-")) {
				result = temp - oldNum;
				text.setText(Integer.toString(temp) + " - " + Integer.toString(oldNum) + " = " + Integer.toString((int)result));
			}
			else if(func.equals("*")) {
				result = temp * oldNum;
				text.setText(Integer.toString(temp) + " * " + Integer.toString(oldNum) + " = " + Integer.toString((int)result));
			}
			else if(func.equals("/")) {
				if(temp == 0) {
					text.setText("0으로 나눌 수 없습니다.");
				}
				else {
				result = (double) temp / oldNum; // 결과값에서 소수점을 나타내기 위해 temp에 일부러 double형을 부여.
				text.setText(Integer.toString(temp) + " / " + Integer.toString(oldNum) + " = " + Double.toString(result));
				}
			}
		}
		
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex7 f = new Ex7();
	}

}