package ch8;

import javax.swing.*;



	@SuppressWarnings("serial")
	public class ex1 extends JFrame {
		public ex1() {
			setSize(300,150);
			setTitle("My Frame");
			
			
			JPanel panel = new JPanel();
			add(panel);
			
			JLabel label = new JLabel("자바는재미있나요?");
			panel.add(label);
			
			JButton button1 = new JButton("Yes");
			JButton button2 = new JButton("No");
			panel.add(button1);
			panel.add(button2);
			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
		@SuppressWarnings("unused")
		public static void main(String[] args) {
			ex1 f = new ex1();
		}
	
	}
