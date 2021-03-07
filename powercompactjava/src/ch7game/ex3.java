package ch7game;

import java.util.Scanner;

	public class ex3 {
	
		public static void main(String[] args) {
			
			
		//cpu
		String[] value = {"가위", "바위", "보"};
		int max = 2;
		int min = 0;
		int pick = (int)(Math.random()*(max - min)) + min; // 0~2 사이의 정수 임의로 선택
		
			
			
		// me	
		
			
		System.out.print("하나를 선택하시요 : 가위(0), 바위(1), 보(2) : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
			
		if(num<0 || num>2) System.out.println("잘못된 수가 입력되었습니다.");
		else {
					
			System.out.println("컴퓨터는 " + value[pick] + "를 냈습니다.");
			
			if(pick == num) System.out.println("비겼습니다.");
			else if((pick == 0 && num ==1) || (pick == 1 && num == 2) || (pick == 2 && num == 0) ) System.out.println("이겼습니다.");
			else System.out.println("졌습니다.");
			
			sc.close();
			
			}
		}
	
	}
