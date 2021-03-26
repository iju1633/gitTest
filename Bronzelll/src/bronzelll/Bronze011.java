package bronzelll;

import java.util.*;

public class Bronze011 { // 24분 걸림
	// 분석에 2분 걸렸는데 분석시간을 좀 더 할애해서 어떻게 풀지 완벽히 구상했다면 틀리는 일 없이 한 번에 끝났을 것 같다
	public static void main(String[] args) { // 부족했던 점 : switch case 문법 헷갈림, 특수문자 \을 나타내고자 할 땐 \\, 변하는 i를 제대로 활용하기
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>(); // 결과값들을 넣을 배열
		while (true) {

			String input = sc.next();
			if (input.equals("#")) { // 입력받은 값이 #이면 종료
				break;
			}
			String[] inputs = input.split("");
			int sum = 0;
			for (int i = 0; i < input.length(); i++) {
				switch (inputs[i]) { // 입력받은 것들을 숫자 모양의 문자로 바꿔준다
				case "-":
					inputs[i] = "0";
					break;
				case "\\":
					inputs[i] = "1";
					break;
				case "(":
					inputs[i] = "2";
					break;
				case "@":
					inputs[i] = "3";
					break;
				case "?":
					inputs[i] = "4";
					break;
				case ">":
					inputs[i] = "5";
					break;
				case "&":
					inputs[i] = "6";
					break;
				case "%":
					inputs[i] = "7";
					break;
				case "/":
					inputs[i] = "-1";
					break;
				}
				// 문자는 정수로 바꾸고, 그 값에 차례대로 8의 문자의 길이-i-1 제곱을 해서 계속 더해나간다
				sum += (Integer.parseInt(inputs[i]) * (int) Math.pow(8, input.length() - i - 1)); // key point!!
			}
			array.add(sum); // 결과값을 array에 저장
		}
		for (int i = 0; i < array.size(); i++) { // 결과값 출력
			System.out.println(array.get(i));
		}
	}

}
