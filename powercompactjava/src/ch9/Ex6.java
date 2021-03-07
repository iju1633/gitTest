package ch9;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

class Ex6 extends JFrame implements ActionListener {

	JButton[] buttons;// 버튼배열 선언

	JButton reset;

	public Ex6() {

		setTitle("puzzle");
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3, 1, 1));

		buttons = new JButton[9];// 배열크기가 9 버튼 배열생성, idea
		String[] str = { " ", "1", "2", "3", "4", "5", "6", "7", "8" };

		int[] a = new int[9];
		Random r = new Random();

		for (int i = 0; i < 9; i++) {
			a[i] = r.nextInt(8);
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					i--;
				}
			}
		}

		for (int k = 0; k < 9; k++) {
			buttons[k] = new JButton(str[a[k]]);
			panel.add(buttons[k]);
			buttons[k].addActionListener(this); // idea!
		}

		add(panel, BorderLayout.CENTER);// 패널을 프레임 중앙에 배치

		reset = new JButton("reset");
		add(reset, BorderLayout.SOUTH);
		setLocationRelativeTo(null);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// 기본생성자

	public void actionPerformed(ActionEvent e) {

		JButton b = (JButton) e.getSource(); // key point!!
		if (b.getText().equals(" ")) {// 빈 버튼 누르면 아무 동작 안함
			return;// 이벤트 종료
		} // if

		if (e.getSource() == buttons[0]) {// 1번 버튼 눌렀을 때

			if (buttons[1].getText().equals(" ")) {// 2번 자리 캡션이 비어 있다면

				buttons[1].setText(b.getText());

// 2번쨰 버튼 캡션문자열을 첫번쨰 버튼캡션문자열로 설정

				b.setText(" ");

// 첫번째 버튼 캡션문자열을 빈공백으로 처리

			} // if

			if (buttons[3].getText().equals(" ")) {

				buttons[3].setText(b.getText());

				b.setText(" ");

			} // if

		} // 1번 버튼 눌렀을 때

		if (e.getSource() == buttons[1]) {

			if (buttons[0].getText().equals(" ")) {

				buttons[0].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[2].getText().equals(" ")) {

				buttons[2].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[4].getText().equals(" ")) {

				buttons[4].setText(b.getText());

				b.setText(" ");

			}

		} // 2번 버튼 눌렀을 때

		if (e.getSource() == buttons[2]) {// 3번 버튼 눌렀을 때

			if (buttons[1].getText().equals(" ")) {// 2번 자리 캡션이 비어 있다면

				buttons[1].setText(b.getText());

// 2번 자리에 1번 캡션을 넣고

				b.setText(" ");

// 1번 자리 캡션을 지운다.

// 즉 1번 버튼 눌렀을 때 2번자리가 비어있다면 그쪽으로 자리 바꿈.

			}

			if (buttons[5].getText().equals(" ")) {

				buttons[5].setText(b.getText());

				b.setText(" ");

			}

		} // 3번 버튼 눌렀을 때

		if (e.getSource() == buttons[3]) {

			if (buttons[0].getText().equals(" ")) {

				buttons[0].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[4].getText().equals(" ")) {

				buttons[4].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[6].getText().equals(" ")) {

				buttons[6].setText(b.getText());

				b.setText(" ");

			}

		} // 4번 버튼 눌렀을 때

		if (e.getSource() == buttons[4]) {

			if (buttons[1].getText().equals(" ")) {

				buttons[1].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[3].getText().equals(" ")) {

				buttons[3].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[5].getText().equals(" ")) {

				buttons[5].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[7].getText().equals(" ")) {

				buttons[7].setText(b.getText());

				b.setText(" ");

			}

		} // 5번 버튼 눌렀을 때

		if (e.getSource() == buttons[5]) {

			if (buttons[2].getText().equals(" ")) {

				buttons[2].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[4].getText().equals(" ")) {

				buttons[4].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[8].getText().equals(" ")) {

				buttons[8].setText(b.getText());

				b.setText(" ");

			}

		} // 6번 버튼 눌렀을 때

		if (e.getSource() == buttons[6]) {

			if (buttons[3].getText().equals(" ")) {

				buttons[3].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[7].getText().equals(" ")) {

				buttons[7].setText(b.getText());

				b.setText(" ");

			}

		} // 7번 버튼 눌렀을 때

		if (e.getSource() == buttons[7]) {

			if (buttons[4].getText().equals(" ")) {

				buttons[4].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[6].getText().equals(" ")) {

				buttons[6].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[8].getText().equals(" ")) {

				buttons[8].setText(b.getText());

				b.setText(" ");

			}

		} //// 8번 버튼 눌렀을 때

		if (e.getSource() == buttons[8]) {

			if (buttons[5].getText().equals(" ")) {

				buttons[5].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[7].getText().equals(" ")) {

				buttons[7].setText(b.getText());

				b.setText(" ");

			}

		} // 9번 버튼 눌렀을 때

		if (b.getText().equals("reset")) {

			for (int i = 0; i < 8; i++) {

				buttons[i].setText("" + (i + 1));

			}

			buttons[8].setText(" ");

		}

	}

	public static void main(String[] args) {

		new Ex6();
	}
}
