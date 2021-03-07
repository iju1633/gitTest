package ch9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial") // panel�� ���� ����� �׸�ŭ�� ������ ����.
public class Ex7 extends JFrame implements ActionListener {
	JButton[] buttons;
	JTextField text;
	int oldNum, temp;
	double result;
	String func; // ������ ��ư�� ������ �� ������ func�� �����Ͽ� =�� �������� ���� �� �ְ���. good idea!

	public Ex7() {
		setSize(400, 150);
		setTitle("Java Calculator");
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel(); // button �� �ڸ�(GridLayout ����ϴϱ�)
		add(panel, BorderLayout.CENTER);

		// TextField ����

		text = new JTextField(30);
		add(text, BorderLayout.NORTH); // panel ���� �������� BorderLayout�� ���� �ٷ� ����.

		// panel2 ����
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

		// ������
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// �̺�Ʈ ����
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource(); // idea!

		if (button == buttons[0]) { // 1 ����
			oldNum = 1;
			text.setText("1");
		}
		else if (button == buttons[1]) { // 2 ����
			oldNum = 2;
			text.setText("2");
		}
		else if (button == buttons[2]) { // 3 ����
			oldNum = 3;
			text.setText("3");
		}
		else if (button == buttons[3]) { // 4 ����
			oldNum = 4;
			text.setText("4");
		}
		else if (button == buttons[4]) { // 5 ����
			oldNum = 5;
			text.setText("5");
		}
		else if (button == buttons[5]) { // 6 ����
			oldNum = 6;
			text.setText("6");
		}
		else if (button == buttons[6]) { // 7 ����
			oldNum = 7;
			text.setText("7");
		}
		else if (button == buttons[7]) { // 8 ����
			oldNum = 8;
			text.setText("8");
		}
		else if (button == buttons[8]) { // 9 ����
			oldNum = 9;
			text.setText("9");
		}
		else if (button == buttons[9]) { // + ����
			func = "+";
			temp = oldNum;
			text.setText(" ���ϱ� ");
		}
		else if (button == buttons[10]) { // - ����
			func = "-";
			temp = oldNum;
			text.setText(" ���� ");
		}
		else if (button == buttons[11]) { // * ����
			func = "*";
			temp = oldNum;
			text.setText(" ���ϱ� ");
		}
		else if (button == buttons[12]) { // / ����
			func = "/";
			temp = oldNum;
			text.setText(" ������ ");
		}
		else if (button == buttons[13]) { // C ����
			text.setText("�ʱ�ȭ�Ǿ����ϴ�.");
			oldNum = 0;
			temp = 0;
			result = 0;
			
		}
		else if (button == buttons[14]) { // = ����
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
					text.setText("0���� ���� �� �����ϴ�.");
				}
				else {
				result = (double) temp / oldNum; // ��������� �Ҽ����� ��Ÿ���� ���� temp�� �Ϻη� double���� �ο�.
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