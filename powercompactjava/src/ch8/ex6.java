package ch8;
import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial") 				//panel�� ���� ����� �׸�ŭ�� ������ ����.
public class ex6 extends JFrame {

	public ex6() {
		setSize(400,150);
		setTitle(null);
		
		JPanel panel = new JPanel(); //button �� �ڸ�(GridLayout ����ϴϱ�)
		add(panel, BorderLayout.CENTER);
		
		// TextField ����
		
		JTextField text = new JTextField(30);
		add(text, BorderLayout.NORTH); // panel ���� �������� BorderLayout�� ���� �ٷ� ����.
		
		
		// panel2 ����
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
		
		
		//button clear ����
		JButton button2 = new JButton("clear");
		add(button2,BorderLayout.EAST);
		
		
		//������
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ex6 f = new ex6();
	}
	
}
