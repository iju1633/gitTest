package ch9;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.*;

@SuppressWarnings("serial")  // 이상한다.. 난수 중복제거해서 출력하는 것만 실행하면 frame자체가 안나옴.
public class AnotherEx6 extends JFrame {
	public AnotherEx6() {
		
		setSize(300,300);
		setTitle("puzzle");
		setLocationRelativeTo(null);
		
		GridLayout grid = new GridLayout(3,3,1,1);
		setLayout(grid);
		
		JButton[] arButtons = new JButton[16];
		String[] number = {" ", "1", "2", "3", "4", "5", "6", "7", "8"};
		
		for(int i=0; i<1000; i++) {
			int r = new Random().nextInt(8)+0;
			
			String s = number[0];
			number[0] = number[r];
			number[r] = s;
		}
		for(int i=0; i<9; i++) {
			arButtons[i] = new JButton(number[i]);
			arButtons[i].setName("" + i);
			add(arButtons[i]);
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		AnotherEx6 ex6 = new AnotherEx6();
	}

}
