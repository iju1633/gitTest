package ch10;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex2 extends JFrame {
	public Ex2( ) {
		
		JPanel p = new JPanel();
		JTextArea input = new JTextArea(7,20);
		JTextArea output = new JTextArea(7,20);
		JButton leftB = new JButton("����");
		JButton rightB = new JButton("���");
		
		setSize(420, 215);
		setTitle("English Translator");
		setLocationRelativeTo(null); //â�� ��� ������
		
		leftB.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(input.getText().equals("Student")){ // key point
					output.setText("�л�");
				}
				else if(input.getText().equals("Computer")){
					output.setText("��ǻ��");
				}
				else if(input.getText().equals("Family")){
					output.setText("����");
				}
				else {
					output.setText("������ �ܾ �������� �ʽ��ϴ�.");
				}
				leftB.requestFocus(); //key point^^ ��Ա� ����. ��� �Ǳ� �ϳ�??
				}
		});
		add(p);
		p.add(input);
		p.add(output);
		p.add(leftB);
		p.add(rightB);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ex2 ex2 = new Ex2();
	}

}
