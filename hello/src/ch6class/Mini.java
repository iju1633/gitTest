package ch6class;

import java.util.Scanner; //  ���� �ȵǴ� ��, �����µ��� ��� ������ ���� M�� �����̴� ���� ���� ����

// ������ �������� ���, x�� y��� + - 1�� �Ǳ⿡ �밢�����ε� ������ �� ����
// ���Ϳ� ����ڰ� �����ų� ���Ͱ� ���� ����, Monster has got me, Monster has got gold ��
// ����ڰ� ��带 ������ I have got gold�� ����� ��
// ����ڿ� ���Ͱ� ��� # �ȿ����� �����̵��� ������ ��
// ���ÿ� gold�� �� ��� draw�� ����ϰ� �迭�� ����� ��

abstract class Sprite {
	int x = 3;
	int y = 3;
	static char[][] board = new char[10][19];

	abstract void move(char c);
}

class User extends Sprite {

	void move(char c) {
		if (c == 'h') {
			--y;
		} else if (c == 'j') {
			--x;
		} else if (c == 'k') {
			++x;
		} else if (c == 'l') {
			++y;
		}
	}

	void remove() {
		board[x][y] = ' ';
	}

	void update() { // user�� ��ġ ����
		board[x][y] = '@';
	}
}

class Gold extends Sprite {
	public Gold() {
		x = 3;
		y = 6;
	}

	void move(char c) {
	}

	void remove() {
		board[x][y] = ' ';
	}

	void update() { // gold�� ��ġ ����
		board[x][y] = 'G';
	}

}

class Monster extends Sprite {
	public Monster() {
		x = y = 7;
	}

	void move(char c) { // user�� �������� �˾Ƽ� #�� ��ġ�� �ʰ� ������� �ϰ�, monster�� #�� ��ġ�� �ʵ��� ����������
	}

	void move() {
		// x�� ���ؼ��� 0���� 19�� �ε����� # ����
		x += (Math.random() - 0.5) > 0 ? 1 : -1;

		// y�� ���ؼ��� 0���� 10�� �ε����� # ����
		y += (Math.random() - 0.5) > 0 ? 1 : -1;

	}

	void remove() {
		board[x][y] = ' ';
	}

	void update() { // monster�� ��ġ ����
		board[x][y] = 'M';
	}
}

public class Mini extends Sprite {

	@Override
	void move(char c) { // board�� �����ϱ� ���� board�� Sprite �߻�Ŭ������ �����ؼ� ������ϴ� �κ�
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		User user = new User();
		Gold gold = new Gold();
		Monster monster = new Monster();

		
		for (int i = 1; i < 19; i++) {
			board[0][i] = '#';
			board[9][i] = '#';
		}
		for (int i = 0; i < 10; i++) {
			board[i][0] = '#';
			board[i][18] = '#';
		}
		int cnt = 0; // ���Ϳ� ����ڰ� �����ų� ���Ͱ� ���� ���ų� ����ڰ� ���� �� ��� cnt++�� ����
		while (true) { // �� ��� ��, �� ������ ���� ������ �ݺ����� ���ͼ� ������� ����� ����
			
			// ���ŵ� �迭 ���
			user.update();
			gold.update();
			monster.update();

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 19; j++) {
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			System.out.print("����(h), ����(j), �Ʒ���(k), ������(l): ");
			String num = sc.next();

			user.remove();
			monster.remove();
			// ��ü�� ������
			user.move(num.charAt(0));
			monster.move();
			user.update();
			monster.update();

			// ���Ϳ� ����ڰ� �����ų� ���Ͱ� ���� ���ų� ����ڰ� ���� �� ��쿡 ���ؼ� ��¹� ����
			if (user.x == monster.x && user.y == monster.y) { // ���Ϳ� ����ڰ� ������ ���
				System.out.println("Monster has got me");
				gold.remove();
				cnt++;
			} else if (monster.x == gold.x && monster.y == gold.y) { // ���Ͱ� ���� ������ ���
				System.out.println("Monster has got gold");
				gold.remove();
				cnt++;
			} else if (user.x == gold.x && user.y == gold.y) { // user�� ��尡 ������ ���
				System.out.println("I have got gold");
			} else if ((user.x == monster.x && monster.x == gold.x) && (user.y == monster.y && monster.y == gold.y)) {
				System.out.println("draw");
				gold.remove();
				cnt++;
			}
			if(cnt > 0) {
				break;
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 19; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

}
