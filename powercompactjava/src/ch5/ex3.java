package ch5;
import java.util.Scanner;

	class score{
		int input;
		
		static void inputscore() {
			System.out.print("성적을 입력하세요: ");
		}
		
	}
	
	public class ex3 {
	
		static int sum = 0;

		public static void main(String[] args) {
	
			for(int i=0; i<5; i++) {
				score.inputscore(); // 이 방법을 위해서 static 필요
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				int input = sc.nextInt();
				sum += input;
			}
			
			System.out.println();
			System.out.println("합계 : " + sum);
			System.out.print("평균 : " + (double)sum/5);
			
			
		}
	
	}
