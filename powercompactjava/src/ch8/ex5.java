package ch8;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ex5 extends JFrame {

	public ex5() {
		setSize(300,150);
		setTitle("My Frame");
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(0,5,1,1));
		
		for(int i=0 ; i<20; i++) {
			JButton button = new JButton("" + i);
			int R = (int)(Math.random()*256); //랜덤한 색상은
			int G = (int)(Math.random()*256); //다음과 같이
			int B = (int)(Math.random()*256); //만들 수 
			Color color = new Color(R, G, B); //있다. key point
			button.setBackground(color);
			panel.add(button);
		}
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ex5 f = new ex5();
	}

}
