package ch5Assignment;

import java.util.*;
public class EX5_1 { // 끝내는 경우도 있어야 한다고 생각해서 질문드립니다.
					//-1을 넣으면 예약이 종료되었습니다.라는 표현 출력 후, 반복문이 끝나게 했는데, 
					// 이렇게 하면 에듀클래스에 보여주신 예시와 조금 다르게 2번째 좌석을 2번 예약하면 시스템이 
					//종료하지 않고 몇번째 좌석을 예약할건지 게속 물어봅니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		for(int i=0; i<array.length; i++) {
			array[i]= 0;
		}
		
		System.out.println("---------------------");
		System.out.println("0 1 2 3 4 5 6 7 8 9");
		System.out.println("---------------------");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		while(true) {
			
			System.out.println();
			System.out.print("몇번째 좌석을 예약하시겠습니까? ");
			int input = sc.nextInt();
			
			if(input == -1) {
				System.out.println("예약이 종료되었습니다.");
				break;
			}
			
			if(array[input] == 1) {
				System.out.println("예약할수없습니다.");
			}
			else {
				array[input] = 1;
				System.out.println("예약되었습니다.");
			}
			
			System.out.println();
			System.out.println("---------------------");
			System.out.println("0 1 2 3 4 5 6 7 8 9");
			System.out.println("---------------------");
			for(int i=0; i<array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
	}

}
