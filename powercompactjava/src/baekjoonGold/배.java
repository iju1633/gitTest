package baekjoonGold;

import java.util.*;


public class �� {

	public static void main(String[] args) {
		/*
		 * ��� �ڽ��� ��� �ű�µ� ��� �ð��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 1�п� ��� ũ������ ���ÿ� 1���� �ڽ��� �� �� ����
		 * ���� ��� �ڽ��� ��� �ű� �� ������ -1�� ����Ѵ�.
		 */

		/*
		 * IDEA
		 * ũ������ ����(N)�� �ڽ��� ������ �Է��� �޴� ���̴� ArrayList�� �־�� �� ���̴�.
		 * remove�ؼ� ���°� ������ ��������, ȭ�� ������ �迭�� �����ؼ� �迭�� ������ �������� etc.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int carrierNum = sc.nextInt();
		
		ArrayList<Integer> carrier = new ArrayList<Integer>(); // ũ������
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
		
		for(int c : barrier) { // ��� �Ǵ��ؼ� ������ �Ű� �׶����ٺо� �߰��� ���� ����غ� ��. 
			for(int s : carrier) {
				if(s >= c) {
					barrier.remove(Integer.valueOf(c));
				}
			}
		}
	}
	
}
