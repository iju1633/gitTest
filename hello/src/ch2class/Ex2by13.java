package ch2class;

import java.util.*;
public class Ex2by13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�簢���� ���θ� �Է��Ͻÿ�: ");
		int width = sc.nextInt();
		// System.out.println(); �Է��� �� enter�ϹǷ� �ٹٲ� �ʿ����!!
		
		System.out.print("�簢���� ���θ� �Է��Ͻÿ�: ");
		int height = sc.nextInt();
		
		System.out.println("�簢���� ���̴� "+ (double)width*height);
		System.out.println("�簢���� �ѷ��� "+ (double)2*(width+height));
	}

}
