package ch2class;

import java.util.*;
public class Ex2Mini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("ȭ���µ��� �Է��Ͻÿ�: ");
		Double F = sc.nextDouble();
		
		Double C = 5.0/9 * (F - 32); // 5/9*() �ϰ� �Ǹ� 5/9�� 0�⿡ �ҰŸ� (double)5/9 * (F - 32)�ؾߵ� or 5.0/9*()
		System.out.println("�����µ��� " + C);
	}

}
