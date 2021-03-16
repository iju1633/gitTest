package bronzelll;

import java.util.*;
public class Bronze002 { // 13분 소요

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] inputs = input.split(" "); // x,y,w,h 차례대로 입력받으니 split해서 해당 변수로 저장
		int x = Integer.parseInt(inputs[0]);
		int y = Integer.parseInt(inputs[1]);
		int w = Integer.parseInt(inputs[2]);
		int h = Integer.parseInt(inputs[3]);
		
		int a = h-y; // 나올 수 있는 4가지의 경우 정리
		int b = x;
		int c = y;
		int d = w-x;
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(a);
		array.add(b);
		array.add(c);
		array.add(d);
		
		array.sort(Comparator.naturalOrder()); // 오름차순해서 간단하게 크기 비교
		
		System.out.println(array.get(0)); // 제일 작은 거 출력
	}

}
