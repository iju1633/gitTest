package bronzelll;

import java.util.*;
public class Bronze013 {

	public static void main(String[] args) { // Idea : �׵θ��� ���ְ��� �Ǻ�. ������ ���� �ȵ�
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] inputs = input.split(" ");
		int M = Integer.parseInt(inputs[0]);
		int N = Integer.parseInt(inputs[1]);
		
		int answer = 0;
		while(true) {
			answer += 4;
			M-=2;
			N-=2;
			
			if(M == 1) {
				if(N == 1) {
					answer++;
					break;
				}
			}
			else if(M == 0) {
				break;
			}
		}
		System.out.println(answer);
		
	}

}
