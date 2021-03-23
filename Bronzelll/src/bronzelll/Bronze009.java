package bronzelll;

import java.util.*;

public class Bronze009 { // 20분 걸림

	public static void main(String[] args) { // 실수한 점 : 코딩 짜는데 심취해서 0입력까지 계속 입력받아야하는 사실을 망각함
												// 잘한 점 : 아이디어를 거의 다 구체화함, 어떻게 할 건지 구체적으로 적어놔서 막힌 일이 없었음, 2개씩 끊어서 판단해야하는
												// 문제인데 아이디어를 잘 생각해서 for문 한번으로 문제를 해결할 수 있게 함!! key point!!
		Scanner sc = new Scanner(System.in);
		String input;

		ArrayList<Integer> result = new ArrayList<Integer>();
		while (true) {
			input = sc.nextLine();

			if (input.equals("0")) {
				break;
			}

			String[] inputs = input.split(" ");

			int[] array = new int[inputs.length];
			for (int i = 0; i < inputs.length; i++) {
				array[i] = Integer.parseInt(inputs[i]);
			}

			int a = 1;
			for (int i = 1; i < array.length - 1; i += 2) { // key point! 2중 for문을 사용하지 않아도 됨(또한, 나이는 필요하지 않다는 것을 깨달아 i가
															// 1부터 시작함)
				a = a * array[i] - array[i + 1];
			}
			result.add(a);
		}

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

}
