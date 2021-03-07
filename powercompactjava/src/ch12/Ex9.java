package ch12;

import java.util.*;

public class Ex9 {

	public static void main(String[] args) {

		HashSet<String> array = new HashSet<String>(); // HashSet은 사실 중복제거를 알아서 합니다.

		while (true) { // 무한 반복합니다.

			String randomNum = Integer.toString((int) (Math.random() * 44 + 1));
			array.add(randomNum); // 난수를 생성하고 넣습니다.
			if (array.contains(randomNum)) { // 넣은 난수가 HashSet에 이미 존재해도 아무런 이벤트를 처리하지 않습니다.
			} else
				continue; // 존재하지 않는다면 while 구문을 이어갑니다.
			if (array.size() == 6) { // HashSet의 크기가 6이면 즉, 원소의 개수가 6개이면 while loop를 나옵니다.
				break;
			} else
				continue; // 6보다 작다면(6보다 크다면 진작 while구문을 나왔을 것입니다), while구문을 반복합니다.
		}
		System.out.println("Lotto [set=" + array + "]"); // 결과물 출력 코드입니다.
	}
}