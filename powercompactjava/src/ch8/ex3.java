package ch8;

import javax.swing.*;

@SuppressWarnings("serial")
public class ex3 extends JFrame {
	
	public ex3() {
		setSize(500,150);
		setTitle("My Frame");
		
		JPanel p1 = new JPanel(); // label �߰��� ����
		add(p1);
		JLabel label = new JLabel("�ڹ� ȣ�ڿ� ���� ���� ȯ���մϴ�. �����ϼ��� �Է��ϼ���.");
		p1.add(label);
		
		JPanel p2 = new JPanel(); // button �߰��� ���� 
		add(p2);
		for(int i = 0; i<5 ; i++) {
			JButton button = new JButton(i + "��");
			p2.add(button);
		}
		
		JPanel p = new JPanel(); // ��� panel
		add(p);
		p.add(p1);
		p.add(p2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ex3 f = new ex3();
	}

}
