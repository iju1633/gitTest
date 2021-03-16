package bronzelll;

import java.util.*;

public class Bronze005 {

	public static void main(String[] args) { // 15분 소요
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (true) {
			int input = sc.nextInt();
			if (input == 0) { // 0 나올 때까지 입력값 받는 것
				break;
			}

			int sum = 0;

			for (int i = 0; i < Integer.toString(input).length(); i++) { // 잘한 점 : 입력받은 정수값을 split하지 않고 charAt으로 처리한 것, 객체 생성부분을 반복문 안에 넣지 않은 것, list를 반복문 밖에 생성해서 출력을 편리하게 한 것
				if (Integer.toString(input).charAt(i) == '1') { // 실수한 부분 : 처음에 charAt(0)이라고 함
					sum += 2;
				} else if (Integer.toString(input).charAt(i) == '0') {
					sum += 4;
				} else
					sum += 3;
			}

			sum += Integer.toString(input).length() - 1 + 2; // 숫자 사이의 공백와 호수판 경계사이의 공백을 계산한 것
			array.add(sum);
		}

		for (int i = 0; i < array.size(); i++) { // 결과값 출력
			System.out.println(array.get(i));
		}
	}

}
