package ch8;

import javax.swing.*;

@SuppressWarnings("serial")
public class ex4 extends JFrame {
	
	public ex4() {
		setSize(300, 150);
		setTitle("My Frame");
		
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null); // ��ġ �����ڸ� �������� �������μ� ���� ��ġ�� ����� �� ����. �� ������ �� �� ��� �ڵ����� ��ġ �����ڰ� �����Ǵµ�,�׷��� ���ĵ�. 
		JLabel[] label = new JLabel[30]; // �� 30���� ���� �� ����.
		
		for(int i=0 ; i<30 ; i++) {
			label[i] = new JLabel("" + i); // JLabel �ȿ� ���ڸ� �־��ֱ� ���� i���ٰ� ""�� �־� ���ڷ� �ν��ϰ� �� -> i��� ���ڰ� label�̶�� �迭�� ���Բ��ϴ� �Լ�
			int x = (int) (300*Math.random());
			int y = (int) (150*Math.random());
			label[i].setBounds(x, y, 20, 20); // �迭�� ��ġ�� �ұ�Ģ�ϰ� �� ����.
			panel.add(label[i]);
		}
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ex4 f = new ex4();
	}

}
