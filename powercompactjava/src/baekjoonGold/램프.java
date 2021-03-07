package baekjoonGold;

import java.util.*;

public class 램프 { // 열 아래에 스위치가 있음, 행의 개수를 구하는 것, 같은 것을 껐다 켜도 됨
	// 문제점 : 어떻게 하면 랜덤하게 스위치를 누를 수 있을까? 중복 가능하게 모든 경우의 수를 다 비교해야함.

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputs = input.split(" "); 
		
		int row = Integer.parseInt(inputs[0]);
		int col = Integer.parseInt(inputs[1]);
		int[][] array = new int[row][col]; // 배열의 크기 초기화
		
		for(int i=0; i<row; i++) { // 배열 상태를 입력 받는 과정
			String status = sc.nextLine(); // 행의 개수만큼 입력값을 입력받으므로 이중문 사이에 위치하면 perfect! 
			for(int j=0; j<col; j++) {
				array[i][j] = status.charAt(j)-48 ; // ascii table에서 0이라는 char의 int 값은 48이다. 
			}
		}
		
		int chosen = sc.nextInt();
		int maxRow = 0; // 행의 최대 개수를 저장할 변수
		if(chosen > col) {
			chosen -= col;
		}
		for(int i=0; i<chosen; i++) { // 모든 경우의 수를 비교하는 for 문
			
		}
		
		
	}

}
