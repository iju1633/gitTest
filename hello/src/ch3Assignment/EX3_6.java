package ch3Assignment;

import java.util.Scanner;

public class EX3_6 {

	public static void main(String[] args) { // ���� ��쿡 ���ؼ��� �ٷ��� �ʾ���
		// �ڵ��� �帧 : ���� ���� ���´� -> �������� Ȯ�� -> �ƴϸ� ��ǻ�Ͱ� ���� ���´� -> �������� Ȯ�� -> �ݺ�(���� ���� ���� ����)
		// ������ ��� ������ ����ϰ� ��� ��� �� ���� ����

		char[][] board = new char[3][3];
		int x, y;

		Scanner sc = new Scanner(System.in);
		// ������ �ʱ�ȭ
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}

		outer: do {
			// �ٵ��� �׸���(O�� X�� �� �ڸ��� ����� ����)
			for (int i = 0; i < 3; i++) {
				System.out.println("  " + board[i][0] + "|  " + board[i][1] + "|  " + board[i][2]);

				if (i != 2) {
					System.out.println("---|---|---");
				}
			}

			// ���� ���� ��ǥ �Է�
			System.out.print("���� ���� ��ǥ�� �Է��Ͻÿ�: ");
			x = sc.nextInt();
			y = sc.nextInt(); // ���� ���� �ٵϵ��� ��ǥ �Է��ϱ�

			if (board[x][y] != ' ') { // ������� ������ �ٽ��ϰ� �ƴϸ� X ǥ���ϱ�
				System.out.println("�߸��� ��ġ�Դϴ�. ");
				continue;
			} else {
				board[x][y] = 'X';
			}

			// ��ǻ�Ͱ� ���� ���� ���� �߿���(���� ���� ����, �������� �Ǵ��ϰ� ���� ���ƾ���. ���� ���� ��ǻ�͵� ���� �Ǵ��ϸ� �Ѵ� �¸� ����)
			// ��ǻ�Ͱ� ���� �ڸ� : ���������� ���������̶�� ���� �Ѱ� -> �����Ϸ��� random���� �ٲ��� �ʿ� ����

			int cnt = 0; // ���º��� ��츦 ����ؼ� ���� ����
			
			// ���μ� ��
			for (int k = 0; k < 3; k++) { // ���� �� 3��
				if (board[k][0] == 'O' && board[k][1] == 'O' && board[k][2] == 'O') { // ������ ���ؼ� ��� ���� O�̸� computer
																						// won! ����ϰ� ���α׷� ��������
					cnt++;
					for (int l = 0; l < 3; l++) { // �ٵ��� ��� �����ֱ�
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("��ǻ�� �¸�");
					break outer;

				} else if (board[k][0] == 'X' && board[k][1] == 'X' && board[k][2] == 'X') {
					
					cnt++;
					for (int l = 0; l < 3; l++) { // �ٵ��� ��� �����ֱ�
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("�ΰ� �¸�");
					break outer;
				}
			}

			// ���μ� ��
			for (int k = 0; k < 3; k++) { // ���� �� 3��
				if (board[0][k] == 'O' && board[1][k] == 'O' && board[2][k] == 'O') {
					cnt++;
					for (int l = 0; l < 3; l++) { // �ٵ��� ��� �����ֱ�
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("��ǻ�� �¸�");
					break outer;
				} else if (board[0][k] == 'X' && board[1][k] == 'X' && board[2][k] == 'X') {
					cnt++;
					for (int l = 0; l < 3; l++) { // �ٵ��� ��� �����ֱ�
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("�ΰ� �¸�");
					break outer;
				}

			}

			// �밢�� \���

			if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
				cnt++;
				for (int k = 0; k < 3; k++) { // �ٵ��� �׸���(O�� X�� �� �ڸ��� ����� ����)
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("��ǻ�� �¸�");
				break;
			} else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
				cnt++;
				for (int k = 0; k < 3; k++) { // �ٵ��� �׸���(O�� X�� �� �ڸ��� ����� ����)
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("�ΰ� �¸�");
				break;
			}

			// �밢�� /���

			if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
				cnt++;
				for (int k = 0; k < 3; k++) { // �ٵ��� �׸���(O�� X�� �� �ڸ��� ����� ����)
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("��ǻ�� �¸�");
				break;
			} else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
				cnt++;
				for (int k = 0; k < 3; k++) { // �ٵ��� �׸���(O�� X�� �� �ڸ��� ����� ����)
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("�ΰ� �¸�");
				break;
			}
			

			// ��ǻ�Ͱ� ���� ���� ����
			/*
			 * random���� ��ǻ�Ͱ� ���� ���� ����
			 * for(int m = 0; m<1; m++) { 
			 * int i = (int) (Math.random()*3); 
			 * int j = (int) (Math.random()*3); 
			 * 		if(board[i][j] != ' ') {
			 * 			m--; 
			 * 			continue;
			 * 		} 
			 * 		else board[i][j] = 'O';
			 * }
			 */
			
			outter: for (int i = 0; i < 3; i++) { // �ش� ��ǥ�� ����ִٸ�, O ǥ��
				for (int j = 0; j < 3; j++) {
					if (board[i][j] == ' ') {
						board[i][j] = 'O';
						break outter; // �׳� break�ϰ� �Ǹ� �ະ�� �� Oǥ�õ�
					}
				}
			}

			// ���μ� ��
			for (int k = 0; k < 3; k++) { // ���� �� 3��
				if (board[k][0] == 'O' && board[k][1] == 'O' && board[k][2] == 'O') { // ������ ���ؼ� ��� ���� O�̸� computer won! ����ϰ� ���α׷� ��������
					cnt++;
					for (int l = 0; l < 3; l++) { // �ٵ��� ��� �����ֱ�
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("��ǻ�� �¸�");
					break outer;

				} else if (board[k][0] == 'X' && board[k][1] == 'X' && board[k][2] == 'X') {
					cnt++;
					for (int l = 0; l < 3; l++) { // �ٵ��� ��� �����ֱ�
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("�ΰ� �¸�");
					break outer;
				}
			}

			// ���μ� ��
			for (int k = 0; k < 3; k++) { // ���� �� 3��
				if (board[0][k] == 'O' && board[1][k] == 'O' && board[2][k] == 'O') {
					cnt++;
					for (int l = 0; l < 3; l++) { // �ٵ��� ��� �����ֱ�
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("��ǻ�� �¸�");
					break outer;
				} else if (board[0][k] == 'X' && board[1][k] == 'X' && board[2][k] == 'X') {
					cnt++;
					for (int l = 0; l < 3; l++) { // �ٵ��� ��� �����ֱ�
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("�ΰ� �¸�");
					break outer;
				}

			}

			// �밢�� \���

			if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
				cnt++;
				for (int k = 0; k < 3; k++) { // �ٵ��� ��� �����ֱ�
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("��ǻ�� �¸�");
				break;
			} else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
				cnt++;
				for (int k = 0; k < 3; k++) { // �ٵ��� ��� �����ֱ�
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("�ΰ� �¸�");
				break;
			}

			// �밢�� /���
				
			if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
				cnt++;
				for (int k = 0; k < 3; k++) { // �ٵ��� ��� �����ֱ�
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("��ǻ�� �¸�");
				break;
			} else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
				cnt++;
				for (int k = 0; k < 3; k++) { // �ٵ��� ��� �����ֱ�
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("�ΰ� �¸�");
				break;
			}
			
			
			// ���� ���
			
			boolean isEmpty = false; // �������� ����� �ִ°��� �Ǻ��� ���� ����
			outter2 : for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if (board[i][j] == ' ') { // �� ���� �ִٸ� ���ºθ� �Ǻ��� ���� �ƴ�
						isEmpty = true;
					}
					if(isEmpty == true) {
						break outter2;
					}
				}
			} // �ٵ����� ������� �ʴٸ� if������ ������
			if(cnt == 0 && isEmpty == false) { // �� ���ִµ� ����Ȱ� ���ٸ� ���ٰ� ��� ���
				for (int l = 0; l < 3; l++) { // �ٵ��� ��� �����ֱ�
					System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

					if (l != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("���º�");
				break;
			}
			

		} while (true);

	}

}
