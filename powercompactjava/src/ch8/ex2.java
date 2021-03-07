package ch8;

import javax.swing.*;


@SuppressWarnings("serial")
public class ex2 extends JFrame {

	public ex2() {
		setSize(300, 150);
		setTitle("My Frame");
		
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel label = new JLabel("카운터값");
		panel.add(label);
		
		JTextField text = new JTextField(10);
		panel.add(text);
		
		JButton button = new JButton("증가");
		panel.add(button);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ex2 f = new ex2();
	}

}
