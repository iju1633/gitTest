package ch5;
import java.util.Scanner;

	class score{
		int input;
		
		static void inputscore() {
			System.out.print("������ �Է��ϼ���: ");
		}
		
	}
	
	public class ex3 {
	
		static int sum = 0;

		public static void main(String[] args) {
	
			for(int i=0; i<5; i++) {
				score.inputscore(); // �� ����� ���ؼ� static �ʿ�
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				int input = sc.nextInt();
				sum += input;
			}
			
			System.out.println();
			System.out.println("�հ� : " + sum);
			System.out.print("��� : " + (double)sum/5);
			
			
		}
	
	}
