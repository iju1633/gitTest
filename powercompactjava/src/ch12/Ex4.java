package ch12;

import java.util.*;

public class Ex4 {

	public static void main(String[] args) { // �������̵� �������̵� �� �� �����ϸ� . ���� ������ ���ϴϱ� ���� �ϳ��� ���� �ž�.
		
	
		Set<String> s1 = new HashSet<>(Arrays.asList("A", "B", "C"));
		Set<String> s2 = new HashSet<>(Arrays.asList("A", "D"));
		Set<String> s3 = new HashSet<>(Arrays.asList("A", "B", "C"));
		
		s1.addAll(s2);
		s2.retainAll(s3);
		System.out.print("������ " + s1);
		
		System.out.println();
		
		System.out.print("������ " + s2);
	}

}
