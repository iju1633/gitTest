package baekjoonGold;

import java.util.*;

public class 리모컨 { // 어떻게 하면 복원추출해서 가고 싶은 채널과 최대한 비슷한 수를 생성할 수 있을까?
					// * 생성된 수의 길이는 어떻게 구하면 좋을까?

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wannabe = sc.nextInt(); // 가고 싶은 채널 입력받음
		int unavailable = sc.nextInt(); // 고장난 키의 개수 입력받음
		
		ArrayList<Integer> button = new ArrayList<Integer>();
		for(int i=0; i<=9; i++) { // 0~9까지 들어있는 button 배열 생성
			button.add(i);
		}
		
		for(int i=0; i<unavailable; i++) { // 고장난 버튼은 button 배열에서 제거함.
			int input = sc.nextInt();
			button.remove(input); // 고장난 버튼 값과 index값이 같아서 remove 매서드 사용 가능.
		}
		
		// 복원추출해서 가고 싶은 채널과 최대한 비슷한 수를 생성
		// 생성된 수의 길이 + (int) Math.abs(가고 싶은 채널 - 최대한 비슷한 수) 의 값을
		// (int) Math.abs(가고싶은 채널-100) 과 비교해서 작거나 같은 값을 출력 
	}

}
