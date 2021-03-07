package exercise;

import java.util.Scanner;

public class 사각형찍기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		int b = 0; // 첫 번째, 세 번째 공백
		int b2 = n-4; // 중간 공백
		
		for (int i = 0; i < n - 2; i++) { // 맨 위랑 아래 줄 빼고 줄 수
			if (i < (n-2) / 2) { // 맨윗줄을 제외하고 가운데줄 전까지
				System.out.print("*");
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=b2; j>0; j--) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
				b++;
				b2 -=2;
			} else if (i == (n-2)/2) { // 가운데 줄
				System.out.print("*");
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
				b--;
			} else { // 맨 아랫줄을 제외하고 가운데 줄 아래부터 끝까지
				b2 += 2;
				System.out.print("*");
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=0; j<b2; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
				b--;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}

