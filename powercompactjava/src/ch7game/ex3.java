package ch7game;

import java.util.Scanner;

	public class ex3 {
	
		public static void main(String[] args) {
			
			
		//cpu
		String[] value = {"����", "����", "��"};
		int max = 2;
		int min = 0;
		int pick = (int)(Math.random()*(max - min)) + min; // 0~2 ������ ���� ���Ƿ� ����
		
			
			
		// me	
		
			
		System.out.print("�ϳ��� �����Ͻÿ� : ����(0), ����(1), ��(2) : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
			
		if(num<0 || num>2) System.out.println("�߸��� ���� �ԷµǾ����ϴ�.");
		else {
					
			System.out.println("��ǻ�ʹ� " + value[pick] + "�� �½��ϴ�.");
			
			if(pick == num) System.out.println("�����ϴ�.");
			else if((pick == 0 && num ==1) || (pick == 1 && num == 2) || (pick == 2 && num == 0) ) System.out.println("�̰���ϴ�.");
			else System.out.println("�����ϴ�.");
			
			sc.close();
			
			}
		}
	
	}
