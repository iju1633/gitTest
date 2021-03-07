package ch5;

import java.util.Scanner;


public class ex2 {
		
		public static void main(String[] args) {
	
			System.out.println("-------------------------");
			int[] a = new int[10];				 // key
			for(int i=0; i<10; i++) {
				a[i] = i;
				System.out.print(a[i] + " ");
			}
			System.out.println();
			System.out.println("-------------------------");
			
			for(int i=0; i<10; i++) {
				System.out.print(0 + " ");
			}
			System.out.println();
			System.out.println("-------------------------");
			
			System.out.print("몇번 쨰 좌석을 예약하시겠습니까?");
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num<0) {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
			}
			else if(num>9) {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
			}
			else {
				System.out.println("예약되었습니다." );
				System.out.println();
			
			
			System.out.println("-------------------------");
			int[] seats = new int[10];
			for(int i=0; i<10; i++) {
				seats[i] = i;
				System.out.print(seats[i] + " ");
			}
			System.out.println();
			System.out.println("-------------------------");
			int[] result = new int[10];
			for(int i=0; i<10; i++) {
				result[i] = 0;
				result[num] = 1;
				System.out.print(result[i] + " ");
			}
			
			System.out.println();
			System.out.println("-------------------------");
			}
			sc.close();
			
	}
}
