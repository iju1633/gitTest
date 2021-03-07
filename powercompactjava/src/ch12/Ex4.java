package ch12;

import java.util.*;

public class Ex4 {

	public static void main(String[] args) { // 교집합이든 합집합이든 한 번 실행하면 . 앞의 변수가 변하니까 새로 하나더 만든 거야.
		
	
		Set<String> s1 = new HashSet<>(Arrays.asList("A", "B", "C"));
		Set<String> s2 = new HashSet<>(Arrays.asList("A", "D"));
		Set<String> s3 = new HashSet<>(Arrays.asList("A", "B", "C"));
		
		s1.addAll(s2);
		s2.retainAll(s3);
		System.out.print("합집합 " + s1);
		
		System.out.println();
		
		System.out.print("교집합 " + s2);
	}

}
