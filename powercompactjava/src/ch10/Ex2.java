package ch10;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex2 extends JFrame {
	public Ex2( ) {
		
		JPanel p = new JPanel();
		JTextArea input = new JTextArea(7,20);
		JTextArea output = new JTextArea(7,20);
		JButton leftB = new JButton("번역");
		JButton rightB = new JButton("취소");
		
		setSize(420, 215);
		setTitle("English Translator");
		setLocationRelativeTo(null); //창이 가운데 나오게
		
		leftB.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(input.getText().equals("Student")){ // key point
					output.setText("학생");
				}
				else if(input.getText().equals("Computer")){
					output.setText("컴퓨터");
				}
				else if(input.getText().equals("Family")){
					output.setText("가족");
				}
				else {
					output.setText("번역할 단어가 존재하지 않습니다.");
				}
				leftB.requestFocus(); //key point^^ 까먹기 쉽다. 없어도 되긴 하네??
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
