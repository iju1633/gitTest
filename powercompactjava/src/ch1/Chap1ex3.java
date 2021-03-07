package ch1;

import java.util.Scanner;

public class Chap1ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력하고 싶으세요(홀수) : ");
		
		int n = sc.nextInt();
		
		int a = 1; // 시작하는 별의 개수
		int b = n/2; // 시작하는 공백의 개수
		
		for(int i=0; i<n; i++) {
			if(i<n/2) {
				for(int j=b; j>0; j--) {
					System.out.print(" ");
				}
				for(int j = 0; j<a; j++) {
					System.out.print("*");
				}
				for(int j=b; j>0; j--) {
					System.out.print(" ");
				}
				System.out.println();
				a+=2;
				b--;
			}
			else {
				for(int j=b; j>0; j--) {
					System.out.print(" ");
				}
				for(int j = 0; j<a; j++) {
					System.out.print("*");
				}
				for(int j=b; j>0; j--) {
					System.out.print(" ");
				}
				System.out.println();
				a-=2;
				b++;
			}
		}
		
		
/*
		int count = sc.nextInt();
		int input = count / 2;

		for (int i = -input; i <= input; i++) { // 입력받은 수 만큼 줄 생성하기 위함.
			int k = 0; // 비교하기위해 k를 선언 동시에 별찍고 다음 줄로 넘어갈떄마다 초기화함.
			for (int j = 0; j < count - Math.abs(i); j++) { // Math.abs(a) : 절대값, 공백과 별 포함해서 3개 4개 5개 4개 3개 출력해야함.(5줄이라면)

				String result = k < Math.abs(i) ? " " : "*";
				System.out.print(result);
				k++;
			}
			System.out.println();
		}
	ex)	  *  
		 *** 
		*****
		 ***
		  *
*/
	}

}
