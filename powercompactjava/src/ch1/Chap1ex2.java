package ch1;

import java.util.Scanner;


public class Chap1ex2 {
	
	public static void main(String[] args) {
		
	
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		
		
		System.out.println("당신의 이름을 기입해주세요 : ");
		String name = input1.next();
		
		System.out.println("당신의 주소 기입해주세요 : ");
		String address = input2.nextLine(); // 공백을 포함한 문자를 입력받으려면 nextLine입니다. 그냥 문자는 next
		
		System.out.println("당신의 전화번호를 기입해주세요(괄호포함) : ");
		String phoneNum = input3.next();
		
		System.out.println("당신의 학과를 기입해주세요 : ");
		String major = input4.next();
		
		
		
		System.out.println("------------");
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);
		System.out.println("전화번호: " + phoneNum);		
		System.out.println("학과: " + major);
		
		input1.close();
		input2.close();
		input3.close();
		input4.close();
		
}
	
}
