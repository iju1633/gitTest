package bronzelll;

import java.util.*;
public class Bronze002 { // 13�� �ҿ�

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] inputs = input.split(" "); // x,y,w,h ���ʴ�� �Է¹����� split�ؼ� �ش� ������ ����
		int x = Integer.parseInt(inputs[0]);
		int y = Integer.parseInt(inputs[1]);
		int w = Integer.parseInt(inputs[2]);
		int h = Integer.parseInt(inputs[3]);
		
		int a = h-y; // ���� �� �ִ� 4������ ��� ����
		int b = x;
		int c = y;
		int d = w-x;
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(a);
		array.add(b);
		array.add(c);
		array.add(d);
		
		array.sort(Comparator.naturalOrder()); // ���������ؼ� �����ϰ� ũ�� ��
		
		System.out.println(array.get(0)); // ���� ���� �� ���
	}

}
