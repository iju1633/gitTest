package bronzelll;

import java.util.*;

public class Bronze006 { // 3시간 걸림

	public static void main(String[] args) { // 잘 안된 점 : 너무 어렵게 생각함, 벨소리가 0초부터 울리는 것을 파악 못함(제대로 안 읽음), 핵심코드의 위치, while구문을 사용하면 간결하게 해결 가능
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String[] inputs = input.split(" ");
		int n = Integer.parseInt(inputs[0]);
		int l = Integer.parseInt(inputs[1]);
		int d = Integer.parseInt(inputs[2]);

		boolean time[] = new boolean[n * l + 5 * (n - 1)]; // boolean으로 판단해서 품, 노래가 들어지고 있는 부분은 true로 설정
		for (int i = 0; i < n; i++) {
			int s = (l + 5) * i; // 노래가 틀어질 위치(핵심 코드)
			for (int j = s; j < s + l; j++) { // 노래 길이만큼 플레이
				time[j] = true;
			}
		}
		int answer = 0; // 벨소리는 0초부터 울리므로 0으로 초기화 중요!
		while (answer < time.length) { // 벨소리가 울릴 시간만큼 계속 더해나가면서 false이면 break하는 건데, 만약 시간이 전체 배열의 크기보다 크면 바로 break해야하니까 while문 조건이 이렇게 됨
			if (!time[answer]) // 벨소리가 울리는 시각에 false이면, 즉, 아무소리도 나고 있진 않다면
				break;
			answer += d;
		}
		System.out.println(answer); // 정답 출력!
	}

}
