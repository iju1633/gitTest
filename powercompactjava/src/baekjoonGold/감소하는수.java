package baekjoonGold;

import java.util.ArrayList;
import java.util.Scanner;

public class 감소하는수 { // 부족한 점 : while 구문으로 1,000,001번 돌려야하니 메모리가 당연 부족할 것이다. 규칙을 찾아 배열을 선언할 필요가 없게 해보자.

	/*
	 * PROBLEM 최고자리수의 수부터 작은자릿수의 수까지 계속 감소해야 감소하는 수임 input으로 N이 주어지면 N번째 감소하는 수를
	 * 출력하면 됨. 감소하는 수 >= 0
	 */

	/*
	 * IDEA 1. 감소하는 수를 List배열에 넣을 것임(while true 구문에서 배열의 크기가 1,000,001보다 커지면 break;
	 * -> N이 1,000,000보다 작고, 0이 0번째 감소하는 수라고 했으니까 감소하는 수가 들어갈 배열의 크기는 최대
	 * 1,000,001이다. 2. N을 입력받아서 감소하는 수가 들어가는 배열의 N번째 index의 값을 출력하면 됨(index는 0부터
	 * 시작하는데, 0이 0번째 감소하는 수라고 명시함)
	 */

	public static void main(String[] args) {

		ArrayList<Integer> reduceNumArray = new ArrayList<Integer>(); // 감소하는 수가 들어갈 배열

		boolean isReduceNum = true;
		boolean check = true;
		int num = 0; // 이 구문이 while 구문 안에 있으면 계속 초기화 되므로 배열안에 들어갈 숫자는 0밖에 없음.

		while (true) {
			if (num < 10) {
				reduceNumArray.add(num); // 자릿수가 한 자리면 다 감소하는 수임. num++구문이 이루어져야하므로 continue는 쓰면 안됨.
			} else {
				String number = Integer.toString(num); // num은 String으로 바꿔서 split하고 각 자릿수를 비교할 예정.
				String[] numbers = number.split("");

				for (int i = 0; i < numbers.length - 1; i++) {
					if (Integer.parseInt(numbers[i]) <= Integer.parseInt(numbers[i + 1])) {
						isReduceNum = false;
					}
					if (isReduceNum == false) { // 모든 자릿수를 다 비교한 후에 하나라도 조건에 안 맞으면 num++를 해야하므로 check 변수를 하나더 설정함.
						check = false; // 감소하는 수가 아닐 때, check가 변함. 아니면 계속 true임.
					}
				}
				if (check == true) { // 자릿수 별로 다 비교해보면서 문제의 조건을 다 충족했다면,
					reduceNumArray.add(num);
				}
			}
			num++; // num은 0부터 1씩 올라가면 감소하는 수인지 판단할 것임.

			if (reduceNumArray.size() > 1000001) { // N의 범위를 통해 배열의 최대 크기를 알 수 있었음.
				break;
			}
		}

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (reduceNumArray.get(N) == null) {
			System.out.println("-1");
		} else
			System.out.println(reduceNumArray.get(N));

	}
}
