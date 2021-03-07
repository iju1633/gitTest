package ch8;
import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial") 				//panel을 많이 만들면 그만큼의 여백이 생김.
public class ex6 extends JFrame {

	public ex6() {
		setSize(400,150);
		setTitle(null);
		
		JPanel panel = new JPanel(); //button 들어갈 자리(GridLayout 써야하니깐)
		add(panel, BorderLayout.CENTER);
		
		// TextField 생성
		
		JTextField text = new JTextField(30);
		add(text, BorderLayout.NORTH); // panel 만들어서 넣지말고 BorderLayout을 통해 바로 넣자.
		
		
		// panel2 생성
		panel.setLayout(new GridLayout(0,3));
		JButton button1 = new JButton();
		
		String[] string = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#", "send", "", "end"};
		int index = 0;
		for(int j=0 ; j<5 ; j++) {
			for(int i=0 ; i<3 ; i++) {
				button1 = new JButton(string[index]);
				panel.add(button1);
				index++;
			}
			
		}
		
		
		//button clear 생성
		JButton button2 = new JButton("clear");
		add(button2,BorderLayout.EAST);
		
		
		//마무리
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ex6 f = new ex6();
	}
	
}
