package baekjoonGold;

import java.util.*;

public class ���� { // �� �Ʒ��� ����ġ�� ����, ���� ������ ���ϴ� ��, ���� ���� ���� �ѵ� ��
	// ������ : ��� �ϸ� �����ϰ� ����ġ�� ���� �� ������? �ߺ� �����ϰ� ��� ����� ���� �� ���ؾ���.

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputs = input.split(" "); 
		
		int row = Integer.parseInt(inputs[0]);
		int col = Integer.parseInt(inputs[1]);
		int[][] array = new int[row][col]; // �迭�� ũ�� �ʱ�ȭ
		
		for(int i=0; i<row; i++) { // �迭 ���¸� �Է� �޴� ����
			String status = sc.nextLine(); // ���� ������ŭ �Է°��� �Է¹����Ƿ� ���߹� ���̿� ��ġ�ϸ� perfect! 
			for(int j=0; j<col; j++) {
				array[i][j] = status.charAt(j)-48 ; // ascii table���� 0�̶�� char�� int ���� 48�̴�. 
			}
		}
		
		int chosen = sc.nextInt();
		int maxRow = 0; // ���� �ִ� ������ ������ ����
		if(chosen > col) {
			chosen -= col;
		}
		for(int i=0; i<chosen; i++) { // ��� ����� ���� ���ϴ� for ��
			
		}
		
		
	}

}
