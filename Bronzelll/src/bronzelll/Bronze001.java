package bronzelll;

import java.util.*;

public class Bronze001 { // 놓쳤던 부분 : (1 ≤ a < 100, 1 ≤ b < 1,000,000)이기에 숫자가 너무 커서 java로 표현이 안된다는 것  30분 소요
						 // 그래서 pow 매서드는 쓰면 안된다는 것
						 // a가 10을 넘어설 수 있다는 것. 일의 자리에만 집중을 하다보니 놓침
						 // a%10 == 0인 경우, 즉, a가 10의 배수일 경우를 처음에 추가 안함

	public static void main(String[] args) { // a는 1부터 99까지 존재하기에 틀렸던 것임
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt(); // 테스트 케이스의 수 입력받음
		sc.nextLine();

		int[] array2 = { 2, 4, 8, 6 }; // 같은 수를 계속 곱해나가면 일의 자리는 순환이 됨을 확인
		int[] array3 = { 3, 9, 7, 1 };
		int[] array4 = { 4, 6 };
		int[] array7 = { 7, 9, 3, 1 };
		int[] array8 = { 8, 4, 2, 6 };
		int[] array9 = { 9, 1 };

		int[] array = new int[time];

		for (int i = 0; i < time; i++) { // 테스트 케이스 수 만큼 반복해서 결과값을 도출할 것
			String input = sc.nextLine();
			String[] inputs = input.split(" ");
			int a = Integer.parseInt(inputs[0]); // a : 공백 전의 숫자
			int b = Integer.parseInt(inputs[1]); // b : 공백 뒤의 숫자

			int index1 = b % 4 - 1; // index는 0부터 시작하기에 1을 빼줌
			if (index1 == -1) { // 4번째 숫자를 부르기 위한 방법. 4로 나누기에 해야하는 설정 -> key point!
				index1 = 3;
			}

			int index2 = b % 2 - 1; // 4나 2로 나누는 것은 위의 배열의 원소수가 4거나 2이기 때문
			if (index2 == -1) { // 4때와 동일한 설정
				index2 = 1;
			}

			switch (a % 10) { // 1부터 9까지 일의 자리 수를 array배열에 저장, a의 범위가 1~99인지 몰랐음. 그래서 a%10으로 처리. 계산 원리는 같기 때문.
			case 0: // 맨 처음에 a가 10도 될 수 있다는 것을 잊고 있었음
				array[i] = 10;
				break;
			case 1:
				array[i] = 1;
				break;
			case 2:
				array[i] = array2[index1];
				break;
			case 3:
				array[i] = array3[index1];
				break;
			case 4:
				array[i] = array4[index2];
				break;
			case 5:
				array[i] = 5;
				break;
			case 6:
				array[i] = 6;
				break;
			case 7:
				array[i] = array7[index1];
				break;
			case 8:
				array[i] = array8[index1];
				break;
			case 9:
				array[i] = array9[index2];
				break;
			}
		}
		for (int i = 0; i < array.length; i++) { // 차례대로 array 원소를 출력
			System.out.println(array[i]);
		}
	}

}
