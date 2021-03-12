package baekjoonGold;

import java.util.*;


public class 배 {

	public static void main(String[] args) {
		/*
		 * 모든 박스를 배로 옮기는데 드는 시간의 최솟값을 구하는 프로그램을 작성하시오.
		 * 1분에 모든 크레인이 동시에 1개의 박스만 들 수 있음
		 * 만약 모든 박스를 배로 옮길 수 없으면 -1을 출력한다.
		 */

		/*
		 * IDEA
		 * 크레인의 개수(N)와 박스의 개수도 입력을 받는 것이니 ArrayList에 넣어야 할 것이다.
		 * remove해서 남는게 없으면 종료할지, 화물 개수의 배열을 선언해서 배열이 꽉차면 종료할지 etc.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int carrierNum = sc.nextInt();
		
		ArrayList<Integer> carrier = new ArrayList<Integer>(); // 크레인의
		for(int i=0; i<carrierNum; i++) {
			int input = sc.nextInt();
			carrier.add(input);
		}
		
		ArrayList<Integer> barrier = new ArrayList<Integer>();
		int barrierNum = sc.nextInt();
		for(int i=0; i<carrierNum; i++) {
			int input = sc.nextInt();
			barrier.add(input);
		}
		
		carrier.sort(Comparator.naturalOrder());
		barrier.sort(Comparator.naturalOrder());
		
		for(int c : barrier) { // 어떻게 판단해서 삭제할 거고 그때마다분씩 추가할 건지 고민해볼 것. 
			for(int s : carrier) {
				if(s >= c) {
					barrier.remove(Integer.valueOf(c));
				}
			}
		}
	}
	
}
